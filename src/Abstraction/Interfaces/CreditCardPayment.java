package Abstraction.Interfaces;

public class CreditCardPayment implements Payment, Loan {
    @Override
    public void pay(double amount) {
        System.out.println("Paid using Credit Card: " + amount);
    }
    @Override
    public void giveLoan(int amount) {;
        System.out.println("Loan given: " + amount);
    }
}
