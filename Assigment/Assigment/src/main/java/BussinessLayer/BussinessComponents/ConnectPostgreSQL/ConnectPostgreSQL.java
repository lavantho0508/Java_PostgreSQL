package BussinessLayer.BussinessComponents.ConnectPostgreSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectPostgreSQL {
	private static final String DB_URL="jdbc:postgresql://localhost:5432/assigment";
	private static final String USER_NAME="postgre";
	private static final String PASS_WORD="lavantho";
	public static Connection conn=null;
	static {
		try {
			autuConnect();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void autuConnect() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgre.Driver");
		conn=DriverManager.getConnection(DB_URL,USER_NAME,PASS_WORD);
	}
	

}
