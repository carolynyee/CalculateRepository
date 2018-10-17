import java.util.Scanner;

//Carolyn Yee
//Quadratic class of project QuadraticDescriber
//10/09/2018

public class Quadratic {
	
	//foil
		//converts a binomial into quadratic
		public static String foil(int ax, int b, int cx, int d, String n) {
			return (ax * cx + n + "^2" + " + " + ((ax * d) + (b * cx))+ "n " + " + " + b * d);
		}
	//discriminant
		//provides coefficient of quadratic equation and returns discriminant
		public static double discriminant(double a, double b, double c) {
			return (b * b - 4 * a * c);
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
			} else if (num2 > num1 && num1 > num3) {
				return num2;
			} else if (num3 > num2 && num2 > num1) {
				return num3;
			}
			return 0;
		} 
		//min
		//returns smaller of values
		public static int min(int num1, int num2) {
			if (num1 < num2) {
				return num1;
			} else {
				return num2;
			}
		}
		//min 
		//overloaded, for use with doubles
		public static double min(double num1, double num2) {
			if (num1 < num2) {
				return num1;
			} else {
				return num2;
			}
		}
		//absValue
		//absolute value of the number passed
		public static double absValue(double num){
			if (num < 0) {
				num *= -1;
			} else if (num >= 0){
				num =+ num;
			}
			return num;
		}
		//round2
		//rounds a double to 2 decimal places and returns a double
		public static double round2(double num) {
			if (num >= 0) {
				num += 0.005;
			} else {
				num -= 0.005;
			}
			num *= 100;
			int round = (int)num;
			return round / 100.0;
		}
		//sqrt
		//returns approximation of square root of value, rounded to 2 decimal places
		//need to throw an exception here
		public static double sqrt(double num) {
			if (num < 0) {
				throw new IllegalArgumentException("cannot be negative");
			}
			double guess = 10.0;
				while (absValue(num - (guess * guess)) > 0.005){
					guess = 0.5 * (num / guess + guess);
				}	
				return round2(guess);
			}
		//quadform
		//uses coefficients of a quadratic equation in standard form to approximate real roots
		public static String quadform(double a, double b,  double c) {
			//ax ^ 2 + bx + c	
			// -b +- (sqrt (b ^ 2 - 4 * a * c) / (2 * a))
				
			double discriminant = discriminant(a, b, c);
				if (discriminant(a, b, c) < 0) {
					System.out.println("no real roots");
				}
			double sqrt_discriminant = sqrt(discriminant);
			double two_a = 2 * a; 
				
			double x_positive = (-b + sqrt_discriminant) / two_a;
			double x_negative = (-b - sqrt_discriminant) / two_a;

				if (discriminant == 0) {
					x_positive = -b / two_a;
					x_positive = round2(x_positive);
						String answer = x_positive + ""; 
						return answer;
				}
				if (x_positive >= 0 && x_negative >= 0); {
					double min =  min(x_positive, x_negative);
					double max = max(x_positive, x_negative);
					min = round2(min-= 0.005);
					max = round2(max);
					return "" + min + " and " + max + "";
				}
			}
		
	public static String quadrDescriber (double a, double b, double c) {
		Scanner userinput = new Scanner(System.in);
		System.out.print("a: ");
		a = userinput.nextDouble();
		System.out.println(a);
		
		System.out.print("b: ");
		b = userinput.nextDouble();
		System.out.println(b);
		
		System.out.print("c: ");
		c = userinput.nextDouble();
		System.out.println(c);
		
		double axis = (-b)/(2*a); 
				
		double yvertex = (a*(axis)*(axis) + b*(axis) + c); 
		
		String xintercept = Quadratic.quadform(a, b, c);
		System.out.println("x-intercept(s): " + xintercept);
		
		System.out.println("y-intercept: " + c);
		
		System.out.println("Do you want to keep going? (Type \"quit\" to end)");
		// y or n 
		String response = userinput.next();
		if (response.equals("quit")) {
			userinput.close();
			}
		
	}
}

