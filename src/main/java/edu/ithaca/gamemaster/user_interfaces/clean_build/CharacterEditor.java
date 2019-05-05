package edu.ithaca.gamemaster.user_interfaces.clean_build;

import edu.ithaca.gamemaster.Character;
import edu.ithaca.gamemaster.Player;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;

public class CharacterEditor extends Container implements ActionListener {
    public JPanel CharacterEditor;
    public Character player;
    private GMController controller;
    public JLabel characterLabel;
    private JFrame frame;

    private JTextField characterName;
    private JComboBox strenCombo;
    private JComboBox dextCombo;
    private JComboBox constCombo;
    private JComboBox intelCombo;
    private JComboBox wisdoCombo;
    private JComboBox chariCombo;
    private JPanel Attributes;
    private JPanel Throws;
    private JTextField inspirationInput;
    private JComboBox strModCombo;
    private JComboBox dexModCombo;
    private JComboBox conModCombo;
    private JComboBox intModCombo;
    private JComboBox wisModCombo;
    private JComboBox chaModCombo;
    private JTextField proficiencyInput;
    private JLabel throw_spacer;
    private JLabel throw_spacer2;
    private JTextField strThrow;
    private JTextField dexThrow;
    private JTextField constThrow;
    private JTextField intelThrow;
    private JTextField wisdoThrow;
    private JTextField chariThrow;
    private JTextField acrobatics;
    private JTextField animals;
    private JTextField arcana;
    private JTextField athletics;
    private JTextField deception;
    private JTextField history;
    private JTextField insight;
    private JTextField intimidation;
    private JTextField investigation;
    private JTextField medicine;
    private JTextField nature;
    private JTextField perception;
    private JTextField performance;
    private JTextField persuasion;
    private JTextField religion;
    private JTextField sleight;
    private JTextField stealth;
    private JTextField survival;
    private JTextField textField1;
    private JTextArea languagesInput;
    private JTextField armorClass;
    private JPanel BigClasses;
    private JTextField initiative;
    private JTextField speed;
    private JPanel hitPointsPanel;
    private JTextField hitpointsMax;
    private JTextField hitpointsCurrent;
    private JTextField hitDice;
    private JRadioButton success1;
    private JRadioButton success2;
    private JRadioButton success3;
    private JRadioButton fail1;
    private JRadioButton fail2;
    private JRadioButton fail3;
    private JTextArea attacksAndSpellsInput;
    private JTextArea textArea1;
    private JTextField classInput;
    private JTextField levelInput;
    private JTextField raceInput;
    private JTextField alignmentInput;
    private JTextField expInput;
    private JButton saveChangesBtn;

    public void characterStats() {


        characterName.setText(this.player.getName());
        strenCombo.setSelectedIndex(this.player.getStrength());
        dextCombo.setSelectedIndex(this.player.getDexterity());
        constCombo.setSelectedIndex((this.player.getConstitution()));
        intelCombo.setSelectedIndex(this.player.getIntelligence());
        wisdoCombo.setSelectedIndex(this.player.getWisdom());
        chariCombo.setSelectedIndex((this.player.getCharisma()));

        //Attributes missing
    }



    public CharacterEditor(Player player, JLabel characterLabel, GMController controller,JFrame frame){

        this.player = player;
        this.characterLabel = characterLabel;
        this.controller = controller;
        this.frame = frame;
        //setting stats for player
        saveChangesBtn.setActionCommand("save");
        saveChangesBtn.addActionListener(this);
        characterStats();



    }
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();

        if (action.equals("save")) {

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would You Like to Save your Previous Note First?", "Save?", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {

                //Updating player's information
                this.player.setName(characterName.getText());
                this.player.setStrength(strenCombo.getSelectedIndex());
                this.player.setDexterity(dextCombo.getSelectedIndex());
                this.player.setConstitution(constCombo.getSelectedIndex());
                this.player.setIntelligence(intelCombo.getSelectedIndex());
                this.player.setWisdom(wisdoCombo.getSelectedIndex());
                this.player.setCharisma(chariCombo.getSelectedIndex());
                //updating landingPage
                this.characterLabel.setText(this.player.getName());
                controller.loggedInUser.addCharacter(new Player(this.player));
                //Closing Editor Frame
                this.frame.setVisible(false);

            }

        }

    }

}


