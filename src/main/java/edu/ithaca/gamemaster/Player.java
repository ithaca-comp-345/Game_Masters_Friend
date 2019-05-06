package edu.ithaca.gamemaster;

import edu.ithaca.gamemaster.user_interfaces.clean_build.User;

import java.util.ArrayList;

public class Player extends Character {
    //Saving Throws
    private int strenSave;
    private int dexteSave;
    private int constSave;
    private int intelSave;
    private int wisdoSave;
    private int chariSave;
    private int proficiencyBonus; //factors into certain saves

    //Ability Mods
    private int strenMod;
    private int dexteMod;
    private int constMod;
    private int intelMod;
    private int wisdoMod;
    private int chariMod;

    //Skills
    private int acrobatics; //Dex
    private int animalHandling; //Wis
    private int arcana; //Int
    private int athletics; //Str
    private int deception; //Cha
    private int history; //Int
    private int insight; //Wis
    private int intimidation; //Cha
    private int investigation; //Int
    private int medicine; //Wis
    private int nature; //Int
    private int perception; //Wis
    private int performance; //Cha
    private int persuasion; //Cha
    private int religion; //Int
    private int slightOfHand; //Dex
    private int stealth; //Dex
    private int survival; //Wis

    //Misc
    private int passiveWisdom;
    private int initiative;
    private int experience;


    //Traits
    private String age;
    private String size;
    private String background;
    private ArrayList<String> traits;

    //Class
    private String charClass;
    private int level;
    private String race;

    private ArrayList<String> expertise;

    //Life
    private int deathSaveSuccess = 3;
    private int deathSaveFail = 3;

    //Carried Stuff
    private String carriedGear;
    private int maxCarry;
    private int maxPushPull;
    private int maxLift;

    //Currency
    private int gp; //gold pieces
    private int sp; //silver pieces
    private int cp; //copper pieces
    private int gems;
    private String misc; //anything else

    //Proficiencies
    private String armorType;
    private ArrayList<String> weapons;
    private ArrayList<String> tools;
    private ArrayList<String> savingThrows;
    private ArrayList<String> skills;

    //Control
    private boolean hasAbility = false;
    private User owner;
    private int inspiration;

    public Player(){
        super();
    }

    public Player(String name) {
        super(name);



    }

    public Player(String name, int hitPts, int hitDice, int hitSide, int hitMod,
                  int armor, int speed, String alignment, ArrayList<String> languages, ArrayList<Action> actions) {

        super(name, hitPts, hitDice, hitSide, hitMod,
                armor, speed, alignment, languages, actions);


        this.hasAbility = true;
    }

    //Custom character skill modifiers *normally are generated based on ability scores and saving throws
    public Player(Character character, int acro, int animalHandling, int arcana
            , int athletics, int deception, int history, int insight, int intimidation, int investigation,
                  int medicine, int nature, int perception, int performance,
                  int persuasion, int religion, int slightOfHand, int stealth, int survival, int passiveWisdom, int initiative,
                  String age, String size, String charClass, int level, int experience, String race, String background) { //no concern about the more detailed parts of character, that is done through setters
        super(character.getName(), character.getHP(), character.getHitDiceAmt(),
                character.getHitDiceSided(), character.getHitDiceModifier(), character.getArmor(),
                character.getSpeed(), character.getStrength(), character.getDexterity(),
                character.getConstitution(), character.getIntelligence(),
                character.getWisdom(), character.getCharisma(), character.getAlignment(), character.getLanguageList(),
                character.getActionsList());

        //can be set by this constructor or be set elsewhere based on class and race
        this.experience = experience;
        this.background = background;
        this.acrobatics = acro;
        this.animalHandling = animalHandling;
        this.arcana = arcana;
        this.athletics = athletics;
        this.deception = deception;
        this.history = history;
        this.insight = insight;
        this.intimidation = intimidation;
        this.investigation = investigation;
        this.medicine = medicine;
        this.nature = nature;
        this.perception = perception;
        this.performance = performance;
        this.persuasion = persuasion;
        this.religion = religion;
        this.slightOfHand = slightOfHand;
        this.stealth = stealth;
        this.survival = survival;

        this.passiveWisdom = passiveWisdom;
        this.initiative = initiative;
        this.age = age;
        this.size = size;
        this.charClass = charClass;
        this.level = level;
        this.race = race;

        this.hasAbility = true;

    }

