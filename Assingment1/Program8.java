package Assingment1;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lenght of a rectangle = ");
		int l = sc.nextInt();
		System.out.print("Enter widht of a rectangle = ");
		int b = sc.nextInt();
		
		int p =2*(l+b);
		System.out.println("Perimeter of a rectangle = "+p);
		sc.close();
	}

}
