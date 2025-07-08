public class Task007 {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.msg();
    }
}
class Customer{
        public static void msg(){
            String msg = "Customer class has been created";
            System.out.println(msg);
        }
}
