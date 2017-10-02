package mvc;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.System.exit;

/**
 * Created by drncl on 01/10/2017.
 */
public class Controler {

    private JTextField input;
    private Connection connection;

    public Controler() {
        String url = "jdbc:mysql://localhost:3306/basics";
        String username = "java";
        String password = "java";

        System.out.println("Connecting database...");

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

        System.out.println("Database connected!");

    }

    public void setInput(TextField input) {
        this.input = input;
    }

    public void processInput() {
        System.out.println(input.getText());

        String requete = "insert into list values ('" + input.getText() +  "')";

        System.out.println(requete);

        try {
            Statement stmt = connection.createStatement();
            int nbMaj = stmt.executeUpdate(requete);
            System.out.println("nb mise a jour = " + nbMaj);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        input.setText("");
    }


}