    public Player(String name, int hp, int hitDiceAmt,int hitDiceSides, int hitMod, int armor,
                  int speed, int strength, int dexterity, int constitution, int intelligence,
                  int wisdom, int charisma, String alignment, ArrayList<String> languages,
                  ArrayList<Action> actions, int experience, int proficiencyBonus, String background, String race,
                  int passiveWisdom, int initiative, String size, ArrayList<String> traits, String charClass,
                  int level, ArrayList<String> expertise, String carriedGear, int maxCarry, int maxPushPull,
                  int maxLift, int gold, int silver, int copper, int gems, String armorType, ArrayList<String> weapons,
                  ArrayList<String> tools, ArrayList<String> savingThrows, ArrayList<String> skills){
        super(name,hp,hitDiceAmt,hitDiceSides,hitMod,armor,speed,strength,dexterity,constitution,intelligence,
                wisdom, charisma, alignment, languages,actions);
        this.experience=experience;
        this.proficiencyBonus=proficiencyBonus;
        this.background=background;
        this.race=race;
        this.passiveWisdom=passiveWisdom;
        this.initiative=initiative;
        this.size=size;
        this.traits=traits;
        this.charClass=charClass;
        this.level=level;
        this.expertise=expertise;
        this.carriedGear=carriedGear;
        this.maxCarry=maxCarry;
        this.maxPushPull=maxPushPull;
        this.maxLift=maxLift;
        this.gp=gold;
        this.sp=silver;
        this.cp=copper;
        this.gems=gems;
        this.armorType=armorType;
        this.weapons=weapons;
        this.tools= tools;
        this.savingThrows=savingThrows;
        this.skills=skills;
    }

    public Player(Character character) {
        super(character.getName(), character.getHP(), character.getHitDiceAmt(),
                character.getHitDiceSided(), character.getHitDiceModifier(), character.getArmor(),
                character.getSpeed(), character.getStrength(), character.getDexterity(),
                character.getConstitution(), character.getIntelligence(),
                character.getWisdom(), character.getCharisma(), character.getAlignment(), character.getLanguageList(),
                character.getActionsList());
    }

    public Player(String name, int hitPts, int hitDice, int hitSide, int hitMod,
                  int armor, int speed, int strength, int dexterity,
                  int constitution, int intelligence, int wisdom, int charisma,
                  String alignment, ArrayList<String> languages, ArrayList<Action> actions) {
        super(name, hitPts, hitDice, hitSide, hitMod, armor, speed, strength, dexterity, constitution
                , intelligence, wisdom, charisma, alignment, languages, actions);
    }

    //Generators

