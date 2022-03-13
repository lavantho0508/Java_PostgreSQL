package BussinessLayer.BussinessComponents.EntitiesBUS;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import BussinessLayer.BussinessEntities.Users;
import BussinessLayer.ServiceInterface.ServiceUsers;
import DataAccessLayer.Service.*;

public class UsersBus implements ServiceUsers{
  UsersDAL user=new UsersDAL();
	@Override
	public int addToDB(Users u) throws SQLException {
		return user.addToDB(u);
	}

	@Override
	public int deleteToDB(String UserID) throws SQLException {
		return user.deleteToDB(UserID);
	}

	@Override
	public int updateToDB(Users u) throws SQLException {
		return user.updateToDB(u);
	}

	@Override
	public List<Users> selectAll() throws SQLException {
		return user.selectAll();
	}

	@Override
	public Users loGin(String UserID, String Passwd) throws SQLException {
		return user.loGin(UserID, Passwd);
	}

	@Override
	public String isExist(String username) throws SQLException {
		return user.isExist(username);
	}

	@Override
	public HashMap<Object, String> sendError(String username, String passwd) throws SQLException {
	return user.sendError(username, passwd);
	}

}
