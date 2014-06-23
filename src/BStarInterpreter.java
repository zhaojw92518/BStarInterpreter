import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class BStarInterpreter {

	public static void main(String[] args) {
		File file = new File("./PartitionManagement.bs");
		InputStream in = null;
		try {
			in = new FileInputStream(file);
			ANTLRInputStream input = new ANTLRInputStream(in);
			BStarLexer lexer = new BStarLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        BStarParser parser = new BStarParser(tokens);
	        ParseTree tree = parser.abmachine();  // parse
	        
	        System.out.println(tree.toStringTree(parser));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return;
		}
	}

}
