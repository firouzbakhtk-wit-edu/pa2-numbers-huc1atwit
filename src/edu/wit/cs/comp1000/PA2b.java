package edu.wit.cs.comp1000;

import java.util.Scanner;
/**
 * Solution to PA2b.
 * Calculates the quadratic formula
 * 
 * @author Chris Hu
 */
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a b c: ");
		for (int i = 0; i < 3 ; i++) {
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			double d = Math.pow(b, 2) - 4 * a * c;
			
			if (d < 0) {
				System.out.println("Roots: imaginary");
				break;
			} else if (d == 0){
				d = Math.sqrt(d);
				double roota = (b * -1 + d) / 2;
				System.out.printf("Root: %.2f%n", roota);
				break;
			}
				else {
			
				d = Math.sqrt(d);
				double rootb = (b * -1 - d) / (2 * a);
				double roota = (b * -1 + d) / (2 * a);
				System.out.printf("Roots: %.2f, %.2f%n", rootb , roota);
				break;
			}
		}
	}
}