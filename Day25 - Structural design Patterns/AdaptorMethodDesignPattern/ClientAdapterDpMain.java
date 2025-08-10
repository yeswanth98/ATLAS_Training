package AdaptorMethodDesignPattern;

public class ClientAdapterDpMain {
    public static void main(String[] args) {
        Iphone iphone = new Iphone16Adapter(); // Using Adapter
        iphone.onCharge();   // "I am charging iPhone 16"
        iphone.offCharge();  // "Stopped charging iPhone 16"
    }
}
