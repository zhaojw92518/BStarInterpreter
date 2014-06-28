package Quaternion;

public enum QuaType {
	INCLUDE,
	DEFINE,
	GLOBAL_VAR_DEFINE,
	GLOBAL_VAR_TYPEDEF,
	GLOBAL_CST_DEFINE,
	LOCAL_VAR_DEFINE,
	LOCAL_VAR_TYPEDEF,
	LOCAL_CST_DEFINE,
	FUNC_DEFINE,
	FUNC_DEFINE_END,
	FUNC_DECLARE,
	FUNC_DECLARE_END,
	FUNC_ROBUST_DECLARE,
	FUNC_ROBUST_DECLARE_END;
}
