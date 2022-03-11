package DataAccessLayer.Service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import BussinessLayer.BussinessComponents.ConnectPostgreSQL.ConnectPostgreSQL;
import BussinessLayer.BussinessEntities.Users;
import BussinessLayer.ServiceInterface.*;
class UsersDAL implements ServiceUsers{

	@Override
	public int addToDB(Users u){
		try {
			String query="INSERT INTO USERS VALUES(?,?,?,?,?)";
			PreparedStatement pre=ConnectPostgreSQL.conn.prepareStatement(query);
			pre.setString(1, u.getUserId());
			pre.setString(2,u.getPassWd());
			pre.setString(3,u.getEmail());
			pre.setString(4,u.getFullName());
			pre.setBoolean(5, u.isAdmin());		
			return pre.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
  return 0;
	}

	@Override
	public int deleteToDB(String UserID)  {
		try {
			String query="DELETE FROM USERS WHERE USERID=?";
			PreparedStatement pre=ConnectPostgreSQL.conn.prepareStatement(query);
			pre.setString(1, UserID);
			return pre.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public int updateToDB(Users u) {
		PreparedStatement pre;
		
		
		try {
			String query="UPDATE USERS SET PASSWORD=?,EMAIL=?,FULLNAME=? WHERE USERID=?";
			pre=ConnectPostgreSQL.conn.prepareStatement(query);
			pre.setString(1, u.getPassWd());
			pre.setString(2,u.getEmail());
			pre.setString(3,u.getFullName());
			pre.setString(4, u.getUserId());
			return pre.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	@Override
	public List<Users> selectAll()  {
		List<Users> list=new ArrayList<Users>();
		try {
			
			String query="SELECT*FROM USERS";
			PreparedStatement pre=ConnectPostgreSQL.conn.prepareStatement(query);
			ResultSet rs=pre.executeQuery();
			while(rs.next()) {
				list.add(new Users(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
}