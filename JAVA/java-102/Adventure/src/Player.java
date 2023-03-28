public class Player {
    private int damage;
    private int health;
    private int monney;
    private String name;
    private String charName;


    public Player(String name){
        this.name = name;
    }

    public void selectChar(){
        System.out.println("----------------------------------------");

        CharName[] charList = {new Samurai(), new Archer(), new Knight()};

        for(CharName charName : charList){
            System.out.println("Character: "+ charName.getName()
                    +"\t Damage: " + charName.getDamage()
                    +"\t Health: " + charName.getHealth()
                    +"\t Money: " + charName.getMoney());
        }

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMonney() {
        return monney;
    }

    public void setMonney(int monney) {
        this.monney = monney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
}
