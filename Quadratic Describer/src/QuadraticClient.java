/*Welcome to the Quadratic Describer
provide values for coefficients a, b,c
a:1
b:0
c:0
Description of the graph of:
y = 1.0 x^2 + 0.0 x + 0.0
Opens: up
Axis of symmetry: 0.0
Vertex: (0.0, 0.0)
x-intercept(s): 0.0
y-intercept: 0.0
Do you want to keep going? (Type "quit" to end)
*/



import java.util.*;

public class QuadraticClient {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for the coefficients a, b, and c");
		
		System.out.print("a: ");
		double a = userinput.nextDouble();
		System.out.println(a);
		
		System.out.print("b: ");
		double b = userinput.nextDouble();
		System.out.println(b);
		
		System.out.print("c: ");
		double c = userinput.nextDouble();
		System.out.println(c);
		
		System.out.println("Description of the graph of:");
		System.out.println(a + "x^2" + " + " + b + "x" + " + " + c);
		System.out.println();
		
		if (a>0) {
			System.out.println("Opens: up");
		} else {
			System.out.println("Opens: down");
		}
		double axis = (-b)/(2*a); 
		System.out.println("Axis of Symmetry: " + axis);
		
		double yvertex = (a*(axis)*(axis) + b*(axis) + c); 
		System.out.println("Vertex: (" + axis + " , " + yvertex + ")");
		
		String xintercept = Quadratic.quadform(a, b, c);
		System.out.println("x-intercept(s): " + xintercept);
		
		System.out.println("y-intercept: " + c);
		
		System.out.println("Do you want to keep going? (Type \"quit\" to end)");
		// y or n 
		String response = userinput.next();
		if (response )
		
		
	
	
	
	
	
	userinput.close();
	}
}
