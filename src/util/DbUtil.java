package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        else {
            try {
                //Properties prop = new Properties();
                
                String user = "root";
                String password = "pr3t3nd3r";
                // Para quem for usar MySql
                Class.forName("com.mysql.jdbc.Driver"); 
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbagenda", user, password);// Para quem for usar MySql
                // Para quem for usar Postgresql
                //Class.forName("org.postgresql.Driver");
                //connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbagenda",user, password);// Para quem for usar Postgres
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }

    }
}