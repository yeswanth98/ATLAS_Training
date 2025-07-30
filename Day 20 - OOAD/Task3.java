interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class BitcoinPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
    }
}

class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}

class Task3 {
    public static void main(String[] args) {
        PaymentProcessor processor1 = new PaymentProcessor(new CreditCardPayment());
        processor1.processPayment(100.0);

        PaymentProcessor processor2 = new PaymentProcessor(new PayPalPayment());
        processor2.processPayment(200.0);

        PaymentProcessor processor3 = new PaymentProcessor(new BitcoinPayment());
        processor3.processPayment(300.0);
    }
}
