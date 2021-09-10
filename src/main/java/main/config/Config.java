package main.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    public static final String FV_GET_URL = "fv.get.url";
    public static final String FV_POST_URL = "fv.post.url";

    private final static Properties properties = new Properties();

    public synchronized static String getProperty(String name) {
        if(properties.isEmpty()) {
            try (InputStream is = Config.class.getClassLoader().getResourceAsStream("config.properties")){
                properties.load(is);
            } catch (IOException ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
        return properties.getProperty(name);
    }
}
