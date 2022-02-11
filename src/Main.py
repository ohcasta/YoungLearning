import sys
from antlr4 import *
from MLGrammarLexer import MLGrammarLexer
from MLGrammarListener import MLGrammarListener
from MLGrammarParser import MLGrammarParser
from MyVisitor import MyVisitor


if __name__ == "__main__":

    with open('input/Prueba_7.txt','r') as file:
        entry = file.read()
    # lexer
    data = InputStream(entry)
    lexer = MLGrammarLexer(data)
    stream = CommonTokenStream(lexer)
    # parser
    parser = MLGrammarParser(stream)
    tree = parser.inicio()
    # evaluator
    visitor = MyVisitor()
    visitor.visit(tree)
    #print(output)