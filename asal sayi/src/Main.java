public class Main {
    public static void main(String[] args) {

        for(int a=2;a<100;a++){
            boolean control=true;
            for(int i=2;i<a;i++){

                if(a%i==0){
                    control=false;
                    break;
                }

            }
            if(control){
            System.out.print(" "+a);}
        }
    }
}