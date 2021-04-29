package fourthpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {

    public static void main(String[] args) throws IOException {


        Properties properties = new Properties();


        InputStream inputStream = new FileInputStream("src/fourthpackage/config.properties");

        properties.load(inputStream);

        String dbNameFromFile = properties.getProperty("dbName");
        String dbUserFromFile = properties.getProperty("dbUser");
        String dbPasswordFromFile = properties.getProperty("dbPassword");

        System.out.println(dbNameFromFile);
        System.out.println(dbUserFromFile);
        System.out.println(dbPasswordFromFile);

    }


}
