package DataAccessLayer.Service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BussinessLayer.BussinessComponents.ConnectPostgreSQL.ConnectPostgreSQL;
import BussinessLayer.BussinessEntities.Shares;
import BussinessLayer.BussinessEntities.Users;
import BussinessLayer.ServiceInterface.*;
import BussinessLayer.BussinessComponents.UtilitiesData.SHA_224;
public class SharesDAL implements ServiceShares{

	@Override
	public int addToDB(Shares s){
		try {
			String query="INSERT INTO SHARES VALUES(?,?,?,?,?)";
			PreparedStatement pre=ConnectPostgreSQL.conn.prepareStatement(query);
			pre.setLong(1, s.getId());
			pre.setString(2,s.getUserId());
			pre.setString(3,s.getIdVideo());
			pre.setString(4,s.getEmail());
			pre.setString(5, s.getDate());		
			return pre.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
  return 0;
	}

	@Override
	public int deleteToDB(String UserID,String idVideo)  {
		try {
			String query="DELETE FROM SHARES WHERE USERID=? and IDVIDEO=?";
			PreparedStatement pre=ConnectPostgreSQL.conn.prepareStatement(query);
			pre.setString(1, UserID);
			pre.setString(2, idVideo);
			return pre.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public int updateToDB(Shares s) {
		PreparedStatement pre;
		
		
		try {
			String query="UPDATE SHARES SET EMAIL=?,SHAREDATE=? WHERE IDSHARE=?";
			pre=ConnectPostgreSQL.conn.prepareStatement(query);
			pre.setString(1, s.getEmail());
			pre.setString(2,s.getDate());
			pre.setLong(3,s.getId());
			
			return pre.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public List<Shares> selectAll()  {
		List<Shares> list=new ArrayList<>();
		try {
			
			String query="SELECT*FROM SHARES";
			PreparedStatement pre=ConnectPostgreSQL.conn.prepareStatement(query);
			ResultSet rs=pre.executeQuery();
			while(rs.next()) {
				list.add(new Shares(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	
	
	
}