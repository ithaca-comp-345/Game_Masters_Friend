package edu.ithaca.gamemaster;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CharClasses {
    private Character character;
    private Player player;
    private NPC npc;
    public CharClasses(Character charac){
        this.character=charac;
    }
    public CharClasses(Player play){
        this.player=play;
    }
    public CharClasses(NPC npc){
        this.npc=npc;
    }

    public void characterToJSON(Character character){

    }

    public void playerToJSON(Player player){

    }

    public void npcToJSON(NPC npc){
        JSONObject obj = new JSONObject();

        JSONArray abilitys = new JSONArray();
        abilitys.add(npc.getStrength());
        abilitys.add(npc.getDexterity());
        abilitys.add(npc.getConstitution());
        abilitys.add(npc.getIntelligence());
        abilitys.add(npc.getWisdom());
        abilitys.add(npc.getCharisma());

        obj.put("name", npc.getName());
        obj.put("hp", npc.getHP());
        obj.put("ability scores", abilitys);
        try (FileWriter file = new FileWriter("test.json")){
            file.write(obj.toJSONString());
            file.flush();
        } catch(IOException e){
            e.printStackTrace();
        }

        System.out.println(obj);
    }


}
