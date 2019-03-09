import com.sun.istack.internal.NotNull;
import com.sun.javafx.css.CssError;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;

/**
 * Created by Edric on 3/3/2019.
 */
public class PostfixConverter extends InfixBaseListener  {
    CommonTokenStream tokens;
    Hashtable<String, Integer> symbols;
    boolean first;

    public PostfixConverter(CommonTokenStream tokens) {
        this.tokens = tokens;
        symbols = new Hashtable<>();
        first = true;

    }

    @Override
    public void exitStart(InfixParser.StartContext ctx) {
        printSymbols();
    }

    @Override
    public void enterList(InfixParser.ListContext ctx) {
        if (!first) {
            System.out.println(";");
        }
        first = false;
    }

    @Override
    public void exitTerm(InfixParser.TermContext ctx) {
        InfixParser.TermsContext parent;
        try {
            parent = (InfixParser.TermsContext) ctx.parent;
        } catch (java.lang.ClassCastException e) {
            parent = null;
        }
        if (parent != null) {
            System.out.print(parent.ADDOP().getText() + " ");
        }
    }

    @Override
    public void exitFactor(InfixParser.FactorContext ctx) {
        InfixParser.FactorsContext parent;
        try {
            parent = (InfixParser.FactorsContext) ctx.parent;
        } catch (java.lang.ClassCastException e) {
            parent = null;
        }
        if (parent != null) {
            System.out.print(parent.MULOP().getText() + " ");
        }
    }

    @Override
    public void exitIdentifier(InfixParser.IdentifierContext ctx) {
        String sym = ctx.getText();
        System.out.print(sym + " ");
        if (!symbols.containsKey(sym)) {
            int line = getLine(ctx);
            symbols.put(sym, line);
        }
    }

    @Override
    public void exitNumber(InfixParser.NumberContext ctx) {
        String num = ctx.getText();
        System.out.print(num + " ");
    }

    private void printSymbols() {
        System.out.println("symbol table (symbol:line)");
        for (String sym : symbols.keySet()) {
            int line = symbols.get(sym);
            System.out.print(sym + ":" + line + " ");
        }

    }

    private int getLine(ParserRuleContext prc) {
        return tokens.get(prc.getSourceInterval().a).getLine();
    }

    public static void main(String[] args) throws Exception {
        FileInputStream inputstream = new FileInputStream("inputs/test.txt");
        ANTLRInputStream input = new ANTLRInputStream(inputstream);
        InfixLexer lexer  = new InfixLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InfixParser parser = new InfixParser(tokens);

        PostfixConverter converter = new PostfixConverter(tokens);
        parser.addParseListener(converter);

        parser.start();
    }
}
