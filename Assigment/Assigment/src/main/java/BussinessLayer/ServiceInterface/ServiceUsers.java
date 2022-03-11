package BussinessLayer.ServiceInterface;

import java.sql.SQLException;
import java.util.List;

import BussinessLayer.BussinessEntities.Users;

public interface ServiceUsers {
public int addToDB(Users u) throws SQLException;
public int deleteToDB(String UserID) throws SQLException;
public int updateToDB(Users u) throws SQLException;
public List<Users>selectAll() throws SQLException;

}
