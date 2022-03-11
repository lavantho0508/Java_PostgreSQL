package BussinessLayer.BussinessEntities;

public class Videos {
protected String idVideo;
private String titile;
private String poster;
private int views;
private String Description;
private boolean isActive;
public Videos() {
	// TODO Auto-generated constructor stub
}
public Videos(String idVideo, String titile, String poster, int views, String description, boolean isActive) {
	super();
	this.idVideo = idVideo;
	this.titile = titile;
	this.poster = poster;
	this.views = views;
	Description = description;
	this.isActive = isActive;
}
public String getIdVideo() {
	return idVideo;
}
public void setIdVideo(String idVideo) {
	this.idVideo = idVideo;
}
public String getTitile() {
	return titile;
}
public void setTitile(String titile) {
	this.titile = titile;
}
public String getPoster() {
	return poster;
}
public void setPoster(String poster) {
	this.poster = poster;
}
public int getViews() {
	return views;
}
public void setViews(int views) {
	this.views = views;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}

}
