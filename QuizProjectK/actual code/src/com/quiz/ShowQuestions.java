package com.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.databaseconnection.DBConnection;


public class ShowQuestions {
	static Connection con=DBConnection.getDBConnection();
	static PreparedStatement pst=null;
	static ResultSet rst=null;
	static int count=0,tempId=0,j=1;
	static int index=0;
	static int marks=0;



	public static  void showQuestions(ArrayList al,int id) {
		int checkAnswer=0;
		Scanner sc=new Scanner(System.in);


		try {
			pst=con.prepareStatement("Select questions,answer from questionset where qid='"+al.get(index)+"'  ");

			rst=pst.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}	



		String s="";
		try {
			while (rst.next()) {
				s = rst.getString(1);

				checkAnswer=rst.getInt(2);
			} 
		}catch (SQLException e) {
			e.printStackTrace();
		}


		//print questions
		String [] s1=s.split(",");
		System.out.print("        "+(j)+"]");
		j++;
		for(int i=0;i<s1.length;i++) {

			System.out.println(s1[i]);
			System.out.println("\t");
			System.out.print("\t");
		}


		//remove first random number from  arraylist
		al.remove(index);

		//enter answer choice
		int ans=sc.nextInt();
		System.out.println();

		if(ans==checkAnswer) {
			marks++;
		}

		if(count<9) {
			count++;
			showQuestions(al,id);

		}

		//insert marks into table
		if(id!=tempId) {
			System.out.println("Your Score is "+marks);
			try {
				pst=con.prepareStatement("insert into marks values (?,?,?)");

				pst.setInt(1,id);
				pst.setInt(2,marks);
				if(marks>=8) {
					pst.setString(3, "Class A");
				}
				else if(marks>=6&&marks<8) {
					pst.setString(3, "Class B");
				}
				else if(marks==5) {
					pst.setString(3, "Class C");
				}
				else {
					pst.setString(3, "Class D");
				}



				boolean rs=pst.execute();


			} catch (SQLException e) {
				e.printStackTrace();
			}
			tempId=id;

		}



		count=0;
		marks=0;
		j=1;
	}





}
