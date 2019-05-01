package edu.ithaca.gamemaster.clean_tests;

import edu.ithaca.gamemaster.Account;
import edu.ithaca.gamemaster.user_interfaces.clean_build.Campaign;
import edu.ithaca.gamemaster.user_interfaces.clean_build.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class userTest {
    @Test
    void userCreateCampaignTest(){
        Account test = new Account("Bobbyz", "Bobby12");
        User user = new User("Bobbyz", test);
        assertThrows(IllegalArgumentException.class,()->user.createCampaign("'America"));
        assertThrows(IllegalArgumentException.class,()->user.createCampaign("}America"));
        assertThrows(IllegalArgumentException.class,()->user.createCampaign("#America"));
        Campaign testCampaign = user.createCampaign("America");
        assertEquals("America", testCampaign.getCampaignName());

    }
    @Test
    void userGetCleanedCampaignList(){
        Account test = new Account("BrianQuinn", "Bobby12");
        User user = new User("BrianQuinn",test);
        user.createCampaign("American Revolution");
        user.createCampaign("American Pie");
        ArrayList<Campaign> campaignsClean = user.getCampaignListClean();
        assertEquals("American Pie",campaignsClean.get(0).getCampaignName());
        assertEquals("American Revolution", campaignsClean.get(1).getCampaignName());
    }
}
