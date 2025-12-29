import java.util.Scanner;
public class BankLoans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int aacountNumber =sc.nextInt();
        System.out.println("Enter account balance: ");
        double accountBalance= sc.nextDouble();
        System.out.println("Enter salary: ");
        double salary= sc.nextDouble();
        System.out.println("Enter loan type: ");
        String loanType= sc.next();
        System.out.println("Enter expected loan amount: ");
        double expectedLoanAmount= sc.nextDouble();
        System.out.println("Enter expected number of EMIs: ");
        int expectedEmis= sc.nextInt();


        double eligibleLoanAmount=0;
        int eligibleEmis=0;

        //Account number validation
        if(aacountNumber<1000 || aacountNumber>1999){
            System.out.println("Invalid account number");
            return;
        }
        //Account balance validation
        if(accountBalance<100000){
            System.out.println("Insufficient account balance");
            return;
        }
        //Loan eligibility check
        if(loanType.equalsIgnoreCase("Car") && salary>=25000){
            eligibleLoanAmount=500000;
            eligibleEmis=36;
        } 
        else if(loanType.equalsIgnoreCase("House") && salary>=50000){
            eligibleLoanAmount=6000000;
            eligibleEmis=60;
        } 
        else if(loanType.equalsIgnoreCase("Business") && salary>=75000){
            eligibleLoanAmount=7500000;
            eligibleEmis=84;
        } 
        else {
            System.out.println("The customer is not eligible for the loan");
            return;
        }
        if (expectedLoanAmount<=eligibleLoanAmount && expectedEmis<=eligibleEmis){
            System.out.println("Account number: " + aacountNumber);
            System.out.println("The customer is eligible for the loan");
            System.out.println("Eligible loan amount: " + eligibleLoanAmount);
            System.out.println("Eligible EMIs: " + eligibleEmis);
        } else {
            System.out.println("The customer is not eligible for the loan");
        }
        sc.close();
    }
}
