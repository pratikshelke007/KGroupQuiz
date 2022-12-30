package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.databaseconnection.DBConnection;

public class DisplayMarks {
	static Connection con=DBConnection.getDBConnection();
	static PreparedStatement pst=null;
	static ResultSet rs=null;

	public static void showStudentInfo() {

		String query="SELECT Student.Id,firstName,LastName,Marks,grade FROM Student inner JOIN Marks ON student.Id = Marks.stud_Id order by id;";
		try {
			pst = con.prepareStatement(query);
			rs = pst.executeQuery();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}



		System.out.println("\t------------------------------------------------------------");
		System.out.printf("\t|%5s | %-15s | %-15s| %-6s| %-6s |%n","Id","First Name","Last Name","Marks","Class");
		System.out.println("\t------------------------------------------------------------");

		try {
			while(rs.next()) {
				int Id = rs.getInt("Id");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				int marks = rs.getInt("marks");
				String grade = rs.getString("grade");


				System.out.printf("\t|%5s | %-15s | %-15s| %-6s| %-6s|%n",Id,firstName,lastName,marks,grade);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\t------------------------------------------------------------");

	}


	public static void showStudentInfoById() {



		Scanner sc =new Scanner(System.in);
		System.out.println("\tEnter the Id");
		int stid=sc.nextInt();


		String Query2="SELECT Student.Id,firstName,LastName,Marks,grade FROM Student inner JOIN Marks ON student.Id = Marks.Stud_Id where Id='"+stid+"'";

		try {
			pst = con.prepareStatement(Query2);
			//pst.setInt(1,stid);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		System.out.println("\t------------------------------------------------------------");
		System.out.printf("\t|%5s | %-15s | %-15s| %-6s| %-6s |%n","Id","First Name","Last Name","Marks","Class");
		System.out.println("\t------------------------------------------------------------");

		try {
			while(rs.next()) {
				int Id = rs.getInt("Id");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				int marks=rs.getInt("marks");
				String grade = rs.getString("grade");
				//System.out.println("| "+Id+"\t| "+firstName+"\t|   "+lastName+"\t|"+marks+"\t"+grade+"\t");
				System.out.printf("\t|%5s | %-15s | %-15s| %-6s| %-6s|%n",Id,firstName,lastName,marks,grade);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("\t------------------------------------------------------------");

	}


}




