import java.util.Scanner;
class Task008 {
    public static void main(String[] args) {
        String reversedName = "";
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        for (int i=name.length()-1;i>=0;i--){
            reversedName += name.charAt(i);
        }
        System.out.println(reversedName);
        sc.close();
    }
}