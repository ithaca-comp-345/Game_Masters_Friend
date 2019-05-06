package edu.ithaca.gamemaster.user_interfaces.clean_build;

import edu.ithaca.gamemaster.Character;
import edu.ithaca.gamemaster.Player;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

public class CharacterEditor extends Container implements ActionListener {
    public JPanel CharacterEditor;
    public Player player;
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
    private JLabel throw_spacer;
    private JLabel throw_spacer2;

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
    private JTextField stealth;
    private JTextField survival;
    private JTextField armorClass;
    private JPanel BigClasses;
    private JTextField initiative;
    private JTextField speed;
    private JPanel hitPointsPanel;
    private JTextField hitDice;
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

        //more details
        classInput.setText(this.player.getCharClass());
        levelInput.setText(Integer.toString(this.player.getLevel()));
        raceInput.setText(this.player.getRace());
        alignmentInput.setText((this.player.getAlignment()));
        expInput.setText(Integer.toString(this.player.getExperience()));
        hitDice.setText(Integer.toString(this.player.getHitDiceAmt()));
        acrobatics.setText(Integer.toString(this.player.getAcrobatics()));
        animals.setText(Integer.toString(this.player.getAnimalHandling()));
        arcana.setText(Integer.toString(this.player.getArcana()));
        athletics.setText(Integer.toString(this.player.getAthletics()));
        deception.setText(Integer.toString(this.player.getDeception()));
        history.setText(Integer.toString(this.player.getHistory()));
        insight.setText(Integer.toString(this.player.getInsight()));
        intimidation.setText(Integer.toString(this.player.getIntimidation()));
        investigation.setText(Integer.toString(this.player.getInvestigation()));
        medicine.setText(Integer.toString(this.player.getMedicine()));
        nature.setText(Integer.toString(this.player.getNature()));
        perception.setText(Integer.toString(this.player.getPerception()));
        performance.setText(Integer.toString(this.player.getPerformance()));
        persuasion.setText(Integer.toString(this.player.getPersuasion()));
        religion.setText(Integer.toString(this.player.getReligion()));
        stealth.setText(Integer.toString(this.player.getStealth()));
        survival.setText(Integer.toString(this.player.getSurvival()));
        armorClass.setText(this.player.getArmorType());
        initiative.setText(Integer.toString(this.player.getInitiative()));
        speed.setText(Integer.toString(this.player.getSpeed()));

        //Attributes missing
    }



    public CharacterEditor(Player player, JLabel characterLabel, GMController controller,JFrame frame){

        this.player = controller.loggedInUser.getCharacter(characterLabel.getText());
        this.characterLabel = characterLabel;
        this.controller = controller;
        this.frame = frame;
        //setting stats for player
        saveChangesBtn.setActionCommand("save");
        saveChangesBtn.addActionListener(this);
        characterStats();

    }

    public CharacterEditor(Player player, String characterName, GMController controller, User loggedUser,JFrame frame){

        this.player = loggedUser.getCharacter(characterName);
        this.characterLabel = new JLabel();
        this.characterLabel.setText(characterName);
        this.controller = controller;
        this.frame = frame;
        //setting stats for player
        saveChangesBtn.setActionCommand("save");
        saveChangesBtn.addActionListener(this);
        characterStats();

    }
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();

        if (action.equals("save") && characterName.getText().equals(this.player.getName())) {

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Save Changes?", "Save", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                    Character newCharacter = controller.loggedInUser.getCharacter(this.player.getName());
                    //Updating player's information
                    this.player.setStrength(strenCombo.getSelectedIndex());
                    this.player.setDexterity(dextCombo.getSelectedIndex());
                    this.player.setConstitution(constCombo.getSelectedIndex());
                    this.player.setIntelligence(intelCombo.getSelectedIndex());
                    this.player.setWisdom(wisdoCombo.getSelectedIndex());
                    this.player.setCharisma(chariCombo.getSelectedIndex());

                    //updating more
                    this.player.setCharClass(classInput.getText());
                    System.out.println(classInput.getText() + " class");
                    this.player.setLevel(Integer.parseInt(levelInput.getText()));
                    this.player.setRace(raceInput.getText());
                    this.player.setAlignment(alignmentInput.getText());
                    this.player.setExperience(Integer.parseInt(expInput.getText()));
                    this.player.setHitDice(Integer.parseInt(hitDice.getText()), 0, 0);
                    this.player.setAcrobatics(Integer.parseInt(acrobatics.getText()));
                    this.player.setAnimalHandling(Integer.parseInt(animals.getText()));
                    this.player.setArcana(Integer.parseInt(arcana.getText()));
                    this.player.setAthletics(Integer.parseInt(athletics.getText()));
                    this.player.setDeception(Integer.parseInt(deception.getText()));
                    this.player.setHistory(Integer.parseInt(history.getText()));
                    this.player.setInsight(Integer.parseInt(insight.getText()));
                    this.player.setInvestigation(Integer.parseInt(investigation.getText()));
                    this.player.setMedicine(Integer.parseInt(medicine.getText()));
                    this.player.setNature(Integer.parseInt(nature.getText()));
                    this.player.setPerception(Integer.parseInt(perception.getText()));
                    this.player.setPerformance(Integer.parseInt(performance.getText()));
                    this.player.setPersuasion(Integer.parseInt(persuasion.getText()));
                    this.player.setReligion(Integer.parseInt(religion.getText()));
                    this.player.setStealth(Integer.parseInt(stealth.getText()));
                    this.player.setSurvival(Integer.parseInt(survival.getText()));
                    this.player.setArmorType(armorClass.getText());
                    this.player.setInitiative(Integer.parseInt(initiative.getText()));
                    this.player.setSpeed(Integer.parseInt(speed.getText()));

                    newCharacter = this.player;
                    //Closing Editor Frame
                    this.frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    this.frame.dispose();
                }

        }else{
            System.out.println("character name changed, will lose all stats");
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Changing the name of your character will erase all its stats, are you sure you want to change the name?", "Warning!",dialogButton);

            if(dialogResult == JOptionPane.YES_OPTION){
                this.player.setName(characterName.getText());
                controller.loggedInUser.addCharacter(this.player);
                characterLabel.setText(this.player.getName());
                this.frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                this.frame.dispose();
            }else if(dialogResult == JOptionPane.NO_OPTION){
                characterName.setText(this.player.getName());
            }
        }

    }

}


