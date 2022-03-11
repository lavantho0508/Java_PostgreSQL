package BussinessLayer.ServiceInterface;

import java.util.List;

import BussinessLayer.BussinessEntities.Favorites;

public interface ServiceFavorites {
public int addToDB(Favorites fv);
public int deleteToDB(String userID,String videoID);
public int updateToDB(Favorites fv);
public List<Favorites> selectAll();
}
