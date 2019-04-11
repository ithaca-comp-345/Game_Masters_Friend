package edu.ithaca.gamemaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Encounter {
    private ArrayList<NPC> npcList;
    private ArrayList<Player> playerList;
    private ArrayList<Integer> orderOfAttack;

    public Encounter(){
        this.npcList = new ArrayList<>();
        this.playerList = new ArrayList<>();
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

//    public void orderOfAttack(){
//        Dice dice = new Dice(20);
//         ArrayList<Integer> rolled = new ArrayList<>();
//        for(int x = 0; x < playerList.size(); x++) {
//            int diceNum = dice.roll();
//            rolled.add(diceNum);
//        }
//
//        for (int i = 0; i < playerList.size() ; i++) {
//
//            orderOfAttack
//
//        }
//    }
//
//    public NPC chooseNPCtoAttack(String npcName){
//        if(npcList.contains(npcName)){
//
//        }
//
//    }


}
