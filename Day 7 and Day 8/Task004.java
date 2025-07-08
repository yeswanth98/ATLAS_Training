public class Task004 {
    public static void main(String[] args) {
        add(50,25);
        subtract(50,25);
        product(50,25);
        division(50,25);
    }
    public static int add(int a,int b){
        int result = a+b;
        System.out.println("Add: "+result);
        return result;
    }
    public static int subtract(int a,int b){
        int result = a-b;
        System.out.println("Subtract: "+result);
        return result;
    }
    public static int product(int a,int b){
        int result = a*b;
        System.out.println("Product: "+result);
        return result;
    }
    public static int division(int a,int b){
        int result = a/b;
        System.out.println("Divide: "+result);
        return result;
    }
}
