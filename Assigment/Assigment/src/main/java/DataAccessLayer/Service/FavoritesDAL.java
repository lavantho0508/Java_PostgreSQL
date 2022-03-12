package DataAccessLayer.Service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import BussinessLayer.BussinessComponents.ConnectPostgreSQL.ConnectPostgreSQL;
import BussinessLayer.BussinessEntities.Favorites;
import BussinessLayer.ServiceInterface.*;

public class FavoritesDAL implements ServiceFavorites{

	@Override
	public int addToDB(Favorites fv){
		try {
			String query="INSERT INTO FAVORITES VALUES(?,?,?,?)";
			PreparedStatement pre=ConnectPostgreSQL.conn.prepareStatement(query);
			pre.setLong(1, fv.getId());
			pre.setString(2,fv.getIdUser());
			pre.setString(3,fv.getIdVideo());
			pre.setString(4,fv.getLikeDate());
				
			return pre.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
  return 0;
	}

	@Override
	public int deleteToDB(String UserID,String IDVideo)  {
		try {
			String query="DELETE FROM FAVORITES WHERE USERID=? AND IDVIDEO=?";
			PreparedStatement pre=ConnectPostgreSQL.conn.prepareStatement(query);
			pre.setString(1, UserID);
			pre.setString(2, IDVideo);
			return pre.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public int updateToDB(Favorites fv) {
//		PreparedStatement pre;
//		
//		
//		try {
//			String query="UPDATE FAVORITES SET PASSWORD=?,EMAIL=?,FULLNAME=? WHERE USERID=?";
//			pre=ConnectPostgreSQL.conn.prepareStatement(query);
//			pre.setString(1, u.getPassWd());
//			pre.setString(2,u.getEmail());
//			pre.setString(3,u.getFullName());
//			pre.setString(4, u.getUserId());
//			return pre.executeUpdate();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		return 0;
	}

	@Override
	public List<Favorites> selectAll()  {
		List<Favorites> list=new ArrayList<>();
		try {
			
			String query="SELECT*FROM FAVORITES";
			PreparedStatement pre=ConnectPostgreSQL.conn.prepareStatement(query);
			ResultSet rs=pre.executeQuery();
			while(rs.next()) {
				list.add(new Favorites(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	
	
	
}