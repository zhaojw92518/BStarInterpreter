package com.bstar.Global;

public class CGlobalDef {
	public static final String endl = System.getProperty("line.separator");
	
	public static void cout_end(String in_str){
		System.out.println(in_str);
	}
	
	public static void cout_end(int in_value){
		System.out.println(in_value);
	}
	
	public static void cout(String in_str){
		System.out.print(in_str);
	}
	
	public static void cout_dividing_line(){
		System.out.println("=========================================");
	}
}
