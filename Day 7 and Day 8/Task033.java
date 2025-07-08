class Parent {
    String items;
    int cost;
    void purchase_list() {
        items = "Tomatoes";
        cost = 40;
    }
}
public class Task033 extends Parent {
    void billing() {
        super.items = "Potatoes";   // using super to access parent variables
        super.cost = 50;
        System.out.println("Inside billing() method:");
        System.out.println("Items: " + super.items);
        System.out.println("Cost: " + super.cost);
    }
    public static void main(String[] args) {
        Task033 m = new Task033();  // create object of subclass
        m.purchase_list();    // set initial values from parent class
        System.out.println("After purchase_list():");
        System.out.println("Items: " + m.items);  // inherited
        System.out.println("Cost: " + m.cost);
        m.billing();          // now override using super
    }
}