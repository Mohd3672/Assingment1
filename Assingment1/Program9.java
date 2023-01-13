package Assingment1;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of a sphere = ");
		int r = sc.nextInt();
		double pi = 3.14;
		double sa = 4*pi*r*r;
		System.out.println("Surface area of a sphere = "+sa);
		sc.close();

	}

}
