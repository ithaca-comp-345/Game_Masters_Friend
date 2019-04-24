package edu.ithaca.gamemaster;

public class Action {
    private String name;
    private String description;
    private String goodRange;
    private String badRange;
    private String damageType;
    private int toHit;
    private int sided;
    private int dieAmt;

    public Action(String nameIn){
        this.name = nameIn;
    }

    public Action(String nameIn,int toHit, int dieAmt, int dieSides, String dmgType, String description){
        this.name = nameIn;
        this.toHit = toHit;
        this.dieAmt=dieAmt;
        this.sided=dieSides;
        this.damageType=dmgType;
        this.description=description;
    }

    public void setDescription(String description){
        this.description=description;
    }
    public void setGoodRange(String range){
        this.goodRange = range;
    }
    public void setBadRange(String range){
        this.badRange = range;
    }
    public void setHit(int toHit){
        this.toHit=toHit;
    }
    public void setSides(int sides){
        this.sided=sides;
    }
    public void setDieAmt(int amt){
        this.dieAmt=amt;
    }
    public void setDamageType(String dmgType){
        this.damageType=dmgType;
    }

    public String getName(){ return name;}
    public String getDmgType(){ return damageType;}
    public String getDescription(){ return description;}
    public String getRanges(){
        StringBuilder ranges = new StringBuilder();
        ranges.append(goodRange);
        ranges.append(badRange);
        String rangeOut = ranges.toString();
        return rangeOut;
    }
    public int getHit(){ return toHit;}
    public int getSides(){ return sided;}
    public int getDieAmt(){ return dieAmt;}

    @Override
    public String toString() {
        return "Action: " + name +
                " \n HIT: " + toHit +
                " DIE TYPE: " + sided +
                " DICE AMOUNT: " + dieAmt +
                " \n DMG type: " + damageType +
                " \n Description: \"" + description + "\"";
    }

}
