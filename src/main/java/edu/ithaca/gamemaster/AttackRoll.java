package edu.ithaca.gamemaster;
import java.util.Random;


public class AttackRoll {

    Dice d20 = new Dice(20);

    //takes two players and calculates the damage towards player2

    public void attackPvP(Character player1, Character player2){
        int totalAttack = 0;
        totalAttack = d20.roll();
        if(totalAttack == 1){
            System.out.println("Attack wasn't so lethal");
            if((player2.getHP() - totalAttack) < 0){
                player2.setHP(0);
            }else{
                player2.setHP(player2.getHP() - totalAttack);
            }
        }else {
            totalAttack = totalAttack + player1.getStrength();
            if (player2.getHP() - totalAttack < 0){
                    player2.setHP(0);
            }else {

                player2.setHP(0);
                player2.setHP(player1.getHP() - totalAttack);
            }
        }


    }

    //takes one player and NPC, calculates the damage towards NPC
    // and reduces HP
    public void attackPvNPC(Character player, NPC npc){
        int totalAttack = 0;
        totalAttack = d20.roll();
        if(totalAttack == 1){
            System.out.println("Attack wasn't so lethal");
            if((npc.getHP() - totalAttack) < 0){
                npc.setHP(0);
            }else{
                npc.setHP(npc.getHP() - totalAttack);
            }
        }else {
            totalAttack = totalAttack + player.getStrength();
            if(npc.getHP() - totalAttack < 0) {
                npc.setHP(0);
            }else{
                npc.setHP(npc.getHP() - totalAttack);
            }

        }
    }


}
