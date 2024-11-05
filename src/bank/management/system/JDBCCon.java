package bank.management.system;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCCon {
	Connection connection;
	Statement statement;

	public JDBCCon() {
		
		try {
		String	username = "root";
		String	password = "Bujji@9887";
		connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem",username,password);
		statement = connection.createStatement();
		 
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
