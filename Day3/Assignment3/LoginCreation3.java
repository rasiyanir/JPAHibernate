import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginCreation3 {
public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/riyaz", "root", "Riyaz@123");
			String query = "select customerId, customerName from customer where customerId = ?";
			PreparedStatement stat = conn.prepareStatement(query);
			stat.setInt(1, 12345);
			ResultSet rs = stat.executeQuery();
			if(rs.next()) {
				System.out.println("Id: " + rs.getInt(1) + " Name: " + rs.getString(2));
			}
			else {
				System.out.println("No record found!");
			}
			
			
			conn.close();
		}
		catch(Exception e) {
			System.out.println("Exception!" + e);
			
		}
	}
}
