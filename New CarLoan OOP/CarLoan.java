/*The purpose of this project is to write a program that will calculate the monthly car payment a 
user should expect to make after taking out a car loan. The program will include the following:
-car loan amount
-interest rate of the loan
-length of the loan (in years)
-down payment
*/

import javax.swing.*;

public class CarLoan {
  public static void main (String[] args) {
    
    int carLoan = Integer.parseInt(loanEntries.Loan());
    int loanLength = Integer.parseInt(loanEntries.Length()); //represents a loan length of 3 years
    double interestRate = Double.parseDouble(loanEntries.Interest()); //represents an interest rate of 5% on the loan
    int downPayment = Integer.parseInt(loanEntries.DownPayment());; //represents the down payment provided by a user for this car
    
    //requirements that would prevent a buyer form taking out an invalid car loan
    if (loanLength <= 0 || interestRate <=0){
      System.out.println("Im Sorry, you must take out a valid car loan.");
    }
    //in case the down payment is more than the price of the car, the user can pay in full
    else if ( downPayment >= carLoan){
    	JOptionPane.showMessageDialog(null, "If you like, the car can be paid in full!");
    }
    else {
      int remainingBalance, months, monthlyBalance;
      double interest, monthlyPayment;
      // to calculate the remaining balance of the user.
      remainingBalance = carLoan - downPayment;
      //converting the loan length from years to months
      months = loanLength * 12;
      //represents the monthly payment without interest included
      monthlyBalance = remainingBalance/months;
      //to calculate the interest on the loan that the user borrowed
      interest = (monthlyBalance*interestRate)/100;
      //calculate the final monthly payment
      monthlyPayment = monthlyBalance + interest;
      
      JOptionPane.showMessageDialog(null, "Your Monthly Payment will be: " + "\n" + "$" + monthlyPayment);
    }
  }
}
