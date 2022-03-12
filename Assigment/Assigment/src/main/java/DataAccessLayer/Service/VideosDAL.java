package DataAccessLayer.Service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BussinessLayer.BussinessComponents.ConnectPostgreSQL.ConnectPostgreSQL;
import BussinessLayer.BussinessEntities.Users;
import BussinessLayer.BussinessEntities.Videos;
import BussinessLayer.ServiceInterface.*;
import BussinessLayer.BussinessComponents.UtilitiesData.SHA_224;
public class VideosDAL implements ServiceVideos{

	@Override
	public int addToDB(Videos v){
		try {
			String query="INSERT INTO VIDEOS VALUES(?,?,?,?,?,?)";
			PreparedStatement pre=ConnectPostgreSQL.conn.prepareStatement(query);
			pre.setString(1,v.getIdVideo());
			pre.setString(2,v.getTitile());
			pre.setString(3,v.getPoster());
			pre.setInt(4,v.getViews());
			pre.setString(5, v.getDescription());	
			pre.setBoolean(6, v.isActive());
			return pre.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
  return 0;
	}

	@Override
	public int deleteToDB(String idVideo)  {
		try {
			String query="DELETE FROM VIDEOS WHERE IDVIDEO=?";
			PreparedStatement pre=ConnectPostgreSQL.conn.prepareStatement(query);
			pre.setString(1, idVideo);
			return pre.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public int updateToDB(Videos v) {
		PreparedStatement pre;
		
		
		try {
			String query="UPDATE USERS SET TITILE=?,POSTER=?,VIEWER=?,DESCRIPTION=?,ACTIVE=? WHERE IDVIDEO=?";
			pre=ConnectPostgreSQL.conn.prepareStatement(query);
			pre.setString(1,v.getTitile());
			pre.setString(2,v.getPoster());
			pre.setInt(3,v.getViews());
			pre.setString(4, v.getDescription());
			pre.setBoolean(5, v.isActive());
			pre.setString(5, v.getIdVideo());
			return pre.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public List<Videos> selectAll()  {
		List<Videos> list=new ArrayList<>();
		try {
			
			String query="SELECT*FROM USERS";
			PreparedStatement pre=ConnectPostgreSQL.conn.prepareStatement(query);
			ResultSet rs=pre.executeQuery();
			while(rs.next()) {
				list.add(new Videos(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getBoolean(6)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}


	
	
}