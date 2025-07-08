import java.util.Scanner;
public class Task012 {
    public static void main(String[] args) {
        String loginid;
        String pwd;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your login id and password:");
            loginid = sc.nextLine();
            pwd = sc.nextLine();

            if (loginid.equals("Yeswanth") && pwd.equals("12345678")) {
                count++;
                System.out.println("You have logged in for " + count + " times");
            } else {
                System.out.println("Incorrect login. Exiting...");
                break;
            }
        } while (true);
        sc.close();
    }
}
