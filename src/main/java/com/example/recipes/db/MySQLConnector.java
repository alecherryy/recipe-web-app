package com.example.recipes.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class represents a MySQL Database connection.
 */
public class MySQLConnector {
    private Connection conn;
    private String url;
    private String user;
    private String password;

    /**
     * Class constructor.
     */
    public MySQLConnector() {
        setDatabaseProperties();

        try {
            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(MySQLConnector.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

    /**
     * Private method to set database credentials.
     */
    private void setDatabaseProperties() {
        Properties properties = new Properties();

        try (InputStream input = new FileInputStream("src/main/java/resources/db.properties")) {
            // load a properties file
            properties.load(input);

        } catch (IOException e) {
            e.printStackTrace();
        }

        url = properties.getProperty("db.credentials.url");
        user = properties.getProperty("db.credentials.user");
        password = properties.getProperty("db.credentials.password");
    }

    /**
     * Get and return database connection.
     *
     * @return database connection
     */
    public Connection getConnection() {
        return conn;
    }

}

