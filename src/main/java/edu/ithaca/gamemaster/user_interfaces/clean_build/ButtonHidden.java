package edu.ithaca.gamemaster.user_interfaces.clean_build;

import javax.swing.*;

public class ButtonHidden {
    public static void twoButtonHide(JLabel labelToCheck, JButton button1, JButton button2){
        if(labelToCheck.getText().equals("")){
            button1.setVisible(false);
            button2.setVisible(false);
        }
        else{
            button1.setVisible(true);
            button2.setVisible(true);
        }
    }
}
