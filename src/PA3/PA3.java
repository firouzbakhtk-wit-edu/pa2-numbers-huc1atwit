package PA3;
import java.util.Scanner;
public class PA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the length of side length a: ");
		int a = input.nextInt();
		System.out.printf("Enter the length of side length b: ");
		int b = input.nextInt();
		System.out.printf("Enter the length of side length c: ");
		int c = input.nextInt();
		
		if (a+b<c || a+c<b || b+c<a) {
			System.out.println("Triangle doesn not exist");
			return;
		}
		int s = (a + b + c)/2;
		double area = s*(s-a)*(s-b)*(s-c);
		area = Math.sqrt(area);
		System.out.printf("The area is %.2f", area);
	}

}