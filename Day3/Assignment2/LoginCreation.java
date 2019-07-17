import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class LoginCreation {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/riyaz", "root", "Riyaz@123");
			Statement stat = conn.createStatement();
			String query = "insert into user values('Jason Jr.', 'pass');";
			stat.executeUpdate(query);
			System.out.println("Insertion Successful");
			
			
			conn.close();
		}
		catch(Exception e) {
			System.out.println("Exception occured"
					+ "exception:Exception" + e);
			
		}
	}
}
