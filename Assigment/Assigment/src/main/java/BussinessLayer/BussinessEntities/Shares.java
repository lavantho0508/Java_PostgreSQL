package BussinessLayer.BussinessEntities;

public class Shares extends Users{
private long id;
private String idVideo;
private String email;
private String date;
public Shares() {
	
}
public Shares(long id, String idVideo, String email, String date,String idUser) {
	super.userId=idUser;
	this.id = id;
	this.idVideo = idVideo;
	this.email = email;
	this.date = date;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getIdVideo() {
	return idVideo;
}
public void setIdVideo(String idVideo) {
	this.idVideo = idVideo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}


}
