package SingletonDesignPattern;

public class Driver {
    public static void main(String[] args) {
        SingletonDPconfigManager config = SingletonDPconfigManager.getConfigManagerInstance();
        SingletonDPconfigManager config1 = SingletonDPconfigManager.getConfigManagerInstance();
        String value = config.getProperty("database.url");
        String value2 = config1.getProperty("database.url");
        System.out.println("Database URL: " + value);
        System.out.println("Database URL: " + value2);
    }
}
