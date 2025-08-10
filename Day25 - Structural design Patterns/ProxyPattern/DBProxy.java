package ProxyPattern;

import java.util.Objects;

class DBProxy implements DBExecutor {
    private String id;
    private DB db;

    public DBProxy(String id) {
        this.id = id;
        this.db = new DB();
    }

    @Override
    public void runQuery(String type) {
        if (type.equalsIgnoreCase("DELETE") && !Objects.equals(this.id, "ADMIN")) {
            System.out.println("Sorry! Access denied for user: " + id);
            return;
        }
        db.runIt(type, this.id);
    }
}