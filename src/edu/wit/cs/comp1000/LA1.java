package edu.wit.cs.comp1000;

import java.util.Scanner;

public class LA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num;
		double sum = 0;
		double avg = 0;
		double sd = 0;
		double[] sdarray = new double[5];
		
		System.out.printf("Enter five numbers :");
		for (int i = 0; i < 5; i++) {
			num = input.nextDouble();
			sdarray[i]= num;
			sum += num;
			avg = sum/5;
		}
		
		int length = sdarray.length;
	    for (double number : sdarray) {
	        sd += (number - avg) * (number - avg);
	    }
	    sd = Math.sqrt(sd / length);
	    
		System.out.println("Sum: " + sum);
		System.out.println("Mean: " + avg);
		System.out.printf("population Standard Deviation: %.2f", sd);
	}

}
