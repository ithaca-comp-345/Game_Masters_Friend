package edu.ithaca.gamemaster.user_interfaces.clean_build;

public class ExtendedAccount {
    private String username;
    private String password;

    public ExtendedAccount(String userIn, String passIn){
        this.username=userIn;
        this.password=passIn;
    }

    public String getUsername(){ return username;}
    public String getPassword(){ return password;}
}
