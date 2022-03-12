package BussinessLayer.BussinessComponents.UtilitiesData;

public class checkNull {
	public static boolean checkNull(String s1) {
		if(s1.isBlank())return false;
		return true;
	}
	public static boolean checkNull(String s1,String s2) {
		if(s1.isBlank()||s2.isBlank())return false;
		return true;
	}
	public static boolean checkNull(String s1,String s2,String s3) {
		if(s1.isBlank()||s2.isBlank()||s3.isBlank())return false;
		return true;
	}
	public static boolean checkNull(String s1,String s2,String s3,String s4) {
		if(s1.isBlank()||s2.isBlank()||s3.isBlank()||s4.isBlank())return false;
		return true;
	}
	

}
