package com.quiz;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class MainQuiz {

	public static void main(String[] args) {

		ArrayList<Student> studArrayList=new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		Integer choice=0;

		while(choice!=4) {
			
			System.out.println("\n-----Choose an option------\n1.Play quiz\n2.Display marks of all students \n3.Display marks by student id\n4.Exit\n");
			
			try {
				
			choice=sc.nextInt();
			
			}catch(InputMismatchException e) {
				
				System.out.println("Please select choice from (1-4) ");
				choice=4;
				
			}
			
			switch(choice) {

			case 1: 
				
				System.out.println("Register Student details :");
				System.out.println("Enter FirstName");
				String fname=sc.next();
				System.out.println("Enter Lastname");
				String lname=sc.next();
				System.out.println("Enter StudentId");
				int id=sc.nextInt();

				
				studArrayList.add(new Student(fname, lname, id));

				
				System.out.println();
				
				InsertStudent.insertStudentRecord(studArrayList);
				
				
				
				//quiz code
				int min = 1;  
				int max = 10;  
				LinkedHashSet set=new LinkedHashSet<>();
				  				
				while(set.size()!=10) {
					int b = (int)(Math.random()*(max-min+1)+min); 
					set.add(b);
				}
				
				
				ArrayList al=new ArrayList<>();
				al.addAll(set);
			  
				ShowQuestions.showQuestions(al,id);
				
				
				
				break;

			case 2:
				System.out.println("Display marks of all students");
				DisplayInfo.showStudentInfo();

				break;

			case 3: 
				System.out.println("Display marks of students by id");

				DisplayInfo.showStudentInfoById();
				break;

			case 4://exit
				System.out.println("Thanks for Playing!!");
				break;

			default :
				System.out.println("\nPlease enter apprpriate choice!!\n");
				break;

			}


		}

		
		sc.close();

	}
	

}
