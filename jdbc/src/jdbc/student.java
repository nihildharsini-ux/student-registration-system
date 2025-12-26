
	package jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;
	
	public class student{

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","nihil0909");
			System.out.println("connection established");
			
		    String studentname;
			int rollnumber;
			String department;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter studentname:");
			studentname=sc.next();
			System.out.println("enter rollnumber:");
			rollnumber=sc.nextInt();
			System.out.println("enter department:");
			department=sc.next();
			
			PreparedStatement ps=con.prepareStatement("insert into studentdetails values(?,?,?)");
			ps.setString(1,studentname);
			ps.setInt(2,rollnumber);
			ps.setString(3,department);
			ps.executeUpdate();
		
				System.out.println("student registered successfully!");
				
			}
			
			
			

}





