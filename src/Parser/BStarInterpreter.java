package Parser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import Context.CFileMgr;
import Global.CGlobalDef;
import PreProcessor.CPreProcessor;


public class BStarInterpreter {
	public static void write_ln(OutputStream in_stream) throws IOException {
		in_stream.write('\n');
		//in_stream.write('\r');
	}
	
	public static void test_01(){
		File file = new File("./PartitionManagement.bs");
		CFileMgr.set_base_dic(file);
		InputStream in = null;
		try {
			in = new FileInputStream(file);
			ANTLRInputStream input = new ANTLRInputStream(in);
			BStarLexer lexer = new BStarLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        BStarParser parser = new BStarParser(tokens);
	        ParseTree tree = parser.abmachine();  // parse
	        String tree_str = tree.toStringTree(parser);
	        System.out.println(tree_str);
	        File out_file = new File("./output.txt");
			try {
				OutputStream output_stream = new FileOutputStream(out_file);
				int bracket_count = 0;
				for(char cur_input: tree_str.toCharArray()){
					if(cur_input == ')'){
						--bracket_count;
						write_ln(output_stream);
						for(int i = 0; i < bracket_count; i++){
							output_stream.write(' ');
						}
						output_stream.write(')');
						write_ln(output_stream);
						for(int i = 0; i < bracket_count; i++){
							output_stream.write(' ');
						}
					}
					else if(cur_input == '('){
						write_ln(output_stream);
						for(int i = 0; i < bracket_count; i++){
							output_stream.write(' ');
						}
						output_stream.write('(');
						write_ln(output_stream);
						++bracket_count;
						for(int i = 0; i < bracket_count; i++){
							output_stream.write(' ');
						}
					}
					/*else if(cur_input == '\n'){
						write_ln(output_stream);
						for(int i = 0; i < bracket_count; i++){
							output_stream.write('\t');
						}
					}
					else if(cur_input == '\r'){
						
					}*/
					else{
						output_stream.write(cur_input);
					}
				}
				output_stream.close();
				System.out.println("Over");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return;
		}
	}
	
	public static void test_02(){
		CPreProcessor preprocessor = new CPreProcessor();
		try {
			File file = new File("./Test01.bs");
			CFileMgr.set_base_dic(file);
			preprocessor.test_run("./Test01.bs");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		test_02();
	}
}
