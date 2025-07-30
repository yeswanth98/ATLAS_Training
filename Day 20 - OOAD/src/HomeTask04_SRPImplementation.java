import java.io.FileWriter;
import java.io.IOException;

// Class that models customer data
class Customer {
    private String name;
    private String custID;

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
}

// Class responsible for saving customer data (I/O responsibility)
class CustomerDataSaver {

    public void saveData(Customer customer) {
        try {
            FileWriter fw = new FileWriter(customer.getName().trim() + ".txt");
            fw.write("The customer name is " + customer.getName() + "\t");
            fw.write("The customer ID is " + customer.getCustID() + "\t");
            fw.close();
            System.out.println("The data is saved in a file named after the customer.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

// Driver class to run the example
public class HomeTask04_SRPImplementation {
    public static void main(String[] args) {
        Customer customer = new Customer("Prasunamba", "C001");
        CustomerDataSaver saver = new CustomerDataSaver();
        saver.saveData(customer); // Now saving logic is separated
    }
}