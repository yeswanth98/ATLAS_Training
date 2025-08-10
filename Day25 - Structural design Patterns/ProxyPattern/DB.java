package ProxyPattern;

class DB {
    public void runIt(String type, String id) {
        System.out.println("User: " + id + " is running query: " + type);
    }
}