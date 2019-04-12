package edu.ithaca.gamemaster;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    public Demo() {
        //Initialize
    }
    //campaign
    //characters
    //notes

    public void runDemo() {
        Scanner input = new Scanner(System.in);
        String enter;
        String sess = "The Bellicose Proxy";
        CharacterUI CUI = new CharacterUI();

        Account gma = new Account("Mrs. Dr. The Monarch", "Malcom1");
        GameMaster gm = new GameMaster("Councilwoman 1", gma);

        System.out.println(gm.toString() + "\n PRESS ENTER");
        enter = input.nextLine();

        Campaign campaign = new Campaign(gm, "The Big Villain Program");
        System.out.println("Campaign name: " + campaign.campaignName + "\n PRESS ENTER");

        enter = input.nextLine();

        Account a1 = new Account("Billy Quizboy", "MamaBear90");
        Account a2 = new Account(" Augustus St. Cloud", "H3nri3tta");
        campaign.addUserPlayers("The Quizboy", a1.userPlayer);
        campaign.addUserPlayers("St. Cloud", a2.userPlayer);

        //System.out.println(campaign.toString());
        campaign.printAllPlayers(campaign.getUserPlayers());
        System.out.println("PRESS ENTER");
        enter = input.nextLine();

        Session tbp = new Session(sess, gm, true);
        tbp.addPlayertoSession(a1.username);
        tbp.addPlayertoSession(a2.username);

        tbp.start("A Level 1 Arching of Billy.");

        System.out.println(tbp.toString()+"\n");

        System.out.println("PRESS ENTER");
        enter = input.nextLine();

        campaign.addNotes(sess);
        System.out.println(campaign.getNotes(sess));

        System.out.println("PRESS ENTER");
        enter = input.nextLine();

        //this is supposed to create a new character and add it to a user
        //Player pete_white = (Player) CUI.createNewCharacter(); //Player Character, prints character automatically
        //a1.userPlayer.addCharacter(pete_white.getName(), pete_white);
        //System.out.println("PRESS ENTER");
        //enter = input.nextLine();

        Character autoGenC = CUI.createNewCharacter(); //GM character, prints character automatically
        campaign.addCharacter(autoGenC.getName(), autoGenC);

        System.out.println("PRESS ENTER");
        enter = input.nextLine();

        System.out.println(campaign.toString()+"\n");

        System.out.println("End of demo.");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.runDemo();
    }
}
