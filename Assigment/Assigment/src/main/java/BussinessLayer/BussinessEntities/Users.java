package BussinessLayer.BussinessEntities;

public class Users {
protected String userId;
private String passWd;
private String email;
private String fullName;
private boolean isAdmin;
public Users() {
	// TODO Auto-generated constructor stub
}

public Users(String userId, String passWd, String fullName, String email, boolean isAdmin) {
	super();
	this.userId = userId;
	this.passWd = passWd;
	this.email = email;
	this.fullName = fullName;
	this.isAdmin = isAdmin;
}

public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getPassWd() {
	return passWd;
}
public void setPassWd(String passWd) {
	this.passWd = passWd;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public boolean isAdmin() {
	return isAdmin;
}
public void setAdmin(boolean isAdmin) {
	this.isAdmin = isAdmin;
}



}
