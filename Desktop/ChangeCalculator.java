import javax.swing.JOptionPane;
public class ChangeCalculator 
{
	public static final double QUARTERS= 0.25, DIMES= 0.10, NICKLES = 0.05, PENNIES= 0.01;

	public static void main(String[] args) 
	{
		JOptionPane.showMessageDialog(null,"Enter an amount of money by only using dollar bills of 1, 5, or 10. "
				+ "\nFor each amount, I will calculate and return an exact change in coins.");
		
		 double totalMoney;
		int oneDollarBills, fiveDollarBills,tenDollarBills;
		double quarters, dimes, nickles, pennies, allBills;
				
		String oneString = JOptionPane.showInputDialog("Number of one dollar bills: ");
		oneDollarBills = Integer.parseInt(oneString);
		String fiveString = JOptionPane.showInputDialog("Number of five dollar bills: ");
		fiveDollarBills = Integer.parseInt(fiveString);
		String tenString = JOptionPane.showInputDialog("Number of ten dollar bills: " );
		tenDollarBills = Integer.parseInt(tenString);
		totalMoney = oneDollarBills*(1) + fiveDollarBills*(5) + tenDollarBills*(10);
		JOptionPane.showMessageDialog(null, String.format("The total amount your entered is: "  +"$" + "%2.2f", totalMoney));
		
		allBills = totalMoney;
		quarters = totalMoney/QUARTERS;
		totalMoney = totalMoney%QUARTERS;
		dimes = totalMoney/DIMES;
		totalMoney = totalMoney%DIMES;
		nickles = totalMoney/NICKLES;
		totalMoney = totalMoney%NICKLES;
		pennies = totalMoney/PENNIES;
		totalMoney = totalMoney%PENNIES;
		
		JOptionPane.showMessageDialog(null, String.format("$"+ "%2.2f",allBills) + " can be given as: " 
		+ String.format("\n %3.0f quarters, %3.0f dimes, %3.0f nickles, and %3.0f pennies", quarters,dimes, nickles, pennies));
		
		System.exit(0);

		}
		}