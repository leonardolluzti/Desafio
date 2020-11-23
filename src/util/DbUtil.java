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
                String user = "admin";
                String password = "#L30n4rd0";
                // Para quem for usar MySql
                Class.forName("com.mysql.cj.jdbc.Driver"); 
                connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC", user, password);
                // Para quem for usar Postgresql
                //Class.forName("org.postgresql.Driver");
                //connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbagenda",user, password);
                System.out.print("conectado");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
				e.printStackTrace();
			} 
            return connection;
        }

    }
}