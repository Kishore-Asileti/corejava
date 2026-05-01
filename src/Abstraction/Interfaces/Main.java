package Abstraction.Interfaces;

public class Main {
    public static void main(String[] args) {

        // Payment p = new CreditCardPayment(); // Upcasting using Payment interface
        // p.pay(1000); // This will work because pay is defined in the Payment interface
        // p.giveLoan(5000); wont work because giveLoan is not defined in the Payment interface


        // Loan x = new CreditCardPayment();  // Upcasting using Loan interface
        // x.giveLoan(5000);// This will work because giveLoan is defined in the Loan interface
        // x.pay(1000); // This will not work because pay is not defined in the Loan interface


        CreditCardPayment p = new CreditCardPayment(); // No upcasting, using the class directly
        p.pay(1000);
        p.giveLoan(5000);
    }
}
