package Diffiques;

import java.text.DecimalFormat;
import java.util.Scanner;

public class diffiques {
	
	public static double x, y;
	public static double times;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.######");
		
		System.out.print("x: ");
		x = scan.nextDouble();
		System.out.print("y: ");
		y = scan.nextDouble();
		
		System.out.print("deltaX: ");
		double deltaX = scan.nextDouble();
		System.out.print("newX: ");
		double newX = scan.nextDouble();
		
		times = newX/deltaX;
		
		for (int i=0; i<times; i++)
		{
			
			System.out.print("X: " + df.format(x) + " ");
			System.out.println("Old y: " + df.format(y));
			
			// (dy/dx) Equation: x+y
			
			double dydx = x+y;  //ENTER DY/DX HERE
			
			double deltaY = dydx * deltaX;
			System.out.println("deltaY: " + df.format(deltaY));
			
			double newY = y + deltaY;
			System.out.println("newY: " + df.format(newY));
			
			x += deltaX;
			y = newY;
			
			
			
		}
	
		

	}

}
