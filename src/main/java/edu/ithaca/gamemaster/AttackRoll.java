package edu.ithaca.gamemaster;
import java.util.Random;


public class AttackRoll {

    Dice d20 = new Dice(20);

    //takes two players and calculates the damage towards player2

    public void attackPvP(Character player1, Character player2){
        int totalAttack = 0;
        totalAttack = d20.roll();
        if(totalAttack == 1){
            System.out.println("Miss");
        }else {
            totalAttack = totalAttack + player1.getStrength();
            player2.setHP(player1.getHP() - totalAttack);
        }

    }

    //takes one player and NPC, calculates the damage towards NPC
    // and reduces HP
    public void attackPvNPC(Character player, NPC npc){
        int totalAttack = 0;
        totalAttack = d20.roll();
        if(totalAttack == 1){
            System.out.println("Miss");
        }else {
            totalAttack = totalAttack + player.getStrength();
            npc.setHP(npc.getHP() - totalAttack);
        }
    }


}
