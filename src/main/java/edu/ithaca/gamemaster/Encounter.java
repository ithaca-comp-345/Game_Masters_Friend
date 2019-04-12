package edu.ithaca.gamemaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Encounter {
    private ArrayList<NPC> npcList;
    private ArrayList<Player> playerList;
    private ArrayList<Integer> orderOfAttack;
    private ArrayList<Integer> rolled;

    public Encounter(){
        this.npcList = new ArrayList<>();
        this.playerList = new ArrayList<>();
        this.orderOfAttack = new ArrayList<>();
        this.rolled = new ArrayList<>();
    }

    public Encounter(ArrayList<NPC> npcListIn, ArrayList<Player> playerListIn){
        this.npcList = npcListIn;
        this.playerList=playerListIn;
    }

    public void addNPC(NPC newNPC){
        if(!npcList.contains(newNPC)){
            npcList.add(newNPC);
        }
        else{
            throw new IllegalArgumentException("NPC is already there");
        }
    }

    public void addPlayer(Player newPlayer){
        if(!playerList.contains(newPlayer)){
            playerList.add(newPlayer);
        }
        else{
            throw new IllegalArgumentException("Player is already there");
        }
    }

    public void rollDiceforOrder(){
        Dice dice = new Dice(20);
        for(int x = 0; x < playerList.size(); x++) {
            int diceNum = dice.roll();
            rolled.add(diceNum);
        }
    }


    public void orderOfAttack(){
        for (int i = 0; i < playerList.size() ; i++) {
            int maxIndx = 0;
            for (int j = 0; j < playerList.size(); j++) {
                if(rolled.get(maxIndx)<rolled.get(j)){
                    maxIndx = j;
                }
            }
            System.out.println(maxIndx);
            rolled.set(maxIndx, -1);
            orderOfAttack.add(maxIndx);
        }
    }

    public void orderOfAttack(ArrayList<Integer> rolledList){
        for (int i = 0; i < playerList.size() ; i++) {
            int maxIndx = 0;
            for (int j = 0; j < playerList.size(); j++) {
                if(rolledList.get(maxIndx)<rolledList.get(j)){
                    maxIndx = j;
                }
            }
            System.out.println(maxIndx);
            rolledList.set(maxIndx, -1);
            orderOfAttack.add(maxIndx);
        }
    }

    public String orderOfAttackString(){
        String s = "";
        for (int i = 0; i < orderOfAttack.size() ; i++) {
            s += playerList.get(orderOfAttack.get(i)).getName()+ " ";
        }
        return s;
    }

    public boolean isNPCinList(NPC npc){
        if(npcList.contains(npc)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isPlayerinList(Player player){
        if(playerList.contains(player)){
            return true;
        }
        else{
            return false;
        }
    }

//    public NPC chooseNPCtoAttack(NPC npc){
//        if(npcList.contains(npc)){
//            return npc;
//        }
//
//    }


}
