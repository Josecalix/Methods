 /** jbc:2288@vccs.edu
  *  Date: 02/25/2015
  *  Application's Purpose: perform mathematical operations using the numbers entered by the user.
  */
  import javax.swing.JOptionPane;

  public class Assignment2
  {
    public static void main(String[] args)
    {
	JOptionPane.showMessageDialog(null,"Enter five numbers. I will display the results of "
	+ "\nsome mathematical operations using those numbers."); 
	// numbers can be positive or negative
		
	double firstNumber, secondNumber, thirdNumber;
	double fourthNumber, fifthNumber, sumOfNumbers, averageOfNumbers; 
	// numbers can be whole or have a fractional part

	String firstString = JOptionPane.showInputDialog("Enter your first number: ");
	firstNumber = Double.parseDouble(firstString);
	String secondString = JOptionPane.showInputDialog("Enter your second number: ");
	secondNumber = Double.parseDouble(secondString);
	String thirdString = JOptionPane.showInputDialog("Enter your third number: ");
	thirdNumber = Double.parseDouble(thirdString);
	String fourthString = JOptionPane.showInputDialog("Enter your fourth number: ");
	fourthNumber = Double.parseDouble(fourthString);
	String fifthString = JOptionPane.showInputDialog("Enter your fifth number: ");
	fifthNumber = Double.parseDouble(fifthString);
								
	JOptionPane.showMessageDialog(null, "The numbers you entered are:  " + firstNumber+","+" " 
	+  secondNumber+"," + " "+  thirdNumber+"," + " " +  fourthNumber+"," + " " +  fifthNumber);
	 // shows the user the numbers that were entered

	 sumOfNumbers = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
	 averageOfNumbers = sumOfNumbers/5;
						
	JOptionPane.showMessageDialog(null, "The sum of your numbers is " + String.format( "%3.2f",sumOfNumbers)
	+ "\nThe avearage of your numbers is " + String.format("%3.2f", averageOfNumbers));
	// results are displayed with two numbers after the decimal point
									
    }
 }
