package edu.ithaca.gamemaster.user_interfaces.clean_build;

import edu.ithaca.gamemaster.NPC;
import edu.ithaca.gamemaster.Player;
import edu.ithaca.gamemaster.Character;
import edu.ithaca.gamemaster.user_interfaces.SessionUI;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.FileAlreadyExistsException;

public class CampaignUI extends JPanel implements ActionListener {
    private JButton addSession;
    public JPanel panel;
    private JList<Session> sessionList;
    private JList<User> playerList;
    private JButton addCharacterButton;
    private JList<Player> characterList;
    private JButton addNPCButton;
    private JList<NPC> npcList;
    private JLabel user;

    DefaultListModel<Session> sessions = new DefaultListModel<>();
    DefaultListModel<NPC> npcs = new DefaultListModel<>();
    DefaultListModel<User> players = new DefaultListModel<>();
    DefaultListModel<Player> characters = new DefaultListModel<>();


    private Campaign campaign;
    public GMController controller;
    public static JFrame campaignFrame;
    private User loggedUser;

    JFrame characterFrame = new JFrame("Edit");

    public CampaignUI(Campaign campaign, GMController controller, JFrame frame, User loggedUser){
        this.campaign = campaign;
        this.controller = controller;
        this.campaignFrame = frame;
        this.loggedUser = loggedUser;

        sessionList.setModel(sessions);
        npcList.setModel(npcs);
        playerList.setModel(players);
        characterList.setModel(characters);

        user.setText(loggedUser.getName());

        this.controller = new GMController();

        int i = 0;
        while(i<campaign.getSessionListClean().size()){
            sessions.addElement(campaign.getSessionListClean().get(i));
            i++;
        }
        i = 0;
        while (i<campaign.getNPCList().size()){
            npcs.addElement(campaign.getNPCList().get(i));
            i++;
        }
        i=0;
        while(i<campaign.getPlayerList().size()){
            players.addElement(campaign.getPlayerList().get(i));
            i++;
        }
        i=0;
        while(i<campaign.getCharacterList().size()){
            characters.addElement(campaign.getCharacterList().get(i));
        }

        createUIComponents();
    }

    private void createUIComponents() {
        addSession.setActionCommand("AddSession");
        addSession.addActionListener(this);

        addCharacterButton.setActionCommand("AddCharacter");
        addCharacterButton.addActionListener(this);

        addNPCButton.setActionCommand("AddNPC");
        addNPCButton.addActionListener(this);

        sessionList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Session s = sessionList.getSelectedValue();
                System.out.println();
                campaignFrame.setSize(1150, 650);
                campaignFrame.setContentPane(new SessionUI(s, campaign, campaignFrame, controller, loggedUser).Session);
                campaignFrame.setVisible(true);
            }
        });

        npcList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                NPC npc = npcList.getSelectedValue();
            }
        });
        characterList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Player character = characterList.getSelectedValue();
                Editor(controller, loggedUser, campaignFrame, character.getName());
            }
        });

        playerList.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                User player = playerList.getSelectedValue();
            }
        });



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if(action.equals("AddSession")){
            String session= JOptionPane.showInputDialog("Session name: ", null);
            System.out.println(session);
            campaign.createSession(session);
            sessions.addElement(campaign.getSessionListClean().get(campaign.getSessionListClean().size()-1));
        }
        if(action.equals("AddNPC")){
            String npcName = JOptionPane.showInputDialog("What is the name of your new NPC?");
            System.out.println(npcName);
            try{
                NPC newNPC = loggedUser.createNPC(npcName);
                campaign.addNPC(npcName,newNPC);
                npcs.addElement(campaign.getNPCList().get(campaign.getNPCList().size()-1));
            }catch (FileAlreadyExistsException a){
                a.printStackTrace();
                JOptionPane.showMessageDialog(null, "NPC already exists");
            }
        }
        if(action.equals("AddCharacter")){
            JOptionPaneCharacter charOpt = new JOptionPaneCharacter();
            String characterName = charOpt.characterName;
            String charUser = charOpt.username;
            try{
                Player character = loggedUser.createCharacter(characterName);
                campaign.addCharacter(characterName, character);
                characters.addElement(campaign.getCharacterList().get(campaign.getCharacterList().size()-1));
            }catch (FileAlreadyExistsException a){
                a.printStackTrace();
                JOptionPane.showMessageDialog(null, "Character already exists");
            }
        }

    }

    public void Editor(GMController controller, User loggedUser,JFrame frame, String characterName){
        Player characterToEdit = loggedUser.getCharacter(characterName);
        frame.setSize(1150, 650);
        frame.setContentPane(new CharacterEditor(characterToEdit, characterName, controller, loggedUser,frame).CharacterEditor);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
