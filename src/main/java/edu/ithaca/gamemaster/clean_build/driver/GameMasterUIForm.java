package edu.ithaca.gamemaster.clean_build.driver;

import javax.swing.*;
import java.io.IOException;

public class GameMasterUIForm {
    private JButton loginButton;
    private JPasswordField passwordField1;
    private JTextField textField1;
    private JTextField textField2;
    private JPasswordField passwordField2;
    private JButton createAccountButton;
    private JLabel ImageIcon;
    private JPanel applet;

    private void createUIComponents() {
        // TODO: place custom component creation code here

        ImageIcon = new JLabel(new ImageIcon("d&d.jpg"));
    }

    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame("Game Masters Companion");
        frame.setSize(500,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new GameMasterUIForm().applet);
        frame.setVisible(true);
    }
}
