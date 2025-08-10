package FacadePattern;

public class FacadePatternTest {
    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade();
        bankFacade.getFdDetails("ACC12345");
    }
}