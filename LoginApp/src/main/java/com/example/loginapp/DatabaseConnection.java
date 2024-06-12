package com.example.loginapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    public static Connection databaseLink;

    public static Connection getConnection(){
//        String databaseName = "bd";
//        String user = "root";
//        String password = "";
//        String url = "jdbc:mysql://localhost/" + databaseName;

        String databaseName = "temp";
        String user = "postgres";
        String password = "admin";
        String url = "jdbc:postgresql://localhost:5432/" + databaseName;

        try {
            Class.forName("org.postgresql.Driver");
            databaseLink = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  databaseLink;
    }

    public static Statement getStatement() throws SQLException {
        return  getConnection().createStatement();
    }
}
