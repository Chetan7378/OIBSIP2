package My_Pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	static Connection connect(){
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reservation","root","");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return (con);
		
	}

}
