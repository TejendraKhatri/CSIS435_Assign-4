package assign4.parser ;

import assign4.visitor.* ;

public class ForUpdateExpressionNode extends Node {

    public LiteralNode  left  ;
    public BinaryExpressionNode expRight;
    public char operator;

    public ForUpdateExpressionNode () {

    }

    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
