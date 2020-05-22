package assign4.parser ;
import assign4.visitor.* ;
import assign4.lexer.*;

public class TypeNode extends Node {

    public Type type;

    public TypeNode () {

    }
    
    public TypeNode (Type type) {

        this.type = type;
    }

    public void accept(String v) {

        type.lexeme = v;
    }
}
