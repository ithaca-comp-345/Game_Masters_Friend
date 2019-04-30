package edu.ithaca.gamemaster.clean_tests;

import edu.ithaca.gamemaster.Account;
import edu.ithaca.gamemaster.user_interfaces.clean_build.Campaign;
import edu.ithaca.gamemaster.user_interfaces.clean_build.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class userTest {
    @Test
    void userCreateCampaignTest(){
        Account test = new Account("Bobbyz", "Bobby12");
        User user = new User("Bobbyz", true, test);
        assertThrows(IllegalArgumentException.class,()->user.createCampaign("'America"));
        assertThrows(IllegalArgumentException.class,()->user.createCampaign("}America"));
        assertThrows(IllegalArgumentException.class,()->user.createCampaign("#America"));
        Campaign testCampaign = user.createCampaign("America");
        assertEquals("America", testCampaign.getCampaignName());

    }
}
