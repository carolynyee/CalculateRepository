package fracCalc;

import java.util.Arrays;
import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner userinput = new Scanner(System.in);
    	System.out.print("Please input a fraction: ");
    	String input = userinput.nextLine();
    	
    	while(input != "quit") {
    		String output = produceAnswer(input); //do we even need process command???
    		System.out.println(output);
    		System.out.println("Please input a fraction: ");
    		input = userinput.nextLine();
    	}
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) {

    	String[] space = (input.split(" "));
    	String operator = space[1];
    	Fraction frac1 = new Fraction(space[0]);
    	Fraction frac2 = new Fraction(space[2]);
    	Fraction answer = new Fraction();
    	answer = frac1.doMath(frac2, operator);    	
    	return answer.toString();
       
    	
        // TODO: Implement this function to produce the solution to the input
    }

	

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
