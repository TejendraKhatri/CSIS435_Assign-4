package assign4.parser;

import assign4.parser.StatementNode;
import assign4.visitor.* ;

public class ForNode extends Node {
    public BlockNode forBlock;
    public LogicalExpressionNode logicalExpr;
    public AssignmentNode initializer;
    public ForUpdateExpressionNode updater;
    public ForNode () {
        
    }

    public void accept(ASTVisitor v) {

        v.visit(this);
    }
}
