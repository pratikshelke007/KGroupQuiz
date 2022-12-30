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

			System.out.println("\n\t-----Choose an option------\n\t1.Play quiz\n\t2.Display marks of all students \n\t3.Display marks by student id\n\t4.Exit\n");

			try {

				System.out.print("\t");
				choice=sc.nextInt();

			}catch(InputMismatchException e) {

				System.out.println("Please select choice from (1-4) ");
				choice=4;

			}

			switch(choice) {

			case 1: 

				System.out.println("\tRegister Student details :-");
				System.out.println("\n\tEnter First Name");
				System.out.print("\t");
				String fname=sc.next();
				System.out.println("\tEnter Last Name");
				System.out.print("\t");
				String lname=sc.next();
				System.out.println("\tEnter Student Id");
				System.out.print("\t");
				int id=sc.nextInt();


				studArrayList.add(new Student(fname, lname, id));


				System.out.println();

				InsertStudent.insertStudentRecord(studArrayList);



				//random number generator
				int min = 1;  
				int max = 10;  
				LinkedHashSet set=new LinkedHashSet<>();

				while(set.size()!=10) {
					int b = (int)(Math.random()*(max-min+1)+min); 
					set.add(b);
				}


				ArrayList al=new ArrayList<>();
				al.addAll(set);

				//quiz code
				System.out.println("\n\tQuiz Started!!\n");
				ShowQuestions.showQuestions(al,id);



				break;

			case 2:
				System.out.println("\n\tDisplay marks of all students");
				DisplayMarks.showStudentInfo();

				break;

			case 3: 
				System.out.println("\n\tDisplay marks of students by id");

				DisplayMarks.showStudentInfoById();
				break;

			case 4://exit
				System.out.println("\tThanks for Playing!!");
				break;

			default :
				System.out.println("\n\tPlease enter appropriate choice!!\n");
				break;

			}


		}


		sc.close();

	}


}