    public void generateSkills() {
        this.acrobatics = dexteSave;
        this.animalHandling = wisdoSave;
        this.arcana = intelSave;
        this.athletics = strenSave;
        this.deception = chariSave;
        this.history = intelSave;
        this.insight = wisdoSave;
        this.intimidation = chariSave;
        this.investigation = intelSave;
        this.medicine = wisdoSave;
        this.nature = intelSave;
        this.perception = wisdoSave;
        this.performance = chariSave;
        this.persuasion = chariSave;
        this.religion = intelSave;
        this.slightOfHand = dexteSave;
        this.stealth = dexteSave;
        this.survival = wisdoSave;

        for (int i = 0; i < skills.size() - 1; i++) {
            if (skills.get(i).equals("acrobatics") || skills.get(i).equals("Acrobatics")) {
                this.acrobatics = dexteSave + proficiencyBonus;
            } else if (skills.get(i).equals("animal handling") || skills.get(i).equals("Animal Handling")) {
                this.animalHandling = wisdoSave + proficiencyBonus;
            } else if (skills.get(i).equals("arcana") || skills.get(i).equals("Arcana")) {
                this.arcana = intelSave + proficiencyBonus;
            } else if (skills.get(i).equals("athletics") || skills.get(i).equals("Athletics")) {
                this.athletics = strenSave + proficiencyBonus;
            } else if (skills.get(i).equals("deception") || skills.get(i).equals("Deception")) {
                this.deception = chariSave + proficiencyBonus;
            } else if (skills.get(i).equals("history") || skills.get(i).equals("History")) {
                this.history = intelSave + proficiencyBonus;
            } else if (skills.get(i).equals("insight") || skills.get(i).equals("Insight")) {
                this.insight = wisdoSave + proficiencyBonus;
            } else if (skills.get(i).equals("intimidation") || skills.get(i).equals("Intimidation")) {
                this.intimidation = chariSave + proficiencyBonus;
            } else if (skills.get(i).equals("investigation") || skills.get(i).equals("Investigation")) {
                this.investigation = intelSave + proficiencyBonus;
            } else if (skills.get(i).equals("medicine") || skills.get(i).equals("Medicine")) {
                this.medicine = wisdoSave + proficiencyBonus;
            } else if (skills.get(i).equals("nature") || skills.get(i).equals("Nature")) {
                this.nature = intelSave + proficiencyBonus;
            } else if (skills.get(i).equals("perception") || skills.get(i).equals("Perception")) {
                this.perception = wisdoSave + proficiencyBonus;
            } else if (skills.get(i).equals("performance") || skills.get(i).equals("Performance")) {
                this.performance = chariSave + proficiencyBonus;
            } else if (skills.get(i).equals("persuasion") || skills.get(i).equals("Persuasion")) {
                this.persuasion = chariSave + proficiencyBonus;
            } else if (skills.get(i).equals("religion") || skills.get(i).equals("Religion")) {
                this.religion = intelSave + proficiencyBonus;
            } else if (skills.get(i).equals("sleight of hand") || skills.get(i).equals("Sleight of Hand") || skills.get(i).equals("SoH")) {
                this.slightOfHand = dexteSave + proficiencyBonus;
            } else if (skills.get(i).equals("stealth") || skills.get(i).equals("Stealth")) {
                this.stealth = dexteSave + proficiencyBonus;
            } else if (skills.get(i).equals("survival") || skills.get(i).equals("Survival")) {
                this.survival = wisdoSave + proficiencyBonus;
            } else {
                throw new IllegalArgumentException("Skill isn't a skill or is miss-spelled");
            }
        }

    }

    private int genSave(int ability) {
        int save = ability - 10;
        save = save / 2;
        return save;
    }

    public void generateThrows() {
        //randomizes ability scores
        if (!hasAbility) {
            randomizeAbilityScores();
        }

        //gets ability mods
        int str = getStrength();
        int dex = getDexterity();
        int con = getConstitution();
        int intel = getIntelligence();
        int wis = getWisdom();
        int cha = getCharisma();

        //generates saves
        this.strenSave = genSave(str);
        this.dexteSave = genSave(dex);
        this.constSave = genSave(con);
        this.intelSave = genSave(intel);
        this.wisdoSave = genSave(wis);
        this.chariSave = genSave(cha);

        //creates the ability mods
        this.strenMod = strenSave;
        this.dexteMod = dexteSave;
        this.constMod = constSave;
        this.intelMod = intelSave;
        this.wisdoMod = wisdoSave;
        this.chariMod = chariSave;

        //edits throws if they need to be boosted by a saving throw proficiency
        if (savingThrows.contains("Intelligence") || savingThrows.contains("intelligence")) {
            this.intelSave = genSave(intel) + proficiencyBonus;
        }
        if (savingThrows.contains("Strength") || savingThrows.contains("strength")) {
            this.strenSave = genSave(str) + proficiencyBonus;
        }
        if (savingThrows.contains("Dexterity") || savingThrows.contains("dexterity")) {
            this.dexteSave = genSave(dex) + proficiencyBonus;
        }
        if (savingThrows.contains("Constitution") || savingThrows.contains("constitution")) {
            this.constSave = genSave(con) + proficiencyBonus;
        }
        if (savingThrows.contains("Wisdom") || savingThrows.contains("wisdom")) {
            this.wisdoSave = genSave(wis) + proficiencyBonus;
        }
        if (savingThrows.contains("Charisma") || savingThrows.contains("charisma")) {
            this.chariSave = genSave(cha) + proficiencyBonus;
        }
    }

