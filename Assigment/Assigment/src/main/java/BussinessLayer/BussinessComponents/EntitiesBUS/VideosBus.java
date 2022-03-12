package BussinessLayer.BussinessComponents.EntitiesBUS;
import java.util.List;

import BussinessLayer.BussinessEntities.Videos;
import BussinessLayer.ServiceInterface.ServiceVideos;
import DataAccessLayer.Service.*;
public class VideosBus implements ServiceVideos{
VideosDAL vd=new VideosDAL();
	@Override
	public int addToDB(Videos u) {
	return vd.addToDB(u);
	}

	@Override
	public int deleteToDB(String IDVideo) {
		return vd.deleteToDB(IDVideo);
	}

	@Override
	public int updateToDB(Videos u) {
	return vd.updateToDB(u);
	}

	@Override
	public List<Videos> selectAll() {
	return vd.selectAll();
	}

}
