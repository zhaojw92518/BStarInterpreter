package cn.edu.buaa.act.bstar.interpreter;

import cn.edu.buaa.act.bstar.context.CCodeNodeMgr;
import cn.edu.buaa.act.bstar.context.CLangVM;
import cn.edu.buaa.act.bstar.environment.BStarEnvironment;
import cn.edu.buaa.act.bstar.exception.InterpreterError;

public class BStarInterpreter {
	public static void run_bstar(String in_file_addr){
		BStarEnvironment cur_evt = new BStarEnvironment(in_file_addr);
		cur_evt.start_debug_console();
		cur_evt.generate_environment();
		try{
			CPreRunner pre_runner = new CPreRunner(
					cur_evt.get_qua_tree_root(), 
					cur_evt.get_qua_node_list());
			pre_runner.run();
			CCodeNodeMgr code_node_mgr = new CCodeNodeMgr(
					pre_runner.get_root_node(), 
					pre_runner.get_node_map());
			code_node_mgr.run();
			CLangVM.run(code_node_mgr);
		}
		catch(InterpreterError e){
			e.print_error();
		}
	}
	
	public static void main(String[] args) {
		run_bstar("bs/Test01.bs");
		//run_bstar("./ProcessManagement.bs");
	}
}
