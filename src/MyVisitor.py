from MLGrammarVisitor import MLGrammarVisitor
from MLGrammarParser import MLGrammarParser
import pandas as pd
from sklearn.linear_model import LogisticRegression
from sklearn.neighbors import KNeighborsClassifier
from sklearn.naive_bayes import GaussianNB
from sklearn.svm import NuSVC
from sklearn.tree import DecisionTreeClassifier, plot_tree
from sklearn.ensemble import RandomForestClassifier
from sklearn.datasets import make_blobs, make_moons, make_circles
from sklearn.metrics import plot_confusion_matrix
import numpy as np
import pylab as pl
import matplotlib.pyplot as plt
from DataFrameViewer import DataFrameApp
from mlxtend.plotting import plot_decision_regions
from sklearn.model_selection import train_test_split

def plot_data(X, y):
    y_unique = np.unique(y)
    colors = pl.cm.rainbow(np.linspace(0.0, 1.0, y_unique.size))
    for this_y, col in zip(y_unique, colors):
        this_X = X[y == this_y]
        pl.scatter(this_X[:, 0], this_X[:, 1],  color=col,
                    alpha=0.5, edgecolor='k',
                    label="Class %s" % this_y)
    pl.legend(loc="best")
    pl.title("Data")
    pl.show()


def plot_decision_region(X, pred_fun):
    #print(X.shape)
    min_x = np.min(X[:, 0])
    max_x = np.max(X[:, 0])
    min_y = np.min(X[:, 1])
    max_y = np.max(X[:, 1])
    min_x = min_x - (max_x - min_x) * 0.05
    max_x = max_x + (max_x - min_x) * 0.05
    min_y = min_y - (max_y - min_y) * 0.05
    max_y = max_y + (max_y - min_y) * 0.05
    x_vals = np.linspace(min_x, max_x, 100)
    y_vals = np.linspace(min_y, max_y, 100)
    XX, YY = np.meshgrid(x_vals, y_vals)
    grid_r, grid_c = XX.shape
    ZZ = np.zeros((grid_r, grid_c))
    for i in range(grid_r):
        for j in range(grid_c):
            ZZ[i, j] = pred_fun(XX[i, j], YY[i, j])
    pl.contourf(XX, YY, ZZ, 100, cmap = pl.cm.coolwarm, vmin= -1, vmax=2)
    pl.colorbar()
    pl.xlabel("x")
    pl.ylabel("y")


def gen_pred_fun(clf):
    def pred_fun(x1, x2):
        x = np.array([[x1, x2]])
        return clf.predict(x)[0]
    return pred_fun


