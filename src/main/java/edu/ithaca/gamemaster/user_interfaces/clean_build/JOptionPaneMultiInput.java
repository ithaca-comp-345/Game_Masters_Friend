package edu.ithaca.gamemaster.user_interfaces.clean_build;
import javax.swing.*;

public class JOptionPaneMultiInput {
    public String sessionName;
    public String campaignName;

    public JOptionPaneMultiInput(){
        JTextField xField = new JTextField(15);
        JTextField yField = new JTextField(15);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Session:"));
        myPanel.add(xField);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Campaign:"));
        myPanel.add(yField);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter Session Name and Parent Campaign", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("x value: " + xField.getText());
            sessionName = xField.getText();
            System.out.println("y value: " + yField.getText());
            campaignName = yField.getText();
        }
    }
}