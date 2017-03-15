import javax.swing.*;
public class loanEntries {

	public static String Loan(){
		String loan;
			//set sentence equal to JOptionPane to store user input, request in a dialog box user input
			loan = JOptionPane.showInputDialog(null, "Enter the Loan amount:");
			//return user input if user enters a valid sentence and not "STOP". 
			isValid(loan);
			return loan;
	}
	
	public static String Length(){
		String length;
			length = JOptionPane.showInputDialog(null, "Enter the Length of the loan in number of Years:");
			isValid(length);
			return length;
	}
	
	public static String Interest(){
		String interest;
			interest = JOptionPane.showInputDialog(null, "Enter the Interest Rate:");
			isValid(interest);
			return interest;
	}
	
	public static String DownPayment(){
		String Dp;
			Dp = JOptionPane.showInputDialog(null, "Enter the Downpayment amount:");
			isValid(Dp);
			return Dp;
	}
	//to check if user enters a valid number and not a letter
	public static boolean isValid(String check){
		for(int i=0; i<check.length(); i++){
			if(!(Character.isDigit(check.charAt(i)))){
				JOptionPane.showMessageDialog(null, "Please enter only Digits, thank you! ");
				System.exit(0);
				}
			}
		return true;
	} 
	
}
