package edu.ithaca.gamemaster.user_interfaces.clean_build;

import javax.swing.*;

public class JOptionPaneCharacter {
    public String characterName;
    public String username;

    public JOptionPaneCharacter(){
        JTextField xField = new JTextField(15);
        JTextField yField = new JTextField(15);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Character:"));
        myPanel.add(xField);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("User:"));
        myPanel.add(yField);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter Character Name and User's Name", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("x value: " + xField.getText());
            characterName = xField.getText();
            System.out.println("y value: " + yField.getText());
            username = yField.getText();
        }
    }
}
