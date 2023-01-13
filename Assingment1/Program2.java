package Assingment1;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter two floating numbers : ");
		float num1=in.nextFloat();
		float num2=in.nextFloat();
		float product=num1*num2;
		System.out.println("Product = "+product);
		in.close();
	}

}
