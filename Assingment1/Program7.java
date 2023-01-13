package Assingment1;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter real and imaginary value for 1st Complex number =  ");
		int r1 = sc.nextInt();
		int i1 = sc.nextInt();
		System.out.println("Enter real and imaginary value for 2nd Complex number =  ");
		int r2 = sc.nextInt();
		int i2 = sc.nextInt();
		
		System.out.println("1st Complex number = "+r1+"+"+" i"+i1);
		System.out.println("2nd Complex number = "+r2+"+"+" i"+i2);
		int r = r1+r2;
		int i = i1+i2;
		System.out.print("Addition of both complex number = "+r+""+" i"+i);
		sc.close();
		
	}

}
