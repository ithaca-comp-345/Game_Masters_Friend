package edu.ithaca.gamemaster;
import java.util.Random;
public class AttackRoll {

    Dice d20 = new Dice(20);

    public int resultAttackPvP(Character player1, Character player2){

        int totalAttack = 0;
        totalAttack = d20.roll();
        //TODO return
        return totalAttack;
    }
    public int resultAttackPvNPV(Character player, NPC npc){

        return 0;
    }

}
