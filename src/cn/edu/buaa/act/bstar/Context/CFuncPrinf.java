package cn.edu.buaa.act.bstar.context;

public class CFuncPrinf implements CSystemFunc {

	@Override
	public CDataEntity run() {
		System.out.print(CLangVM.get_front_para().value_data);
		return null;
	}

}
