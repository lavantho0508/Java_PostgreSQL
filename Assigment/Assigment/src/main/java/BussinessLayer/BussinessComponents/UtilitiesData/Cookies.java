package BussinessLayer.BussinessComponents.UtilitiesData;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookies {
	public static Cookie save(String name ,String values,int hours,HttpServletResponse rep) {
		Cookie cookie=new Cookie(name, values);
		cookie.setMaxAge(hours*60*60);
		cookie.setPath("/");
		rep.addCookie(cookie);
		return cookie;
		
	}
	public static String getCookie(String name,HttpServletRequest req) {
		Cookie[]cookie=req.getCookies();
		if(cookie!=null) {
		for(Cookie c : cookie) {
			if(c.getName().equalsIgnoreCase(name)) {
				return c.getValue();
			}
		}
		}
		return null;
	}
	
}
