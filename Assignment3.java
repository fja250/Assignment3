import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a point with two coordinates: ");

	Double x1 = input.nextDouble();
	Double y1 = input.nextDouble();

	if ( x1 > 5 || y1 > 2.5 )
		System.out.println("Point (" + x1 + " , " + y1 + ") is not in the rectangle");
	else

		System.out.println("Point (" + x1 + " , " + y1 + ") is in the rectangle");
	
	}
}
