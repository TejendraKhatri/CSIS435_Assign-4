package assign4.parser ;
import java.util.*;

import assign4.parser.DeclarationNode;
import assign4.visitor.* ;

public class BlockNode extends Node {

    // public Vector<DeclarationNode> decls = new Vector<DeclarationNode>();
    // public Vector<StatementNode> stmts = new Vector<StatementNode>();

    public DeclarationNode[] decls;
    public StatementNode[] stmts;

    public BlockNode () {
            decls = new DeclarationNode[10000];
            stmts = new StatementNode[10000];
    }

    public void accept(ASTVisitor v) {

        v.visit(this);
    }
}
