import java.util.Scanner;
public class Task006 {
    public static void main(String[] args) {
        String id;
        int pwd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id: ");
        id = sc.nextLine();
        System.out.println("Enter your pwd: ");
        pwd = sc.nextInt();
        System.out.println("Hi, \n Your login id is "+id+"\n And your pwd is "+pwd);
    }
}
