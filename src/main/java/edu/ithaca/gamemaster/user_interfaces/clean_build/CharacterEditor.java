package edu.ithaca.gamemaster.user_interfaces.clean_build;

import edu.ithaca.gamemaster.Character;

import javax.swing.*;
import java.awt.*;

public class CharacterEditor extends Container {
    public JPanel CharacterEditor;
    public Character player;
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

    public void characterStats() {

        characterName.setText(this.player.getName());


    }

    public CharacterEditor(Character player){
        this.player = player;
        //setting stats for player
        characterStats();
    }



//    public static void main(String[] args){
//        JFrame frame = new JFrame();
//        frame.setSize(1100,900);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//
//        frame.setContentPane(new CharacterEditor());
//        frame.setVisible(true);
//    }
}


