package tasks;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection{
    
    public static void connect() {
        String url = "jdbc:sqlite:/home/jrichardson12/db/tasks.db";

        try(var conn = DriverManager.getConnection(url)) {
            System.out.println("Connection to SQLite has been established");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
