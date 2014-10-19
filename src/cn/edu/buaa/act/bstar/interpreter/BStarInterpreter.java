package cn.edu.buaa.act.bstar.interpreter;

import cn.edu.buaa.act.bstar.environment.BStarEnvironment;

public class BStarInterpreter {
	public static void run_bstar(String in_file_addr){
		BStarEnvironment cur_evt = new BStarEnvironment(in_file_addr);
		cur_evt.start_debug_console();
		cur_evt.generate_environment();
	}
	
	public static void main(String[] args) {
		run_bstar("bs/Test01.bs");
		System.out.println("HelloWorld!");
	}
}
