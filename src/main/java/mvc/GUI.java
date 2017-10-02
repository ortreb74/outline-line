package mvc;

import javax.swing.*;
import java.awt.*;

/**
 * Created by drncl on 01/10/2017.
 */

public class GUI extends JFrame {

    Controler controler = new Controler();

    public GUI() {
        this.setTitle("Work on a line");
        this.setSize(1000, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        GridLayout g=new GridLayout(1,1);

        JPanel container = new JPanel();
        container.setLayout(g);
        TextField textField = new TextField(controler);

        //textField.setFocusTraversalKeysEnabled(false);

        container.add(textField);

        this.setContentPane(container);
        this.setVisible(true);
    }

}
