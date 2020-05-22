package assign4.parser;

import assign4.visitor.* ;
import assign4.lexer.*;

public class ExpressionNode extends Node {
    public BinaryExpressionNode expRight;
    public ValueNode valNode;
    public LogicalExpressionNode logicExpression;
    public Token[] tokenArray;
    
    public ExpressionNode () {
        
    }

    public void accept(ASTVisitor v) {

        v.visit(this);
    }
}
