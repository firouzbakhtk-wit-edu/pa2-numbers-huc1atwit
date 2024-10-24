package edu.wit.cs.comp1000;

import java.util.Scanner;
/**
 * Solution to PA2a.
 * Takes in 5 numbers and calculates sum and averages of all, positive, and non-positive numbers
 * 
 * @author Chris Hu
 */
public class PA2a {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sumpos = 0;
		double avgpos = 0;
		
		int sumneg = 0;
		double avgneg = 0;
		
		int poscount = 0;
		int negcount = 0;
		
		int sumall = 0;
		double avgall = 0;
		
		System.out.printf("Enter five whole numbers: ");
		
		for (int i = 0; i < 5; i++) {
			double num = input.nextDouble();
			if (num>0) {
				poscount++;
				sumpos += num;
				avgpos = ((double)sumpos/poscount);
			} else {
				negcount++;
				sumneg += num;
				avgneg = ((double)sumneg/negcount);
			}
			sumall+=num;
			
		}
		avgall = (double)sumall/5;
		if (poscount == 1) {
			System.out.println("The sum of the " + poscount + " positive number: " + sumpos);
		} else {
			System.out.println("The sum of the " + poscount + " positive numbers: " + sumpos);
		}
		if (negcount == 1) {
			System.out.println("The sum of the " + negcount + " non-positive number: " + sumneg);
		} else {
			System.out.println("The sum of the " + negcount + " non-positive numbers: " + sumneg);
		}
		System.out.println("The sum of the 5 numbers: " + sumall);
		
		if (poscount == 1) {
			System.out.printf("The average of the " + poscount + " positive number: %.2f%n", avgpos);
		} else {
			System.out.printf("The average of the " + poscount + " positive numbers: %.2f%n", avgpos);
		}
		if (negcount == 1) {
			System.out.printf("The average of the " + negcount + " non-positive number: %.2f%n", avgneg);
		} else {
			System.out.printf("The average of the " + negcount + " non-positive numbers: %.2f%n", avgneg);
		}

		System.out.printf("The average of the 5 numbers: %.2f%n", avgall);
	}
}
