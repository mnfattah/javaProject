package fourthpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PracticeProperties {


    public static String getDataFromPropertiesFile(String fileLocation, String key) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(fileLocation);
        properties.load(inputStream);

        String value = properties.getProperty(key);
        return value;


    }


    public static void main(String[] args) throws IOException {
        // use the below code
        // make them reusable to read any file's any data
        // meaning create a method which will take 2 params
        // one the location of the file, one the key that you want to read
        // based on the key and file path your method should return the value from the propertie file
        String m = getDataFromPropertiesFile("src/fourthpackage/config.properties", "dbUser");
        System.out.println(m);


        // if a class has abstract before class name we can't create obj the traditional way

        /*try {
            InputStream inputStream = new FileInputStream("src/fourthpackage/confg.properties");
        } catch (FileNotFoundException e) {
            System.out.println("please fix the file path . there wa a FileNotFoundException exception");
            e.printStackTrace();
        }*/

        //InputStream inputStream = new FileInputStream("src/fourthpackage/config.properties");


    }


}
