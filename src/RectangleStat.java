package com.thecodingzoo.lessons.basic;

import java.util.Scanner;

public class RectangleStat {

	public static void main(String[] args) {
//		• RectangleStat
//		Accept 2 inputs for width and length and calculate the area and perimeter of the rectangle.
//		The output message should print the message When one side is ____ and the
//		other side is _____, the area is _____ and the perimeter is
//		_____.
    //import scanner class
	  Scanner sc = new Scanner(System.in);
    //Declare dataset to variables
	  	double Perimeter;
	  	 double Width;
	  	  double Length;
	  	   double Area;
    //Print out program instructions to users
	  System.out.println("Enter length value for square/rectangle, then Enter width value to compute area and perimeter:");  
    //Indicate order of your user inputs
	  	Length = sc.nextDouble();
	  	 Width = sc.nextDouble();
    //Create formula for a square    
	  	Area = (Length * Width);
	  	 Perimeter = (2 * Length + Width * 2);
	//Print out program output
	  System.out.println("When one side is " + Length + " and the other side is " + Width + ", the area is " + Area + " and the perimeter is " + Perimeter + ".");
   		
	
	

	}

}
