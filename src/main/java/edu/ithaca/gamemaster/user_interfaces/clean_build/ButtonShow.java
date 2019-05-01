package edu.ithaca.gamemaster.user_interfaces.clean_build;

import javax.swing.*;

public class ButtonShow {

    public static void buttonHide(JLabel labelToCheck, JButton buttonToShow){
        if(labelToCheck.getText().equals("")){
            buttonToShow.setVisible(false);
        }
        else{
            buttonToShow.setVisible(true);
        }
    }
}
