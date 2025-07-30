import java.io.FileWriter;
import java.io.IOException;

public class HomeTask03_SRPViolation {

    static class Customer {
        String name;
        String custID;

        public Customer(String name, String custID) {
            this.name = name;
            this.custID = custID;
        }

        public String getName() {
            return name;
        }

        public String getCustID() {
            return custID;
        }

        // SRP Violation: saving data logic is inside the customer class
        public void saveData() {
            try {
                FileWriter fw = new FileWriter(name.trim() + ".txt");
                fw.write("The customer name is " + name + "\t");
                fw.write("The customer ID is " + custID + "\t");
                fw.close();
                System.out.println("The data is saved in a file named after the customer.");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Customer cobj = new Customer("Prasunamba", "C001");
        cobj.saveData(); // Mixing customer data with file saving logic
    }
}