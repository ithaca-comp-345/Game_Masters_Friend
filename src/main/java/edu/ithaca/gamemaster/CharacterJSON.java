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

    public static void JSONtoNpc(String fileName){

    }

//        JSONObject obj = new JSONObject();
//
//        JSONArray abilitys = new JSONArray();
//        abilitys.add(npc.getStrength());
//        abilitys.add(npc.getDexterity());
//        abilitys.add(npc.getConstitution());
//        abilitys.add(npc.getIntelligence());
//        abilitys.add(npc.getWisdom());
//        abilitys.add(npc.getCharisma());
//
//        obj.put("name", npc.getName());
//        obj.put("hp", npc.getHP());
//        obj.put("ability scores", abilitys);
//        try (FileWriter file = new FileWriter("test.json")){
//            file.write(obj.toJSONString());
//            file.flush();
//        } catch(IOException e){
//            e.printStackTrace();
//        }
//
//        System.out.println(obj);


}
