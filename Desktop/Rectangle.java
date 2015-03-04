/** Name: Jose Calix
 *  Email: jbc2288@email.vccs.edu
 *  Date: 02/23/2015
 *  Program's Purpose: To calculate the area and perimeter of any rectangle.
 */

import javax.swing.JOptionPane;
public class Rectangle 
{
	public static void main(String[] args) 
	{
		double  width, height, perimeter, area;
		
		JOptionPane.showMessageDialog(null," I will calculate the perimeter and area of your rectangle.");
		String widthString = JOptionPane.showInputDialog("Enter your rectangle's width in inches: ");
		width = Double.parseDouble(widthString);
		String heightString = JOptionPane.showInputDialog("Enter your rectangle's height in inches: ");
		height = Double.parseDouble(heightString);
		
		perimeter = (2)*(width + height);
		area = width*height;
		
		JOptionPane.showMessageDialog(null,"The perimeter of your rectangle is " + perimeter +
				" inches and the area is " + area + " square inches.");

		System.exit(0);
			
}
}
