package lab10;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) throws SQLException {
		String dbPath = "jdbc:sqlite:" + "world.db";
		Connection con = DriverManager.getConnection(dbPath);
		int c = 0;
		int i = 1;
		String x = "" ;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter text (<=4char): ");
			String country  = sc.nextLine();
			if (country.length() >4) {
				continue;
			}else {
				
				String sql = "SELECT name FROM countries "
						+ "WHERE name LIKE ? ORDER BY name ;";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1,"%"+country);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					x = i+rs.getString("name");
					c++;
					
				}System.out.println("Found "+ c +" countries.");
				rs = pstmt.executeQuery();
				while(rs.next()) {
				System.out.println(i+". "+rs.getString("name"));
				i++;
				}sc.close();
				break;
			}
	}
		
		
	}

}
