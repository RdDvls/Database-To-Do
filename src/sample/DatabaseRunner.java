package sample;

import java.sql.Connection;
import java.sql.DriverManager;



public class DatabaseRunner  {
    public static void main(String[] args) throws Exception {
        ToDoDatabase db = new ToDoDatabase();
        db.init();
    }
}