package fracCalc;

import java.util.Arrays;

public class Fraction {

	private int whole; 
	private int num;
	private int denom;
	private String fraction = "";
	private String answer2;
	
	public Fraction() {
	}
	
	
	public Fraction(String input) {
		//include code to parse the string and set the values for the fields whole, num, and denom
		//cut up into 3 strings
		//turn them into integers --> store in the fields
		//make improper
		
        String[] underscore = (input.split("_"));
        String[] slash;
        
        if(underscore.length == 2) { 
        	slash = (underscore[1].split("/"));
        } else {
        	slash = (underscore[0].split("/"));
        }
      
        if (underscore.length == 2) {
           	whole = Integer.parseInt(underscore[0]);
        }
        if (slash.length == 2) {
           	num = Integer.parseInt(slash[0]);
           	denom = Integer.parseInt(slash[1]);
        }
           
        if(slash.length == 1) {
        	whole = Integer.parseInt(underscore[0]);
        	denom = 1;
        }
	}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
   //Calculate methods
	
	//toImproperFraction
  	//converts mixed number to improper fraction
  	public void toImproperFrac() {
  		
  		if (whole < 0) {
  			whole *= -1;
  			//System.out.println("whole: " + whole);
  			num = -((whole * denom) + num);
  		
  			//System.out.println(numerator);
  			
  		} else {
  			num = whole * denom + num; 
  		}
  		whole = 0;
  	}
  	
  	//isDivisibleBy
  	//determines if integer is evenly divisible
  	public static boolean isDivisibleBy(int num1, int num2) {
  		if (num2 == 0) {
  			throw new IllegalArgumentException("Second number cannot be 0");
  		}
  		if (num1 % num2 == 0) {
  			return true;
  		} else {
  			return false;
  		}
  	}
  	//gcf
  	//finds greatest common factor of two integers
  	public static int gcf(int a, int b){
  	    int answer = 1;
  	    for (int i = 1; i <= Math.abs(a); i++) {
  	    	if (isDivisibleBy(a, i) && (isDivisibleBy(b, i))){
  	    		answer = i;
  	    	}
  	    }
  		return answer;
  	}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	//takes the 2nd fraction and does the correct operation with the first fraction
	public Fraction doMath(Fraction op2, String operator) {
		
		toImproperFrac();
		op2.toImproperFrac();
		
		Fraction answer = new Fraction();
		
		if (operator.equals("+")) {
			//add the fractions
			answer.denom = this.denom * op2.denom;
			answer.num = (this.num * op2.denom) + (this.denom * op2.num);
			
		}else if (operator.equals("-")) {
			//subtract the fractions
			answer.denom = this.denom * op2.denom;
			answer.num = (this.num * op2.denom) - (this.denom * op2.num);
			 
		} else if (operator.equals("*")) {
		 	//multiply the fractions
			answer.denom = this.denom * op2.denom;
			answer.num = this.num * op2.num;
			
		} else if (operator.equals("/")) {
			//divide the fractions
			answer.denom = this.denom * op2.num;
			answer.num = this.num * op2.denom;
		}
			//simply the result
			int gcf = gcf(answer.num, answer.denom);
			answer.num = answer.num / gcf;
			answer.denom = answer.denom / gcf;
			return answer; 
	}
	
	//returning the object as a string
	public String toString() {
			String answer = (num / denom + "_" + num  % denom + "/" + denom);
		
		if (num == 0) {
			return "0";
		}	
		
		if (num/denom == 0) {
			answer = num % denom + "/" + denom;
			if(denom < 0) {
				answer = -(num % denom) + "/" + (denom * -1);
			} return answer;
		}
		if (num % denom == 0) {
			return num / denom + "";
		}
		if (num < 0) {
			answer = (num / denom + "_" + (num * -1) % denom + "/" + denom);
				if (denom < 0) {
					answer = (num / denom + "_" + (num * -1) % denom + "/" + (denom * -1));
				}
		}else if (num > 0 && denom < 0) {
			answer = (num / denom + "_" + num % denom + "/" + (denom * -1));
		}else {
			answer = (num / denom + "_" + num % denom + "/" + denom);
		}
		return answer;
	}
	
	//used to call the values stored inside the fields
	public int getNum() {
		return num;
	}
	public int getDenom() {
		return denom;
	} 
	
}

