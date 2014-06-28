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
		return type + "\t\t" + data_0 + "\t\t" + data_1 + "\t\t" + data_2;
	}
}
