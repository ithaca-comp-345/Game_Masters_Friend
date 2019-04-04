package edu.ithaca.gamemaster;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import edu.ithaca.gamemaster.utility.JSONUtility;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CharacterJSON {
//    private Character character;
//    private Player player;
//    private NPC npc;

//    public CharClasses(Character charac){
//        this.character=charac;
//    }
//    public CharClasses(Player play){
//        this.player=play;
//    }
//    public CharClasses(NPC npc){
//        this.npc=npc;
//    }

    public static void characterToJSON(Character character) throws IOException{
        JSONUtility.toJsonFile("character.json", character);

    }

    public static void playerToJSON(Player player) throws IOException {
        JSONUtility.toJsonFile("player.json", player);

    }

    public static void npcToJSON(NPC npc) throws IOException {

        JSONUtility.toJsonFile("npc.json", npc);

    }

    public static NPC JSONtoNpc(String fileName) throws IOException{
        NPC npc = JSONUtility.fromJsonFile(fileName,NPC.class);
        return npc;
    }

    public static Character JSONtoCharacter(String filename) throws IOException{
        Character character = JSONUtility.fromJsonFile(filename, Character.class);
        return character;
    }

    public static Player JSONtoPlayer(String filename) throws IOException{
        Player player = JSONUtility.fromJsonFile(filename,Player.class);
        return player;
    }



}
