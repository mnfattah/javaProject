package sixthpackage;

import fourthpackage.PracticeProperties;
import fourthpackage.PropertiesFileUtils;
//import sixthpackage.PropertiesFileUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Properties;

public class ConnectionForSql2 {

   // private static PracticeProperties PropertiesFileUtils;

    public static Connection connectToMySqlDB() throws ClassNotFoundException, SQLException, IOException {
        String username = PropertiesFileUtils.getDataFromPropertiesFile("src/sixthpackage/config.properties", "username");
        String password = PropertiesFileUtils.getDataFromPropertiesFile("src/sixthpackage/config.properties", "password");
        String dbName = PropertiesFileUtils.getDataFromPropertiesFile("src/sixthpackage/config.properties", "dbName");

        String url = "jdbc:mysql://localhost:3306/" + dbName;// + "";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url,username,password);
        return connection;
    }

    public static void clearDatabase(Statement statement, Connection connection) throws SQLException {
       if(statement != null){
           statement.close();
       }
       if (connection != null){
           connection.close();
       }
    }

}
