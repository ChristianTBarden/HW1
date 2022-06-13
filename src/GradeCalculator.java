import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
//	    Write the following programs. Prepare a separate JAVA file for each program:
//		• GradeCalculator
//		This program takes in the following inputs and returns the sum of inputs: Homework, CodeLab,
//		Midterm1, Midterm2, Final.
//		The output prints out the message: The total score is ______.
 //import scanner class	
   Scanner sc = new Scanner(System.in);
 //Declare dataset to variables
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
  System.out.println("Calculate Final grade by Entering your numeric grade for LabExercises, EightPrograms, Midterm1, Midterm2 then Final in this exact order:"); 
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
		
		

	}

}
