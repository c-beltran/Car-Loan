# Car-Loan
Calculating Car Loan


/*The purpose of this project is to write a program that will calculate the monthly car payment a 
user should expect to make after taking out a car loan. The program will include the following:
-car loan amount
-interest rate of the loan
-length of the loan (in years)
-down payment
*/


public class CarLoan {
  public static void main (String[] args) {
    
    int carLoan = 10000;
    int loanLength = 3; //represents a loan length of 3 years
    int interestRate = 5; //represents an interest rate of 5% on the loan
    int downPayment = 2000; //represnts the down payment provided by a user for this car
    
    //requirements that would prevent a buyer form taking out an invalid car loan
    if (loanLength <= 0 || interestRate <=0){
      System.out.println("Im Sorry, you must take out a valid car loan.");
    }
    //in case the down payment is more than the price of the car, the user can pay in full
    else if ( downPayment >= carLoan){
      System.out.println("If you like, the car can be paid in full!");
    }
    else {
      int remainingBalance, months, monthlyBalance, interest, monthlyPayment;
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
      
      System.out.println(monthlyPayment);
    }
  }
}

