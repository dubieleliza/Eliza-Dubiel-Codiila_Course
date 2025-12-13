package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {

    private Connection conn;
    private static DbManager dbManagerInstance;

    private DbManager() throws SQLException {
        Properties props = new Properties();
        props.put("user", "root");
        props.put("password", "Pryma!19");

        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/projekty"
                        + "?allowPublicKeyRetrieval=true"
                        + "&useSSL=false"
                        + "&serverTimezone=Europe/Warsaw",
                props
        );
    }

    public static DbManager getInstance() throws SQLException {
        if (dbManagerInstance == null) {
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }

    public Connection getConnection() {
        return conn;
    }
}
// ke
