class Employee {
    private int pwd;
    protected int Salary;
    public int empid;

    public Employee(){
        pwd = 1234;
        Salary = 30000;
        empid = 101;
    }

    public int getPwd(){
        return pwd;
    }

    public void setPwd(int pwd){
        this.pwd = pwd;
    }
}

public class Task037 extends Employee {
    public void Hr() {
        setPwd(1254);
        Salary = 50000;
        empid = 10001;
    }
    public static void main(String[] args) {
        Task037 obj = new Task037();
        System.out.println("EmpID: " + obj.empid);
        System.out.println("Salary: " + obj.Salary);
        System.out.println("Password: " + obj.getPwd());
    }
}