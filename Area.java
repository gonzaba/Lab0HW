
/** 
 * @author: Barbara P. Gonzalez-Rivera 802-14-2976
 * @description: Java program to calculate the area of a circle given the radius.
 **/

import java.util.Scanner;

public class AreaCalculation{
	public static void main(String args[])
	{
	int radius;
	double area;
	Scanner input = new Scanner(System.in);
	System.out.print("Please give the radius of the circle:" );
	radius = input.nextInt();
	area = Math.PI *(radius*radius);
	System.out.print("Area is:" + area); 
	System.out.print("Half of Area is" +radius);
}
}
