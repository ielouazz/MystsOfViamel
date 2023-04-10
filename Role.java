package adventureGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Role {
    // name/pronouns/age/health/gold/xp
    private String name;
    private String pronouns;
    private String race;
    private String p_class; //class is a key word for Java
    private String sprite;
    private String inventory;
    private String location;
    private int health;
    private int gold;
    private int xp;

    public Role(String name, String pronouns, String race, String p_class, String sprite, String inventory, String location, int health, int gold, int xp) {
    	// Reference to a current object 
        this.name = name;
        this.pronouns = pronouns;
        this.race = race;
        this.p_class = p_class;
        this.sprite = sprite;
        this.inventory = inventory;
        this.location = location;
        this.health = health;
        this.gold = gold;
        this.xp = xp;
    }

    public String toString() {
    	//Format or the order we store in the text file
        return name + "|" + pronouns + "|" + race + "|" + p_class + "|" + sprite + "|" + "|" + inventory + "|" + "|" + location + "|" + health + "|" + gold + "|" + xp;
    }

    public Role() {
    	//Default constructor
    }

    public String getName() {
    	//Acquire the name string
        return name;
    }

    public void setName(String name) {
    	//Set the new name string for later acquisition
        this.name = name;
    }

    public String getPronouns() {
    	//Acquire the pronouns
        return pronouns;
    }

    public void setPronouns(String pronouns) {
    	//Set the new pronouns string for later acquisition if there is any
        this.pronouns = pronouns;
    }
    
    public String getRace() {
    	//Acquire the race
        return race;
    }

    public void setRace(String race) {
    	//Set the new race string for later acquisition if there is any
        this.race = race;
    }

    public String getp_Class() {
    	//Acquire the class
        return p_class;
    }

    public void setp_Class(String p_class) {
    	//Set the new class string for later acquisition if there is any
        this.p_class = p_class;
    }
    
    public String getSprite() {
    	//Acquire the sprite
        return sprite;
    }

    public void setSprite(String sprite) {
    	//Set the new sprite string for later acquisition if there is any
        this.sprite = sprite;
    }
    
    public String getInventory() {
    	//Acquire the inventory
    	return inventory;
    }

    public void setInventory(String inventory) {
    	//Set the new sprite string for later acquisition if there is any
        this.inventory = inventory;
    }
    
    public String getLocation() {
    	//Acquire the current + past locations of player
        return location;
    }

    public void setLocation(String location) {
    	//Add the newest location to location
        this.location = location;
    }
    
    public int getHealth() {
    	//Acquire the current health number
        return health;
    }

    public void setHealth(int health) {
    	//Set the new health function (normally make modification after acquire the current health)
        this.health = health;
    }

    public int getGold() {
    	//Acquire the current gold number
        return gold;
    }

    public void setGold(int gold) {
    	//Set the new gold function (normally make modification after acquire the current gold)
        this.gold = gold;
    }

    public int getXp() {
    	//Acquire the current xp
        return xp;
    }

    public void setXp(int xp) {
    	//Set the new xp function (normally make modification after acquire the current gold)
        this.xp = xp;
    }
}
