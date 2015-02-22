package CasleyTalk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	/*
	 * JDBCドライバのクラス名
	 */
	final static String DRIVER = "com.mysql.jdbc.Driver";

	/*
	 * データベースのURL
	 */
	final static String URL = "jdbc:mysql://localhost/blog";

	final static String USER = "root";
	final static String PASS = "root";

	/*
	 * Connectionを取得する
	 */
	public static Connection getConnection() throws SQLException{
		try{
			Class.forName(DRIVER);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			throw new IllegalStateException("fail to class load :" + e.getMessage());
		}

		Connection con = DriverManager.getConnection(URL, USER, PASS);

		return con;
	}
}
