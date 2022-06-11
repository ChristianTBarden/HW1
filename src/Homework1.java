package com.thecodingzoo.lessons.basic;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
//		    Write the following programs. Prepare a separate JAVA file for each program:
//			• GradeCalculator
//			This program takes in the following inputs and returns the sum of inputs: Homework, CodeLab,
//			Midterm1, Midterm2, Final.
//			The output prints out the message: The total score is ______.
	 //import scanner class	
	   Scanner sc = new Scanner(System.in);
     //Declare dataset to varibles
	  	 double Midterm1;
	  	  double Midterm2;
	  	   double Final;
	   	    double LabExercises;
	  	     double EightPrograms;
	         double totalscore;
	         double a;
	        double b;
	       double c;
	      double d;
	     double e;
	    double f;
	 //Print out program instructions to users
	  System.out.println("Calculate Final grade by Entering your numeric grade for LabExercises, EightPrograms, Midterm1, Midterm2 then Final in this exact order."); 
     //Indicate order of your user inputs
	   LabExercises = sc.nextDouble();
	    EightPrograms = sc.nextDouble();
	     Midterm1 = sc.nextDouble();
	      Midterm2 = sc.nextDouble();
	       Final = sc.nextDouble();
      //indicate grade percentage for each variable "a" to "e" and then add up to total score with f 	  	
        a = LabExercises * .10;
         b = EightPrograms * .15;
	  	  c = Midterm1 * .2;
	  	   d = Midterm2 * .2;
	  	    e = Final * .35;
	         f = totalscore = (a + b + c + d + e );
      //	  	
	  System.out.println( "The output prints out the message: The total score is " +  totalscore  + "." );		
			
			
			
		
		
		
		
//------------------------------------------------------------------------------------------------------------		
//			• RectangleStat
//			Accept 2 inputs for width and length and calculate the area and perimeter of the rectangle.
//			The output message should print the message When one side is ____ and the
//			other side is _____, the area is _____ and the perimeter is
//			_____.
        //import scanner class
		  Scanner sc = new Scanner(System.in);
        //Declare dataset to varibles
		  	double Perimeter;
		  	 double Width;
		  	  double Length;
		  	   double Area;
        //Print out program instructions to users
		  System.out.println("Enter length value for square, then Enter width value to compute area and perimeter:");  
        //Indicate order of your user inputs
		  	Length = sc.nextDouble();
		  	 Width = sc.nextDouble();
        //Create formula for a square    
		  	Area = (Length * Width);
		  	 Perimeter = (2 * Length + Width * 2);
		//Print out program output
		  System.out.println("When one side is " + Length + " and the other side is " + Width + ", the area is " + Area + " and the perimeter is " + Perimeter + ".");
       		
		
		
		
//-----------------------------------------------------------------------------------------------------------		
//			• CircleStat
//			Accept 1 input for radius r and calculate the circumference and area of a circle. The output
//			message should print the message When the radius is ____ the circumference
//			is _____ and the area is ______.
            //import scanner class
			  Scanner sc = new Scanner(System.in);
            //Declare dataset to varibles 
			  	double Radius;
			   	 double Area;
			  	  double Circumference;
            //Print out program instructions to users
			    System.out.println("Enter a value for circle radius dude, then press Enter.");  
            //Indicate order of your user inputs
			    Radius = sc.nextDouble();
            //Create Formula for Circle Area/Circumference.
			    Area = (3.1415926535 * (Radius) * (Radius));
			  	 Circumference = (2 * 3.1415926535 * Radius);
			//Print out program output
			  System.out.println("Circle Radius = " + Radius + ", Area = " + Area +", Circumference = " + Circumference );
            		
		
		
	}

}
