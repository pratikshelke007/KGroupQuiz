package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import com.databaseconnection.DBConnection;

public class InsertStudent {


	public static void insertStudentRecord(ArrayList list) {
		Connection con=DBConnection.getDBConnection();
		PreparedStatement pst=null;
		Student s=new Student();

		for(int i=0;i<list.size();i++) {

			s=(Student) list.get(i);
			//System.out.println("sid="+s.id);
			try {
				pst=con.prepareStatement("insert into student values(?,?,?)");
				pst.setInt(1, s.id);
				pst.setString(2, s.firstName);
				pst.setString(3,s.lastName);
				int rst=pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}

		list.removeAll(list);
		System.out.println("\t"+"Student Registered Sucessfully!\n");
	}





}
