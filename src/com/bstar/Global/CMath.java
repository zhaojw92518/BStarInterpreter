package com.bstar.Global;

public class CMath {
	public static int str_to_int(String in_str){
		return new Integer(in_str).intValue();
	}
	
	public static double str_to_double(String in_str){
		return new Double(in_str).doubleValue();
	}
	
	public static String double_to_str(double in_double){
		return new Double(in_double).toString();
	}
}
