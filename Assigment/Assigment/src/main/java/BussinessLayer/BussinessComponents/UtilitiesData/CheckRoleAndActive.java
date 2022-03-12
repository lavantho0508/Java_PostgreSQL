package BussinessLayer.BussinessComponents.UtilitiesData;
import BussinessLayer.BussinessEntities.*;
public class CheckRoleAndActive {
public static boolean isAdmin(Users u) {
	if(u.isAdmin())return true;
	return false;
}
public static boolean isActive(Videos v) {
	if(v.isActive())return true;
	return false;
}
}
