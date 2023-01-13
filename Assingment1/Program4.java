package Assingment1;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 1st number = ");
		int num1 = in.nextInt();
		System.out.print("Enter 2nd number = ");
		int num2 = in.nextInt();
		System.out.println("Before Swapping");
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
		//Swapping the numbers
		int temp=num1;
		num1=num2;
		num2=temp;		
		System.out.println("After Swapping");
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		in.close();
		
	}

}
