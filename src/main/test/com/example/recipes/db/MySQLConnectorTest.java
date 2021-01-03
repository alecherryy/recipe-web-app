package com.example.recipes.db;

import org.junit.Before;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.*;

/**
 * Test suite for the MySQLConnector class.
 */
public class MySQLConnectorTest {
    private MySQLConnector conn;
    private String query = "SELECT VERSION()";

    /**
     * Initial set up.
     */
    @Before
    public void setUp() {
        conn = new MySQLConnector();
    }

    /**
     * Test class constructor.
     */
    @Test
    public void testClassConstructor() throws SQLException {
        assertNotNull(conn.getConnection());

        // test db MySQL version
        String query = "SELECT VERSION()";
        Statement st = conn.getConnection().createStatement();

        try {
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {

                assertEquals("8.0.21", rs.getString(1));
            }

        } catch (SQLException e) {
            // do nothing
        }
    }
}