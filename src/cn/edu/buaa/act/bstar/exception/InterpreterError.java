package cn.edu.buaa.act.bstar.exception;

import cn.edu.buaa.act.bstar.global.CGlobalDef;

public class InterpreterError extends Exception {
	private String error_str = null;
	
	public InterpreterError(String in_str){
		super();
		error_str = in_str;
	}
	
	public void print_error(){
		CGlobalDef.cout_end(error_str);
	}
}
