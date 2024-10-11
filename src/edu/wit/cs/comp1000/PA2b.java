package edu.wit.cs.comp1000;

import java.util.Scanner;
// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		double a;
		double b;
		double c;
		double d;
		double roota;
		double rootb;
		
		System.out.print("Enter a b c: ");
		for (int i = 0; i < 3 ; i++) {
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
			d = b * b - 4 * a * c;
			
			if (d < 0) {
				System.out.println("Roots: imaginary");
				break;
			} else if (d == 0){
				d = Math.sqrt(d);
				roota = (b * -1 + d) / 2;
				System.out.println("Root: " + roota);
				break;
			}
				else {
			
				d = Math.sqrt(d);
				rootb = (b * -1 - d) / 2;
				roota = (b * -1 + d) / 2;
				System.out.println("Roots: " + roota + ", " + rootb);
				break;
			}
		}
		
	}

}