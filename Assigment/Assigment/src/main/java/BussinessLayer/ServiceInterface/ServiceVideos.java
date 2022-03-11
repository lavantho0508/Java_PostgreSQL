package BussinessLayer.ServiceInterface;

import java.util.List;

import BussinessLayer.BussinessEntities.Videos;

public interface ServiceVideos {
	public int addToDB(Videos u);
	public int deleteToDB(String IDVideo);
	public int updateToDB(Videos u);
	public List<Videos>selectAll();
}
