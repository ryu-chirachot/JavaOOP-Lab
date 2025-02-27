package lab10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) throws SQLException {
		String dbPath = "jdbc:sqlite:" + "world.db";
		Connection con = DriverManager.getConnection(dbPath);
		int x = 0;
		String y = "";
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter capital city: ");
			String cp  = sc.nextLine();
			String sql1 =  "SELECT name FROM capitals "
					+ "WHERE name LIKE ?";
			PreparedStatement pstmt1 = con.prepareStatement(sql1);
			pstmt1.setString(1,cp);
			ResultSet rs1 = pstmt1.executeQuery();
			while(rs1.next()) {
				y += rs1.getInt("name");
			}
			if(y.length() == 0) {
				System.out.println("Invalid capital name. Country not found.");
			}
			else {
			String sql = "SELECT country_id FROM capitals "
					+ "WHERE name LIKE ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,cp);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				x += rs.getInt("country_id");
			}
			
			String sql2 = "SELECT name FROM countries "
					+ "WHERE id=?";
			PreparedStatement pstmt2 = con.prepareStatement(sql2);
			pstmt2.setInt(1,x);
			ResultSet rs2 = pstmt2.executeQuery();
			while(rs2.next()) {
				System.out.println(cp+" is the capital of "+rs2.getString("name")+".");
			}
			}
			
			
			
	
		
		
	}

}
