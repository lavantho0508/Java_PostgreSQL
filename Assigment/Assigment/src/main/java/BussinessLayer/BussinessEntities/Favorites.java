package BussinessLayer.BussinessEntities;

public class Favorites extends Videos{
private long id;
private String idUser;
private String likeDate;
public Favorites() {
	
}

public Favorites(long id, String idUser, String likeDate,String idVideo) {
	super.idVideo=idVideo;
	this.id = id;
	this.idUser = idUser;
	this.likeDate = likeDate;
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getIdUser() {
	return idUser;
}
public void setIdUser(String idUser) {
	this.idUser = idUser;
}
public String getLikeDate() {
	return likeDate;
}
public void setLikeDate(String likeDate) {
	this.likeDate = likeDate;
	
}

}
