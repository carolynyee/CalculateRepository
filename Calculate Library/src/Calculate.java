//This class contains methods that perform various math operations. 
//@Carolyn Yee
//@version 1, 9/18/18

public class Calculate {
	
	//square
	//returns the square of the input
	public static int square(int number) {
		//^int, not "void" because we need to say what type of value we're returning. 
		return number * number;
	 //we can see here that we are returning a number
	}
	//cube
	//returns the cube
	public static int cube(int number) {
		return number * number * number;	
	}
	//average
	//returns the average of two numbers
	public static double average(double num1, double num2) {
		return (num1 + num2) / 2;
	}
	//average
	//returns the average of three numbers
	public static double average(double num1, double num2, double num3) {
		return (num1 + num2 + num3) / 2;
	}
	//toDegrees
	//converts angle measure in radians to degrees
	public static double toDegrees(double number) {
		double pi = 3.14159;
		return (number * (180 / pi));
	}
	//toRadians
	//converts degress to radians
	public static double toRadians(double number) {
		double pi = 3.14159;
		return (number * (pi / 180));
	}
	//discriminant
	//provides coefficient of quadratic equation and returns discriminant
	public static double discriminant (double a, double b, double c) {
		return (b * b - 4 * a * c);
	}
	//toImproperFraction
	//converts mixed number to improper fraction
	public static String toImproperFrac(int number, int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException("denominator cannot be 0");
		}
		return (number * denominator + numerator + "/" + denominator);
	}
	
	//toMixedNum
	//improper fraction to mixed number
	public static String toMixedNum(int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException("denominator cannot be 0");
		}
		return (numerator / denominator + " " + numerator % denominator + "/" + denominator);
	}
	//foil
	//converts a binomial into quadratic
	public static String foil(int ax, int b, int cx, int d, String n) {
		return (ax * cx + n + "^2" + " + " + ((ax * d) + (b * cx))+ "n " + " + " + b * d);
	}
	//isDivisibleBy
	//determines if integer is evenly divisible
	public static boolean isDivisibleBy (int num1, int num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("0 cannot be a factor");
		}	
		if (num1 % num2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	//absValue
	//absolute value of the number passed
	public static double absValue(double num){
		if (num < 0) {
			num *= -1;
		}else if (num >= 0){
			num =+ num;
		}
		return num;
	}
	//max
	//returns larger of two values
	public static double max(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;	
			}
		}
	//max
	//returns largest of three values
	public static double max(double num1, double num2, double num3) {
		if (num1 > num2 && num2 > num3) { 
			return num1;
		}else if (num2 > num1 && num1 > num3) {
			return num2;
		}else if (num3 > num2 && num2 > num1) {
			return num3;
		}
		return 0;
	} 
	//min
	//returns smaller of values
	public static int min(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		}else {
			return num2;
		}
	}
	//round2
	//rounds a double to 2 decimal places and returns a double
	public static double round2(double num) {
		num += 0.005;
		num *= 100;
		int round = (int)num;
		return round / 100.0;
	}

	//exponent
	//raises value to positive integer power
	public static double exponent(double num1, int num2) {
		if (num2 < 0) {
			throw new IllegalArgumentException("2nd number cannot be less than 0");
		}
		int i = 0;
		double answer = 1;
		while (i < num2) {
			answer = answer * num1;
			i = i + 1;
		}
			return answer;
	}
	//factorial
	//returns factorial of the value passed
	public static int factorial(int num) {
		if (num < 0) {
			throw new IllegalArgumentException("please input a positive number");
		}
		int i = num;
		int answer = 1;
		while (i > 0) {
			answer = answer * num;
			num = num - 1;
					i = i - 1;
		}
		
		return answer;
	}
	//isPrime
	//determines whether an integer is prime
	public static boolean isPrime(int num) {
		boolean answer = true;
		if (num <= 0) {
			throw new IllegalArgumentException("input must be greater than 0");
		}
		for (int i = 2; i < num; i++) {
			if (isDivisibleBy(num, i)) {
				answer = false;	
		}
			}
	return answer;

		}
	
	//gcf
	//finds greatest common factor of two integers
	public static int gcf(int a, int b){
	    int answer = 1;
	    for (int i = 1; i <= a || i <= b; i++) {
	    	if (isDivisibleBy(a, i) && (isDivisibleBy(b, i))){
	    		answer = i;
	    	}
	    }
		return answer;
	}
	//sqrt
	//returns approximation of square root of value, rounded to 2 decimal places
	//need to throw an exception here
	public static double sqrt(double num) {
		if(num < 0) {
			throw new IllegalArgumentException("cannot be negative");
		}
		double guess = 10.0;
			while(absValue(num - (guess * guess)) > 0.005){
				guess = 0.5 * (num / guess + guess);
		}	
		return round2(guess);
		
	}
	//quadform
	//uses coefficients of a quadratic equation in standard form to approximate real roots
	public static String quadform(int a, int b,  int c) {
		//ax ^ 2 + bx + c
		int two_a= 2 * a; 
		int discriminant_two_a= (int) discriminant(a, b, c) / two_a;
		int x_positive = (int) (- b + sqrt(discriminant_two_a));
		int x_negative = (int) (- b - sqrt(discriminant_two_a));
		if (discriminant(a, b, c) < 0) {
			System.out.println("no real roots");
		}else if (x_positive == x_negative) {
				double answer = round2(x_positive);
				return (String) answer;
		}else (x_positive >= 0 && x_negative >= 0 ); {
			
			
		}
	}
}		


	
