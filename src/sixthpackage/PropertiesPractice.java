package sixthpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class PropertiesPractice {

    public static Connection inputFromProperties() throws IOException, SQLException {

        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("src/sixthpackage/config.properties");
        p.load(fis);

        String dbname = p.getProperty("dbname");
        String username = p.getProperty("username");
        String password = p.getProperty("password");
        String url1 = p.getProperty("url");

        String url = url1;

        // Class.forName("com.mysql.cj.jdbc.Driver");

        Connection c = DriverManager.getConnection(url, username, password);

        return c;

    }


    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {


        Statement s = inputFromProperties().createStatement();

        ResultSet rs = s.executeQuery("select * from students");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String state = rs.getString("state");
            String zipcode = rs.getString("zipcode");
            System.out.println(id + " " + name + " " + state + " " + zipcode);
        }

    }
}
