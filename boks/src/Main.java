public class Main {
    public static void main(String[] args) {
    Fighter f1=new Fighter("yigit",100,5,0,0);
    Fighter f2=new Fighter("ahmet",100,10,100,100);
    Ring ring =new Ring(f1,f2);
    ring.run();



    }


}