    //additional methods

    public boolean isHasAbility() {
        return hasAbility;
    }

    public void setHasAbility(boolean hasAbility) {
        this.hasAbility = hasAbility;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }


    //Set Methods


    public void setStrenMod(int strenMod) {
        this.strenMod = strenMod;
    }

    public void setDexteMod(int dexteMod) {
        this.dexteMod = dexteMod;
    }

    public void setConstMod(int constMod) {
        this.constMod = constMod;
    }

    public void setIntelMod(int intelMod) {
        this.intelMod = intelMod;
    }

    public void setWisdoMod(int wisdoMod) {
        this.wisdoMod = wisdoMod;
    }

    public void setChariMod(int chariMod) {
        this.chariMod = chariMod;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public void setExperience(int newEXP){ this.experience=newEXP;}

    private void setStrenSave(int save){
        this.strenSave=save;
    }

    private void setDexteSave(int dexteSave) {
        this.dexteSave = dexteSave;
    }

    private void setConstSave(int constSave) {
        this.constSave = constSave;
    }

    private void setIntelSave(int intelSave) {
        this.intelSave = intelSave;
    }

    private void setWisdoSave(int wisdoSave) {
        this.wisdoSave = wisdoSave;
    }

    private void setChariSave(int chariSave) {
        this.chariSave = chariSave;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public void setAcrobatics(int acrobatics) {
        this.acrobatics = acrobatics;
    }

    public void setAnimalHandling(int animalHandling) {
        this.animalHandling = animalHandling;
    }

    public void setArcana(int arcana) {
        this.arcana = arcana;
    }

    public void setAthletics(int athletics) {
        this.athletics = athletics;
    }

    public void setDeception(int deception) {
        this.deception = deception;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public void setInsight(int insight) {
        this.insight = insight;
    }

    public void setIntimidation(int intimidation) {
        this.intimidation = intimidation;
    }

    public void setInvestigation(int investigation) {
        this.investigation = investigation;
    }

    public void setMedicine(int medicine) {
        this.medicine = medicine;
    }

    public void setNature(int nature) {
        this.nature = nature;
    }

    public void setPerception(int perception) {
        this.perception = perception;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public void setPersuasion(int persuasion) {
        this.persuasion = persuasion;
    }

    public void setReligion(int religion) {
        this.religion = religion;
    }

    public void setSlightOfHand(int slightOfHand) {
        this.slightOfHand = slightOfHand;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public void setSurvival(int survival) {
        this.survival = survival;
    }

    public void setPassiveWisdom(int passiveWisdom) {
        this.passiveWisdom = passiveWisdom;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setTraits(ArrayList<String> traits) {
        this.traits = traits;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExpertise(ArrayList<String> expertise) {
        this.expertise = expertise;
    }

    public void setDeathSaveSuccess(int deathSaveSuccess) {
        this.deathSaveSuccess = deathSaveSuccess;
    }

    public void setDeathSaveFail(int deathSaveFail) {
        this.deathSaveFail = deathSaveFail;
    }

    public void setCarriedGear(String carriedGear) {
        this.carriedGear = carriedGear;
    }

    public void setMaxCarry(int maxCarry) {
        this.maxCarry = maxCarry;
    }

    public void setMaxPushPull(int maxPushPull) {
        this.maxPushPull = maxPushPull;
    }

    public void setMaxLift(int maxLift) {
        this.maxLift = maxLift;
    }

    public void setGp(int gp) {
        this.gp = gp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public void setGems(int gems) {
        this.gems = gems;
    }

    public void setMisc(String misc) {
        this.misc = misc;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public void setWeapons(ArrayList<String> weapons) {
        this.weapons = weapons;
    }

    public void setTools(ArrayList<String> tools) {
        this.tools = tools;
    }

    public void setSavingThrows(ArrayList<String> savingThrows) {
        this.savingThrows = savingThrows;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public void setRace(String aRace){ this.race=aRace;}

    public void setBackground(String background){ this.background=background;}

    //Get Methods

    public int getExperience(){ return experience;}

    public int getStrenSave() {
        return strenSave;
    }

    public int getDexteSave() {
        return dexteSave;
    }

    public int getConstSave() {
        return constSave;
    }

    public int getIntelSave() {
        return intelSave;
    }

    public int getWisdoSave() {
        return wisdoSave;
    }

    public int getChariSave() {
        return chariSave;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public int getAcrobatics() {
        return acrobatics;
    }

    public int getAnimalHandling() {
        return animalHandling;
    }

    public int getArcana() {
        return arcana;
    }

    public int getAthletics() {
        return athletics;
    }

    public int getDeception() {
        return deception;
    }

    public int getHistory() {
        return history;
    }

    public int getInsight() {
        return insight;
    }

    public int getIntimidation() {
        return intimidation;
    }

    public int getInvestigation() {
        return investigation;
    }

    public int getMedicine() {
        return medicine;
    }

    public int getNature() {
        return nature;
    }

    public int getPerception() {
        return perception;
    }

    public int getPerformance() {
        return performance;
    }

    public int getPersuasion() {
        return persuasion;
    }

    public int getReligion() {
        return religion;
    }

    public int getSlightOfHand() {
        return slightOfHand;
    }

    public int getStealth() {
        return stealth;
    }

    public int getSurvival() {
        return survival;
    }

    public int getPassiveWisdom() {
        return passiveWisdom;
    }

    public int getInitiative() {
        return initiative;
    }

    public String getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public ArrayList<String> getTraits() {
        return traits;
    }

    public String getCharClass() {
        return charClass;
    }

    public int getLevel() {
        return level;
    }

    public ArrayList<String> getExpertise() {
        return expertise;
    }

    public int getDeathSaveSuccess() {
        return deathSaveSuccess;
    }

    public int getDeathSaveFail() {
        return deathSaveFail;
    }

    public String getCarriedGear() {
        return carriedGear;
    }

    public int getMaxCarry() {
        return maxCarry;
    }

    public int getMaxPushPull() {
        return maxPushPull;
    }

    public int getMaxLift() {
        return maxLift;
    }

    public int getGp() {
        return gp;
    }

    public int getSp() {
        return sp;
    }

    public int getCp() {
        return cp;
    }

    public int getGems() {
        return gems;
    }

    public String getMisc() {
        return misc;
    }

    public String getArmorType() {
        return armorType;
    }

    public ArrayList<String> getWeapons() {
        return weapons;
    }

    public ArrayList<String> getTools() {
        return tools;
    }

    public ArrayList<String> getSavingThrows() {
        return savingThrows;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public String getBackground(){ return background;}

    public String getRace(){ return race;}

    public int getStrenMod() {
        return strenMod;
    }

    public int getDexteMod() {
        return dexteMod;
    }

    public int getConstMod() {
        return constMod;
    }

    public int getIntelMod() {
        return intelMod;
    }

    public int getWisdoMod() {
        return wisdoMod;
    }

    public int getChariMod() {
        return chariMod;
    }

    public int getInspiration() {
        return inspiration;
    }

    public void setInspiration(int inspiration) {
        this.inspiration = inspiration;
    }

    @Override
    public String toString(){
        return super.getName();
    }
}
