package sixthpackage;

import java.sql.*;
import java.util.ArrayList;

public class ConnectionForSql1 {
    public static void main(String[] args) throws SQLException {

        String username = "root";
        String password = "root1234";
        String dbName = "peoplentech";

        String url = "jdbc:mysql://localhost:3306/"+dbName;
        String query = "select * from students;";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("exception occured in driver");
            e.printStackTrace();
        }
        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        ResultSet table =statement.executeQuery(query);

        ArrayList<String> names = new ArrayList<>();
        while (table.next()){
            int idFromDb = table.getInt("id");
            String nameFromDb = table.getString("name");
            String stateFromDb = table.getString("state");
            String zipcodeFromDb = table.getString("zipcode");
            names.add(nameFromDb);
            System.out.println(idFromDb + " " + nameFromDb + " " + stateFromDb + " " + zipcodeFromDb);

        }

        System.out.println(names);


        statement.close();
        connection.close();

    }
}
