package Context;

import java.io.File;

public class CFileMgr {
	private static String base_dic_str = null;
	public static void set_base_dic(File in_file){
		base_dic_str = in_file.getParent();
	}
}
