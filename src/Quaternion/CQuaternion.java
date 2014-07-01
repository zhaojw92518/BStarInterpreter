package Quaternion;

public class CQuaternion {
	public QuaType type = null;
	public CQuaData data_0 = null, data_1 = null, data_2 = null;
	
	public void run(){
		
	}
	
	public QuaType get_type(){
		return type;
	}
	
	public String toString(){
		return type + " " + data_0 + " " + data_1 + " " + data_2;
	}
	
	private String get_single_table_str(String in_str){
		String return_result = null;
		//打表表格宽度
		int table_width = 20;
		if(in_str.length() > table_width){
			return_result = in_str.substring(0, table_width - 1);
		}
		else{
			return_result = in_str;
			return_result += blank_str.substring(0, table_width - in_str.length() - 1);
		}
		return return_result;
	}
	
	private static final String blank_str = "                    ";
	private String get_data_str(CQuaData in_data){
		if(in_data == null){
			return blank_str;
		}
		else{
			return get_single_table_str(in_data.toString());
		}
	}
	
	public String to_table_str(){
		String return_result = get_single_table_str(type.toString());
		get_data_str(data_0);
		get_data_str(data_1);
		get_data_str(data_2);
		return return_result;
	}
}
