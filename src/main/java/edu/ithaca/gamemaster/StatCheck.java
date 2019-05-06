package edu.ithaca.gamemaster;

import java.util.ArrayList;

public class StatCheck {

    /**
     * Performs a skill check for an action performed automatically without taking an entered dice roll
     * @param character an array of characters
     * @param stat what skill is being checked
     * @param numRolls how many rolls are being performed
     * @param threshold % of passes needed to pass the check
     * @param difficulty skill check difficulty decided by GM
     * @return returns true if the check passed or false is check failed
     */
    public boolean autoSkillCheck(Character character, String stat, int numRolls, double threshold, int difficulty){
        int passCount = 0;
        int skillMod = getSkillModifier(character,stat);
        Dice die = new Dice(20);
        threshold =threshold/100;
        boolean result = false;

        for (int i = 0; i < numRolls ; i++) {
            if(skillMod+die.roll()>=difficulty){
                passCount++;
            }
        }

        if(passCount/numRolls>=threshold){
            result = true;
        }

        return result;
    }
    /**
     * Performs a skill check for an action performed
     * @param character an array of characters
     * @param stat what skill is being checked
     * @param diceRoll players diceRoll
     * @param numRolls how many rolls are being performed
     * @param threshold % of passes needed to pass the check
     * @param difficulty skill check difficulty decided by GM
     * @return returns true if the check passed or false is check failed
     */
    public boolean manualSkillCheck(Character character, String stat, int diceRoll, int numRolls, double threshold, int difficulty){
        int passCount = 0;
        int skillMod = getSkillModifier(character,stat);
        threshold = threshold/100;
        boolean result = false;

        for (int i = 0; i < numRolls ; i++) {
            if(skillMod+diceRoll>=difficulty){
                passCount++;
            }
        }

        if(passCount/numRolls>=threshold){
            result = true;
        }

        return result;
    }

    /**
     * Gets proper skill modifier for a skill check
     * @param character character retrieving skill for
     * @param skill skill being retrieved
     * @return returns skill modifier
     */
    private int getSkillModifier(Character character, String skill){
        int charStat =0;

        switch (skill) {
            case "CHA":
                charStat = character.getCharisma();
                break;
            case "DEX":
                charStat = character.getDexterity();
                break;
            case "INT":
                charStat = character.getIntelligence();
                break;
            case "STR":
                charStat = character.getStrength();
                break;
            case "WIS":
                charStat = character.getWisdom();
                break;
        }
        switch (charStat){
            case 1:
                charStat = -5;
                break;
            case 2|3:
                charStat = -4;
                break;
            case 4|5:
                charStat = -3;
                break;
            case 6|7:
                charStat = -2;
                break;
            case 8|9:
                charStat = -1;
                break;
            case 10|11:
                charStat = 0;
                break;
            case 12|13:
                charStat = 1;
                break;
            case 14|15:
                charStat = 2;
                break;
            case 16|17:
                charStat = 3;
                break;
            case 18|19:
                charStat = 4;
                break;
            case 20|21:
                charStat = 5;
                break;
            case 22|23:
                charStat = 6;
                break;
            case 24|25:
                charStat = 7;
                break;
            case 26|27:
                charStat = 8;
                break;
            case 28|29:
                charStat = 9;
                break;
            case 30:
                charStat = 10;
                break;
        }
        return charStat;
    }

    /**
     * Performs a skill check for multiple characters automatically without taking inputs for dice rolls
     * @param group an array of characters
     * @param stat what skill is being checked
     * @param numRolls how many rolls are being performed
     * @param threshold % of passes needed to pass the check
     * @param difficulty skill check difficulty decided by GM
     * @return returns true if the check passed or false is check failed
     */
    public boolean autoGroupSkillCheck(Character[] group, String stat, int numRolls, double threshold, int difficulty){
        int passCount = 0;
        boolean result = false;

        for (int i = 0; i < group.length  ; i++) {
            if(autoSkillCheck(group[i],stat,numRolls,threshold,difficulty)){
                passCount++;
            }
        }

        if((passCount/group.length)>=.5) {
            result = true;
        }

        return result;
    }

    /**
     * Performs a skill check for multiple characters
     * @param group an array of characters
     * @param stat what skill is being checked
     * @param diceRoll players dice roll
     * @param numRolls how many rolls are being performed
     * @param threshold % of passes needed to pass the check
     * @param difficulty skill check difficulty decided by GM
     * @return returns true if the check passed or false is check failed
     */
    public boolean manualGroupSkillCheck(Character[] group, String stat, int[] diceRoll, int numRolls, double threshold, int difficulty){
        int passCount = 0;
        boolean result = false;

        for (int i = 0; i < group.length  ; i++) {
            if(manualSkillCheck(group[i],stat,diceRoll[i],numRolls,threshold,difficulty)){
                passCount++;
            }
        }

        if((passCount/group.length)>=.5) {
            result = true;
        }

        return result;
    }

}
