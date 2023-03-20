package adventureGame;

/**
 * @author shkstart
 * @version 1.0
 * @description TODO
 * @create 2023-03-19 23:30
 */
public class Role {
    // name/pronouns/age/health/gold/xp
    private String name;
    private String pronouns;
    private int age;
    private int health;
    private int gold;
    private int xp;

    public Role(String name, String pronouns, int age, int health, int gold, int xp) {
        this.name = name;
        this.pronouns = pronouns;
        this.age = age;
        this.health = health;
        this.gold = gold;
        this.xp = xp;
    }

    @Override
    public String toString() {
        return name + "|" + pronouns + "|" + age + "|" + health + "|" + gold + "|" + xp;
    }

    public Role() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPronouns() {
        return pronouns;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
