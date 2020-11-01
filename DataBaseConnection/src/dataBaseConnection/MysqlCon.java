package dataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MysqlCon {
	public static void main(String[] args) {
		try {
			Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/muzna", "root", "root");

			Statement stat = con.createStatement();
			String query = "select * from emp";

			ResultSet result = stat.executeQuery(query);
			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getInt(3));

			}
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
