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
		
		System.out.print("b: ");
		double b = userinput.nextDouble();
		
		System.out.print("c: ");
		double c = userinput.nextDouble();
		
		Quadratic.quadrDescriber(a, b, c);
		
		System.out.println("Do you want to keep going? (Type \"quit\" to end)");
		// y or n 
		//String response = userinput.next();
		
		String response = userinput.next();
		while(!response.equals("quit")) {
			
			System.out.println("Welcome to the Quadratic Describer");
			System.out.println("Provide values for the coefficients a, b, and c");
			
			System.out.print("a: ");
			a = userinput.nextDouble();
			
			System.out.print("b: ");
			b = userinput.nextDouble();
			
			System.out.print("c: ");
			c = userinput.nextDouble();
			
			Quadratic.quadrDescriber(a, b, c);
			
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			// y or n 
			//String response = userinput.next();
			
			response = userinput.next();
		}
		userinput.close();

	}
		
		
		
		
		/*System.out.println("Description of the graph of:");
		System.out.println(a + "x^2" + " + " + b + "x" + " + " + c);
		System.out.println();
		
		if (a>0) {
			System.out.println("Opens: Up");
		} else {
			System.out.println("Opens: Down");
		}
		double axis = (-b)/(2*a); 
		System.out.println("Axis of Symmetry: " + axis);
		
		double yvertex = (a*(axis)*(axis) + b*(axis) + c); 
		System.out.println("Vertex: (" + axis + " , " + yvertex + ")");
		
		String xintercept = Quadratic.quadForm(a, b, c);
		System.out.println("x-intercept(s): " + xintercept);
		
		System.out.println("y-intercept: " + c);
		
		System.out.println("Do you want to keep going? (Type \"quit\" to end)");
		// y or n 
		String response = userinput.next();
		if (response.equals("quit")) {
			userinput.close();
		}
		*/
		}
	

