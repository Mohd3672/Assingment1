package Assingment1;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle balance P = ");
		int p =sc.nextInt();
		System.out.print("Enter Time Period t = ");
		int t =sc.nextInt();
		System.out.print("Enter Rate r = ");
		double r =sc.nextDouble();
		
		double a = p*(Math.pow((1 + r / 100), t));
		double ci =a-p;
		System.out.println("Compound Interest = "+ci);
		sc.close();

	}

}
