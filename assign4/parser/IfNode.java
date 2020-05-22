package assign4.parser ;

import assign4.visitor.* ;

public class IfNode extends Node {
    public BlockNode ifBlock;
    public LogicalExpressionNode logicalExpr;
    public BlockNode elseBlock;
    public IfNode () {
        
    }

    public void accept(ASTVisitor v) {

        v.visit(this);
    }
}
