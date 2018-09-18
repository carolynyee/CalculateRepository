//This class contains methods that perform various math operations. 
//@Carolyn Yee
//@version 1, 9/06/18
public class Calculate {
	//returns the square of the input
	public static int square(int number) {
		//^int, not "void" because we need to say what type of value we're returning. 
		return number*number;
	} //we can see here that we are returning a number
	
	//returns the cube
	public static int cube(int number) {
		return number*number*number;	
	}
	//returns the average of two numbers
	public static double average(double num1, double num2) {
		return (num1+num2)/2;
	}
	//returns the average of three numbers
	public static double average(double num1, double num2, double num3) {
		return (num1+num2+num3)/2;
	}
	//converts angle measure in radians to degrees
	public static double toDegrees(double number) {
		double pi =3.14159;
		return (number*(180/pi));
	}
	//converts degress to radians
	public static double toRadians(double number) {
		double pi=3.14159;
		return (number*(pi/180));
	}
	//provides coefficient of quadratic equation and returns discriminant
	public static double discriminant (double a, double b, double c) {
		return (b*b - 4*a*c);
	}
	//converts mixed number to improper fraction
	public static String toImproperFrac(int number, int numerator, int denominator) {
		return (number*denominator+numerator + "/" + denominator);
	}
	//improper fraction to mixed number
	public static String toMixedNum(int numerator, int denominator) {
		return (numerator/denominator + " " + numerator%denominator+ "/" +denominator);
	}
	//converts a binomial into quadratic
	public static String foil(int ax, int b, int cx, int d, String n) {
		return (ax*cx+n + "^2" + " + " + (ax*d + b*cx)+ "n " + " + " + b*d);
	}
	//determines if integer is evenly divisible
	//doesn't wooooooooooooooooooooooooorkkkkkkkkkkkkkk
	//public static boolean isDivisibleBy (int num1, int num2) {
		//boolean+= divisible(num1%num2);
		//return boolean
	//}
	//absolute value of the number passed
	public static double absVaulue(double num){
		if (num < 0){
			num = -num;
		} else {
		}
		return num;
	}
	//returns larger value
	public static double max(double num1, double num2) {
		if (num1>num2) {
			System.out.println(num1);
		} else if (num1 <num2){ 
			System.out.println(num2);
		} return num2;
	}
	public static double max(double num1, double num2, double num3) {
		if (num1>num2) {
			System.out.println(num1);
		}else if (num2>num1) {
			System.out.println(num2);
		}else if (num2>num3)	{
			System.out.println(num2);
		}else if (num3>num2) {
			System.out.println(num3);
		}else if (num1>num3) {
			System.out.println(num1);
		}else if (num3>num1) {
			System.out.println(num3);
		} return max();
	}
	public static int min(int num1, int num2) {
		if (num1>num2) {
			System.out.println(num1);
		}else if (num2>num1) {
			System.out.println(num2);
		} return min;
		}
	}
}	
		
