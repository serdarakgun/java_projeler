public class Ring {
    Fighter f1;
    Fighter f2;

    Ring(Fighter f1,Fighter f2){
        this.f1=f1;
        this.f2=f2;
    }

    public Fighter getF1() {
        return f1;
    }

    public void setF1(Fighter f1) {
        this.f1 = f1;
    }

    public Fighter getF2() {
        return f2;
    }

    public void setF2(Fighter f2) {
        this.f2 = f2;
    }
    void run(){
        while(f1.health>0 && f2.health>0){
            statPrint(f1,f2);
                if(Math.random()%2==1){
                    f1.hit(f2);
                    if(isWinner()){
                        System.out.println("THE WINNER IS "+f1.name+" !!!!!");
                        break;
                    }
                    else{
                        f2.hit(f1);
                        if(isWinner()){
                            System.out.println("THE WINNER IS "+f2.name+" !!!!!");
                            break;
                        }
                    }

                }
                else{
                    f2.hit(f1);
                    if(isWinner()){

                        break;
                    }
                    else{
                        f1.hit(f2);
                        if(isWinner()){

                            break;
                        }
                    }
                }

        }
    }

    boolean isWinner(){
        if(f1.health==0){
            System.out.println("THE WINNER IS "+f2.name+" !!!!!");
            return true;
        }
        else if(f2.health==0){
            System.out.println("THE WINNER IS "+f1.name+" !!!!!");
            return true;
        }
       else{
            return false;
        }
    }
    void statPrint(Fighter f1,Fighter f2){

        System.out.println("name: "+f1.name+"\nHealth: "+f1.health+"\nDamage: "+f1.dmg+"\nname: "+f2.name+"\nHealth: "+f2.health+"\nDamage: "+f2.dmg);
    }

}
