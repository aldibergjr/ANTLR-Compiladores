package br.ufpe.cin.if688.minijava.visitor;
import br.ufpe.cin.if688.minijava.ast.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import br.ufpe.cin.if688.minijava.ANTLR.gParser;
import br.ufpe.cin.if688.minijava.ANTLR.gParser.GoalContext;
import br.ufpe.cin.if688.minijava.ANTLR.gVisitor;
import static java.lang.Integer.parseInt;
public class MiniJVisitor implements gVisitor<Program>{
		private Program currentProgram;
	    private MainClass currentMain;
	    private ClassDecl currentClass;
	    private Identifier currentIdentifier;
	    private String currentSymbol;
	    private Type currentType;
	    private MethodDecl currentMethod;
	    private Exp currentExp;
	    private Statement currentStatement;
	    private ExpList currentExpList;
	    private VarDecl currentVarDeclaration;
		@Override
		public Program visit(ParseTree tree) {
			tree.accept(this);
	        return currentProgram;
		}
		@Override
		public Program visitChildren(RuleNode node) {
			System.out.println(node);
	        return node.accept(this);
		}
		@Override
		public Program visitTerminal(TerminalNode node) {
			System.out.println(node);
	        return node.accept(this);
		}
		@Override
		public Program visitErrorNode(ErrorNode node) {
			currentSymbol = terminalNode.getSymbol().getText();
	        return currentProgram;
		}
		@Override
		public Program visitGoal(GoalContext ctx) {
			// TODO Auto-generated method stub
			return null;
		}

}
