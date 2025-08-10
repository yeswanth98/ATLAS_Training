package ProxyPattern;

public class ProxyPatternTest {
    public static void main(String[] args) {
        DBExecutor admin = new DBProxy("ADMIN");
        admin.runQuery("READ");
        admin.runQuery("UPDATE");
        admin.runQuery("DELETE");

        DBExecutor manager = new DBProxy("MANAGER");
        manager.runQuery("READ");
        manager.runQuery("UPDATE");
        manager.runQuery("DELETE"); // blocked
    }
}