package Assingment1;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter num1 = ");
		int num1 = in.nextInt();
		System.out.print("Enter num2 = ");
		int num2 = in.nextInt();
		int q = num1/num2; 
		System.out.println("Quotient = "+q);
		int r = num1%num2;
		System.out.println("Remainder = "+r);
		in.close();
	}

}
