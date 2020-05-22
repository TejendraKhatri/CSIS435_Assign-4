package assign4.parser ;

import assign4.visitor.* ;

public class AssignmentNode extends Node {

    public LiteralNode  left  ;
    public ExpressionNode expressionNode;
   // public LogicalExpressionNode expNode;

    public AssignmentNode () {
        
    }

    public void accept(ASTVisitor v) {

        v.visit(this);
    }
}
