package Quaternion;
import java.util.LinkedList;


public class CQuaData {
	public boolean is_id = false;
	public QuaDataType type = QuaDataType.INIT;
	public String str_data = null;
	public double value_data = 0.0;
	public LinkedList<CQuaData> list_data = null;
	
	public void add_list_data(CQuaData in_data){
		if(list_data == null){
			list_data = new LinkedList<>();
		}
		list_data.add(in_data);
	}
}
