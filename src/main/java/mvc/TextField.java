package mvc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by drncl on 01/10/2017.
 */
public class TextField extends JTextField implements ActionListener, FocusListener {
    //Controler controler;

    Controler controler;

    public TextField(Controler controler) {
        super();
        this.controler = controler;

        controler.setInput(this);


        this.addActionListener(this);
        this.addFocusListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {// calcul le produit en croix
        //float d=f.calcul();
        controler.processInput();
        System.out.println("action");
    }

    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("gain focus");
    }

    @Override
    public void focusLost(FocusEvent e) {
        System.out.println("lost focus");
    }
}

