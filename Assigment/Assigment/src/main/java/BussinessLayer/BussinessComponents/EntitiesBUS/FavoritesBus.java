package BussinessLayer.BussinessComponents.EntitiesBUS;
import java.util.List;

import BussinessLayer.BussinessEntities.Favorites;
import BussinessLayer.ServiceInterface.*;
import DataAccessLayer.Service.FavoritesDAL;
public class FavoritesBus implements ServiceFavorites{
FavoritesDAL fvr=new FavoritesDAL();
	@Override
	public int addToDB(Favorites fv) {
	return fvr.addToDB(fv);
	}

	@Override
	public int deleteToDB(String userID, String videoID) {
		return fvr.deleteToDB(userID, videoID);
	}

	@Override
	public int updateToDB(Favorites fv) {
	return fvr.updateToDB(fv);
	}

	@Override
	public List<Favorites> selectAll() {
	return fvr.selectAll();
	}

}
