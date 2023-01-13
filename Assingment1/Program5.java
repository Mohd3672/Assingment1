package Assingment1;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a , b and c : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = b*b- (4*a*c);
		double r1,r2;
		
		//System.out.print("Roots of Quadratic Equation are : ");
		if(d>0) {
			 r1 = (-b + Math.sqrt(d))/(2*a); 
			 r2 = (-b - Math.sqrt(d))/(2*a); 
				System.out.print(r1);
				System.out.print(" and "+r2);
		}
		else if(d ==0) {
			r1 = -b/(2*a);
			r2 = -b/(2*a);
			System.out.print(r1);
			System.out.print(" and "+r2);
		}
		else
		{
			System.out.println("Roots are not real");
		}
		
		sc.close();
	}

}
