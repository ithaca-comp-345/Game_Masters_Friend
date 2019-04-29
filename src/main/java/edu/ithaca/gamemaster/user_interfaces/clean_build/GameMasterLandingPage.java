package edu.ithaca.gamemaster.user_interfaces.clean_build;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameMasterLandingPage extends JFrame implements ActionListener {
    public JPanel LandingPage;
    private JButton createANewCharacterButton;
    private JButton createANewCampaignButton;
    private JButton createANewNPCButton;
    private JButton startANewSessionButton;
    private JPanel ActiveCampaigns;
    private JPanel ActiveSessions;
    private JButton viewAllPastCampaignsButton;
    private JButton viewEditButton1;
    private JPanel CharacterList;
    private JPanel NPCList;
    private JButton viewEditButton;
    private JPanel PastSessions;
    private JPanel CompletedCampaigns;
    private JButton vewAllPastSessionsButton;
    private JButton viewEditButton2;
    private JLabel campaignL1;
    private JLabel campaignL2;
    private JLabel sessionL1;
    private JLabel sessionL2;
    private JTable PastSessionsTable;

    private Login accounts;

    private void createUIComponents() {
        JLabel test = new JLabel();
        test.setText("Testing Stuff");
        test.add(LandingPage);

        createANewCampaignButton.setActionCommand("CreateCampaign");
        createANewCampaignButton.addActionListener(this);

    }

    public GameMasterLandingPage(Login continuity){
        accounts = continuity;
        createUIComponents();
        String[][] testData = {{
                "OldSession1","TestCampaign2", "4/20/19",}
        };

        String[] columns = {"Name", "Campaign", "Date"};
        PastSessionsTable = new JTable(testData,columns);
    }

    public void actionPerformed(ActionEvent ae){
        String action = ae.getActionCommand();
        if(action.equals("CreateCampaign")){
            String newCampaign = JOptionPane.showInputDialog("What is the name of your new Campaign?", null);
            System.out.println("New Campaign: " + newCampaign);
            campaignL1.setText(newCampaign);
        }
    }
}



