package com.thecodingzoo.lessons.basic;

import java.util.Scanner;

public class CircleStat {    public static void main(String[] args){
	
//			Accept 1 input for radius r and calculate the circumference and area of a circle. The output
//	message should print the message When the radius is ____ the circumference
//	is _____ and the area is ______.
    //import scanner class
	  Scanner sc = new Scanner(System.in);
    //Declare dataset to variables 
	  	double Radius;
	   	 double Area;
	  	  double Circumference;
    //Print out program instructions to users
	    System.out.println("Enter a value for circle radius dude, then press Enter:");  
    //Indicate order of your user inputs
	    Radius = sc.nextDouble();
    //Create Formula for Circle Area/Circumference.
	    Area = (3.1415926535 * (Radius) * (Radius));
	  	 Circumference = (2 * 3.1415926535 * Radius);
	//Print out program output
	  System.out.println("Circle Radius = " + Radius + ", Area = " + Area +", Circumference = " + Circumference );
    		

}

}
