package com.kodilla.jdbc;

import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DbManagerTestSuite {

    private static DbManager dbManager;
    private static Connection connection;

    @BeforeAll
    static void setup() throws SQLException {
        dbManager = DbManager.getInstance();
        connection = dbManager.getConnection();
    }

    @Test
    void testConnect() {
        Assertions.assertNotNull(connection);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        // Given
        String sql = """
                SELECT u.FIRSTNAME, u.LASTNAME
                FROM users u
                JOIN posts p ON u.ID = p.USER_ID
                GROUP BY u.ID
                HAVING COUNT(p.ID) >= 2
                """;

        Statement statement = connection.createStatement();

        // When
        ResultSet rs = statement.executeQuery(sql);

        // Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(
                    rs.getString("FIRSTNAME") + " " +
                            rs.getString("LASTNAME")
            );
            counter++;
        }

        Assertions.assertTrue(counter >= 0);

        rs.close();
        statement.close();
    }
}
