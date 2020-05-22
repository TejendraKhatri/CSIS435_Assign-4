package assign4 ;

import java.io.IOException;

import assign4.lexer.* ;
import assign4.parser.* ;
import assign4.unparser.*;
    
public class Main {

    public static void main (String[] args) {
        Lexer lexer = new Lexer() ;
        Parser parser = new Parser(lexer) ;
        Unparser unpretty = new Unparser(parser);
    }
}
