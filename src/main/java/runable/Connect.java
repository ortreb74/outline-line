package runable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by drncl on 01/10/2017.
 */

// https://stackoverflow.com/questions/2839321/connect-java-to-a-mysql-database

public class Connect {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/basics";
        String username = "java";
        String password = "java";

        System.out.println("Connecting database...");

        Connection connection;

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

        System.out.println("Database connected!");

        String requete = "insert into list values ('CREATE USER java@localhost IDENTIFIED BY java;')";

        try {
            Statement stmt = connection.createStatement();
            int nbMaj = stmt.executeUpdate(requete);
            System.out.println("nb mise a jour = " + nbMaj);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



}
