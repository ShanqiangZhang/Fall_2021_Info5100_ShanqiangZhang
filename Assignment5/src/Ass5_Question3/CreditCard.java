package Ass5_Question3;

public class CreditCard implements PaymentStrategy{
    public String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int totalPrice) {
        System.out.println("CreditCard : $" + totalPrice);
    }
}
