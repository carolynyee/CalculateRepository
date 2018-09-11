//This class is client code that uses the calculate library to perform various mathematical tasks. 
//@Carolyn Yee
//@version 1, 9/06/18
public class DoMath {

	public static void main(String[] args) {
		Calculate.square(5);
			System.out.println(Calculate.square(5));
			System.out.println(Calculate.cube(5));
			System.out.println(Calculate.average(1.2, 5.6));
			System.out.println(Calculate.average(4.3, 6.7, 8.2));
			System.out.println(Calculate.toDegrees(3.14159));
			System.out.println(Calculate.toRadians(180));
		// TODO Auto-generated method stub

	}

}