class MyVisitor(MLGrammarVisitor):

    def __init__(self):
        self.variables = {}

    def errorvar(self, id):
    
        print("<Error: " + str(id.getSymbol().line) + ", " + str(id.getSymbol().column+1) + "> La variable " + id.getText() + " no ha sido definida")
        exit()
    
    def visitInicio(self, ctx:MLGrammarParser.InicioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#comandos.
    def visitComandos(self, ctx:MLGrammarParser.ComandosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#leer.
    def visitLeer(self, ctx:MLGrammarParser.LeerContext):

        self.variables[ctx.ID().getText()] = pd.read_csv(ctx.CADENA().getText()[1:-1])

    # Visit a parse tree produced by MLGrammarParser#aleatorio.
    def visitAleatorio(self, ctx:MLGrammarParser.AleatorioContext):

        tipo = self.visitTipos(ctx.tipos())

        if tipo == "moons":
            data, target = make_moons(n_samples=int(ctx.ENTERO().getText()), noise=0.3)
        elif tipo == "circles":
            data, target = make_circles(n_samples=int(ctx.ENTERO().getText()), noise=0.3)
        elif tipo == "blobs":

            if ctx.tipos().ENTERO() != None:
                data, target = make_blobs(n_samples=int(ctx.ENTERO().getText()), centers=int(ctx.tipos().ENTERO().getText()), n_features=2)
            else:
                data, target = make_blobs(n_samples=int(ctx.ENTERO().getText()), centers=2, n_features=2)

        self.variables[ctx.ID(0).getText()] = data
        self.variables[ctx.ID(1).getText()] = target

    # Visit a parse tree produced by MLGrammarParser#tipos.
    def visitTipos(self, ctx:MLGrammarParser.TiposContext):

        if ctx.LUNAS() != None:
            return "moons"
        elif ctx.CIRCULOS() != None:
            return "circles"
        elif ctx.GOTAS() != None:
            return "blobs"

    # Visit a parse tree produced by MLGrammarParser#mostrar.
    def visitMostrar(self, ctx:MLGrammarParser.MostrarContext):

        try:
            self.variables[ctx.ID().getText()]
        except KeyError:
            self.errorvar(ctx.ID())

        number = self.visitIndice(ctx.indice())
        data = pd.DataFrame(self.variables[ctx.ID().getText()])

        if number != None:
            app = DataFrameApp(df=data.head(number))
        else:
            app = DataFrameApp(df=data)

        app.mainloop()


    # Visit a parse tree produced by MLGrammarParser#indice.
    def visitIndice(self, ctx:MLGrammarParser.IndiceContext):

        if ctx.ENTERO() != None:
            return int(ctx.ENTERO().getText())
        else:
            return None


    # Visit a parse tree produced by MLGrammarParser#defmodelo.
    def visitDefmodelo(self, ctx:MLGrammarParser.DefmodeloContext):

        model = self.visitModelos(ctx.modelos())
        id = ctx.ID().getText()

        if model == "bayes":
            self.variables[id] = GaussianNB()
            
        elif model == "knn":
            self.variables[id] = KNeighborsClassifier()

        elif model == "regresion":
            self.variables[id] = LogisticRegression()

        elif model == "svm":
            self.variables[id] = NuSVC()

        elif model == "forest":
            self.variables[id] = RandomForestClassifier()

        elif model == "tree":
            self.variables[id] = DecisionTreeClassifier()


    # Visit a parse tree produced by MLGrammarParser#modelos.
    def visitModelos(self, ctx:MLGrammarParser.ModelosContext):

        if ctx.BAYES() != None:
            return "bayes"
        
        elif ctx.KNN() != None:
            return "knn"

        elif ctx.REGRESION() != None:
            return "regresion"

        elif ctx.SVM() != None:
            return "svm"

        elif ctx.BOSQUE() != None:
            return "forest"

        elif ctx.ARBOL() != None:
            return "tree"


    # Visit a parse tree produced by MLGrammarParser#entrenar.
    def visitEntrenar(self, ctx:MLGrammarParser.EntrenarContext):

        try:
            self.variables[ctx.ID(0).getText()]
        except KeyError:
            self.errorvar(ctx.ID(0))

        try:
            self.variables[ctx.ID(1).getText()]
        except KeyError:
            self.errorvar(ctx.ID(1))

        try:
            self.variables[ctx.ID(2).getText()]
        except KeyError:
            self.errorvar(ctx.ID(2))


        self.variables[ctx.ID(0).getText()].fit(self.variables[ctx.ID(1).getText()], self.variables[ctx.ID(2).getText()])


    # Visit a parse tree produced by MLGrammarParser#predecir.
    def visitPredecir(self, ctx:MLGrammarParser.PredecirContext):

        try:
            self.variables[ctx.ID(1).getText()]
        except KeyError:
            self.errorvar(ctx.ID(1))
        try:
            self.variables[ctx.ID(2).getText()]
        except KeyError:
            self.errorvar(ctx.ID(2))

        self.variables[ctx.ID(0).getText()] = self.variables[ctx.ID(1).getText()].predict(self.variables[ctx.ID(2).getText()])


    # Visit a parse tree produced by MLGrammarParser#efectividad.
    def visitEfectividad(self, ctx:MLGrammarParser.EfectividadContext):

        try:
            self.variables[ctx.ID(0).getText()]
        except KeyError:
            self.errorvar(ctx.ID(0))
        try:
            self.variables[ctx.ID(1).getText()]
        except KeyError:
            self.errorvar(ctx.ID(1))
        try:
            self.variables[ctx.ID(2).getText()]
        except KeyError:
            self.errorvar(ctx.ID(2))

        classifier = self.variables[ctx.ID(0).getText()]
        X = self.variables[ctx.ID(1).getText()]
        y = self.variables[ctx.ID(2).getText()]
        
        print("\n----------------------------------------------------------------\n")
        print("Efectividad del clasificador: " + ctx.ID(0).getText() + "\n")

        score = classifier.score(X, y)

        print("Porcentaje de acierto: " + str(score*100) + "%")
        print("Porcentaje de error: " + str((1-score)*100) + "%")

        print("\n----------------------------------------------------------------\n")


    # Visit a parse tree produced by MLGrammarParser#grafica.
    def visitGrafica(self, ctx:MLGrammarParser.GraficaContext):

        try:
            self.variables[ctx.ID(0).getText()]
        except KeyError:
            self.errorvar(ctx.ID(0))
        try:
            self.variables[ctx.ID(1).getText()]
        except KeyError:
            self.errorvar(ctx.ID(1))
        try:
            self.variables[ctx.ID(2).getText()]
        except KeyError:
            self.errorvar(ctx.ID(2))

        X = self.variables[ctx.ID(1).getText()]
        y = self.variables[ctx.ID(2).getText()]

        plot_decision_regions(X, y, self.variables[ctx.ID(0).getText()])
        plt.show()

    # Visit a parse tree produced by MLGrammarParser#manual.
    def visitManual(self, ctx:MLGrammarParser.ManualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#ayudas.
    def visitAyudas(self, ctx:MLGrammarParser.AyudasContext):
        return self.visitChildren(ctx)

    # Visit a parse tree produced by MLGrammarParser#matriz.
    def visitMatriz(self, ctx:MLGrammarParser.MatrizContext):

        try:
            self.variables[ctx.ID(0).getText()]
        except KeyError:
            self.errorvar(ctx.ID(0))
        try:
            self.variables[ctx.ID(1).getText()]
        except KeyError:
            self.errorvar(ctx.ID(1))
        try:
            self.variables[ctx.ID(2).getText()]
        except KeyError:
            self.errorvar(ctx.ID(2))

        plot_confusion_matrix(self.variables[ctx.ID(0).getText()], self.variables[ctx.ID(1).getText()], self.variables[ctx.ID(2).getText()])
        plt.show()

    # Visit a parse tree produced by MLGrammarParser#verarbol.
    def visitVerarbol(self, ctx:MLGrammarParser.VerarbolContext):

        try:
            self.variables[ctx.ID().getText()]
        except KeyError:
            self.errorvar(ctx.ID())

        if not isinstance(self.variables[ctx.ID().getText()], DecisionTreeClassifier):
            print("<Error: " + str(ctx.ID().getSymbol().line) + ", " + str(ctx.ID().getSymbol().column+1) + "> La variable " + ctx.ID().getText() + " no es un clasificador Arbol de desición")
            exit()

        fig = plt.figure(figsize=(8,6))
        _ = plot_tree(self.variables[ctx.ID().getText()], 
                   filled=True)
        plt.show()

    # Visit a parse tree produced by MLGrammarParser#dividir.
    def visitDividir(self, ctx:MLGrammarParser.DividirContext):

        dataFrame = self.visitDividirh(ctx.dividirh())


        if ctx.dividirh().ID() != None:

            try:
                self.variables[dataFrame]
            except KeyError:
                self.errorvar(ctx.dividirh().ID())

            self.variables[ctx.ID(0).getText()] = pd.DataFrame(self.variables[dataFrame]).iloc[:, :-1]
            self.variables[ctx.ID(1).getText()] = pd.DataFrame(self.variables[dataFrame]).iloc[:, -1]

        elif ctx.dividirh().CADENA() != None:
            arch = pd.read_csv(dataFrame)
            self.variables[ctx.ID(0).getText()] = arch.iloc[:, :-1]
            self.variables[ctx.ID(1).getText()] = arch.iloc[:, -1]



    # Visit a parse tree produced by MLGrammarParser#dividirh.
    def visitDividirh(self, ctx:MLGrammarParser.DividirhContext):
        
        if ctx.ID() != None:
            return ctx.ID().getText()

        elif ctx.CADENA() != None:
            return ctx.CADENA().getText()[1:-1]

    # Visit a parse tree produced by MLGrammarParser#preparar.
    def visitPreparar(self, ctx:MLGrammarParser.PrepararContext):

        try:
            self.variables[ctx.ID(4).getText()]
        except KeyError:
            self.errorvar(ctx.ID(4))
        try:
            self.variables[ctx.ID(5).getText()]
        except KeyError:
            self.errorvar(ctx.ID(5))

        self.variables[ctx.ID(0).getText()], self.variables[ctx.ID(1).getText()], self.variables[ctx.ID(2).getText()], self.variables[ctx.ID(3).getText()] = train_test_split(self.variables[ctx.ID(4).getText()], self.variables[ctx.ID(5).getText()], test_size=0.33)