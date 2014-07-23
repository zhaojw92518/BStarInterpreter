package com.bstar.Quaternion;

public enum QuaType {
	INCLUDE,
	DEFINE,
	GLO_ATTR,
	GLO_ATTR_END,
	FUNC_ATTR,
	FUNC_ATTR_END,
	VAR_DEFINE,
	VAR_TYPEDEF,
	CST_DEFINE,
	
	FUNC_DECLARE,
	FUNC_DECLARE_END,
	FUNC_ROBUST_DECLARE,
	FUNC_ROBUST_DECLARE_END,
	
	FUNC_DEFINE,
	FUNC_DEFINE_END,
	FUNC_PARA,
	RETURN,
	FUNC_CALL,
	
	MATH_ADD,
	MATH_SUB,
	MATH_MUL,
	MATH_DIV,
	MATH_MOD,
	MATH_REV,
	
	BOOL_NOT,
	
	SET_DIFFER,
	SET_INTER,
	SET_UNION;
}
