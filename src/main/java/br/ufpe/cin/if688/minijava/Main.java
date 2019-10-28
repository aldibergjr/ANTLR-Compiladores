package br.ufpe.cin.if688.minijava;

import br.ufpe.cin.if688.minijava.ast.BooleanType;
import br.ufpe.cin.if688.minijava.ast.ClassDeclExtends;
import br.ufpe.cin.if688.minijava.ast.ClassDeclList;
import br.ufpe.cin.if688.minijava.ast.ClassDeclSimple;
import br.ufpe.cin.if688.minijava.ast.Identifier;
import br.ufpe.cin.if688.minijava.ast.IdentifierType;
import br.ufpe.cin.if688.minijava.ast.IntegerLiteral;
import br.ufpe.cin.if688.minijava.ast.IntegerType;
import br.ufpe.cin.if688.minijava.ast.MainClass;
import br.ufpe.cin.if688.minijava.ast.MethodDeclList;
import br.ufpe.cin.if688.minijava.ast.Print;
import br.ufpe.cin.if688.minijava.ast.Program;
import br.ufpe.cin.if688.minijava.ast.VarDecl;
import br.ufpe.cin.if688.minijava.ast.VarDeclList;
import br.ufpe.cin.if688.minijava.visitor.PrettyPrintVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import br.ufpe.cin.if688.minijava.ANTLR.gLexer;
import br.ufpe.cin.if688.minijava.ANTLR.gParser;
import java.io.IOException;



public class Main {

    public static void main(String[] args) throws IOException{

        CharStream charStream = CharStreams.fromStream(System.in);
        gLexer lexer = new gLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        gParser parser = new gParser(commonTokenStream);
        System.out.println(parser);
        //MiniJavaVisitor miniJava = new MiniJavaVisitor();
        //Program program = (Program) miniJava.visit(parser.program());

        //PrettyPrintVisitor printVisitor = new PrettyPrintVisitor();
        //printVisitor.visit(program);
    	//CommonTokenStream common = new CommonTokenStream();
        PrettyPrintVisitor ppv = new PrettyPrintVisitor();
        //ppv.visit(p);
    }

}