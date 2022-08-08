package com.nt.assesment;

import java.util.Scanner;

public class MatrixAssesment 
{
	public static void main(String[] args) 
	{
		//String array to hold first names
		String className[] = new String[5];
		//string array to hold last name
		Integer rollNum[] = new Integer[5];
		//double array to hold average
//		double average[] = new double[5];
//		//double 2 dimensional array to hold grades
		String[][] studentGrades = new String[5][3];
		//variable to hold over seventy
//		int overSeventy = 0;
		
		//scanner object
		Scanner in = new Scanner(System.in);
		
		//for loop to create array of first name and last name
		for(int i = 0; i < 5; i++)
		{
			//prompt user
			System.out.print("Enter the class name: ");
			className[i] = in.nextLine();//user input
			//prompt user
			System.out.print("Enter the roll number: ");
			rollNum[i] = in.nextInt();//user input
		}//for
		
		//Display students names
		//print underline
		System.out.println("----------------------");
		//for loop to display classname and roll num form arrays
		for(int i = 0; i < 5; i++)
		{
			// print names
			System.out.println(className[i] + " " + rollNum[i]);
		}//for
		
		System.out.println();// blank lines
		
		//store student grades
		// first for loop to create rows
		for(int row = 0; row < studentGrades.length; row++)
		{
			//second for loop to create columns
			for(int column = 0; column < studentGrades[row].length; column++)
			{
				//prompt the user to enter grades
				System.out.println("Enter grade for each course for " + className[row] +
						" " + rollNum[row]);
				//Prompting to enter course grade
				System.out.println("Course" + (column+1) + ": ");
				studentGrades[row][column] = in.nextLine();//user input	
			}//end column for	
		}//end row for
		
		
		//Print Table
		System.out.println("             Student Grades                   ");
		System.out.println("       Class1     class 2      class3         ");
		System.out.println("----------------------------------------------");
		
		//print student names and test scores
		for(int row = 0; row < studentGrades.length; row++)
		{
			System.out.print(className[row] + " " + rollNum[row] + "          ");
			//for loop to print names and grades
			for(int column = 0; column < studentGrades[row].length; column++)
			{
				System.out.print(studentGrades[row][column] +"    ");
			}
			System.out.println();	
		}//end for
		
//		//find the average
//		for(int i = 0; i < 5; i++)
//		{
//			average[i] = (studentGrades[i][0] + studentGrades[i][1] + 
//					studentGrades[i][2]) / 3;
			//If average over 70, increase over seventy
//			if(average[i] > 70)
//				overSeventy += 1;
		}//for
//		System.out.println();// Blank lines
		
//		//If half of the students are over 70% print message
//		if(overSeventy > 2)
//			System.out.println("Tution is being incresed by 10% for the next semester");
		//If half of the students are under 70% print message
//		else
//			System.out.println("Tution will not be increased");
	}//class
