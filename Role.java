package adventureGame;

public class Role {
    // name/pronouns/age/health/gold/xp
    private String name;
    private String pronouns;
    private int age;
    private int health;
    private int gold;
    private int xp;

    public Role(String name, String pronouns, int age, int health, int gold, int xp) {
    	// Reference to a current object 
        this.name = name;
        this.pronouns = pronouns;
        this.age = age;
        this.health = health;
        this.gold = gold;
        this.xp = xp;
    }

    public String toString() {
    	//Format or the order we store in the text file
        return name + "|" + pronouns + "|" + age + "|" + health + "|" + gold + "|" + xp;
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

    public int getAge() {
    	//Acquire the current age number
        return age;
    }

    public void setAge(int age) {
    	//Set the new age 
        this.age = age;
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
