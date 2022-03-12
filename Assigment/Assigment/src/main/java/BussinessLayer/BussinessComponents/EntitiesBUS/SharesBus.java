package BussinessLayer.BussinessComponents.EntitiesBUS;
import java.util.List;

import BussinessLayer.BussinessEntities.Shares;
import BussinessLayer.ServiceInterface.ServiceShares;
import DataAccessLayer.Service.*;
public class SharesBus implements ServiceShares{
 SharesDAL sh=new SharesDAL();
	@Override
	public int addToDB(Shares u) {
		return sh.addToDB(u);
	}

	@Override
	public int deleteToDB(String UserID, String VideoID) {
	    return sh.deleteToDB(UserID, VideoID);
	}

	@Override
	public int updateToDB(Shares u) {
	return sh.updateToDB(u);
	}

	@Override
	public List<Shares> selectAll() {
		return sh.selectAll();
	}

}
