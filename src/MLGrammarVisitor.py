# Generated from MLGrammar.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .MLGrammarParser import MLGrammarParser
else:
    from MLGrammarParser import MLGrammarParser

# This class defines a complete generic visitor for a parse tree produced by MLGrammarParser.

class MLGrammarVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MLGrammarParser#inicio.
    def visitInicio(self, ctx:MLGrammarParser.InicioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#comandos.
    def visitComandos(self, ctx:MLGrammarParser.ComandosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#leer.
    def visitLeer(self, ctx:MLGrammarParser.LeerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#aleatorio.
    def visitAleatorio(self, ctx:MLGrammarParser.AleatorioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#tipos.
    def visitTipos(self, ctx:MLGrammarParser.TiposContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#mostrar.
    def visitMostrar(self, ctx:MLGrammarParser.MostrarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#indice.
    def visitIndice(self, ctx:MLGrammarParser.IndiceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#defmodelo.
    def visitDefmodelo(self, ctx:MLGrammarParser.DefmodeloContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#modelos.
    def visitModelos(self, ctx:MLGrammarParser.ModelosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#entrenar.
    def visitEntrenar(self, ctx:MLGrammarParser.EntrenarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#predecir.
    def visitPredecir(self, ctx:MLGrammarParser.PredecirContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#efectividad.
    def visitEfectividad(self, ctx:MLGrammarParser.EfectividadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#grafica.
    def visitGrafica(self, ctx:MLGrammarParser.GraficaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#manual.
    def visitManual(self, ctx:MLGrammarParser.ManualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#ayudas.
    def visitAyudas(self, ctx:MLGrammarParser.AyudasContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#matriz.
    def visitMatriz(self, ctx:MLGrammarParser.MatrizContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#verarbol.
    def visitVerarbol(self, ctx:MLGrammarParser.VerarbolContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#dividir.
    def visitDividir(self, ctx:MLGrammarParser.DividirContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#dividirh.
    def visitDividirh(self, ctx:MLGrammarParser.DividirhContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MLGrammarParser#preparar.
    def visitPreparar(self, ctx:MLGrammarParser.PrepararContext):
        return self.visitChildren(ctx)



del MLGrammarParser