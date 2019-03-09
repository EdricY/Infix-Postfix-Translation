import org.antlr.v4.runtime.*;
import java.io.FileInputStream;

public class TestActions {
    public static void main(String[] args) throws Exception {
        FileInputStream inputstream = new FileInputStream("inputs/test.txt");
        ANTLRInputStream input = new ANTLRInputStream(inputstream);
        Infix2PostfixLexer lexer = new Infix2PostfixLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Infix2PostfixParser parser = new Infix2PostfixParser(tokens);
        parser.start(); // parse the input stream!
    }
}
