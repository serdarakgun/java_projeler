import java.util.Random;

public class Fighter {
    String name;
    int health;
    int dmg;
    int dodge;

    int crit;


    Fighter(String name,int health,int dmg, int dodge, int crit){
        this.name=name;
        this.health=health;
        this.dmg=dmg;
        this.dodge=dodge;
        this.crit=crit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    //methods

    void hit(Fighter opp){
        if( Math.random()%100<=opp.dodge){
            System.out.println(opp.name+" sıyrıldı!!!");
        }
        else{
       opp.health=opp.health-critHit();
        }
    }
    int critHit(){

        if(Math.random()%100<=this.crit){
            System.out.println(this.name+" kritik vuruyor !!!");
            return (this.dmg*2);
        }
        else{
            return this.dmg;
        }

    }
}
