package SingletonDesignPattern;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SingletonDPconfigManager {
    private static SingletonDPconfigManager ConfigManagerInstance;
    private Properties properties;

    private SingletonDPconfigManager() {
        properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.prop")) {
            if (input == null) {
                System.out.println("we can't find config properties");
                return;
            }
            properties.load(input);
        } catch (IOException ioexp) {
            ioexp.printStackTrace();
        }
    }

    public String getProperty(String key) {

        return properties.getProperty(key);
    }

    public static synchronized SingletonDPconfigManager getConfigManagerInstance() {
        if (ConfigManagerInstance == null) {
            ConfigManagerInstance = new SingletonDPconfigManager();
        }
        return ConfigManagerInstance;
    }
}
