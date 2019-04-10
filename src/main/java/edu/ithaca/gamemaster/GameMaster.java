package edu.ithaca.gamemaster;

public class GameMaster {
    private String name;
    private Account account;

    //Placeholder class

    public GameMaster(String name, Account account){
        this.name=name;
        this.account=account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

