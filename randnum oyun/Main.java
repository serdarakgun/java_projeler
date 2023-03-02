import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println(number);


        Scanner val = new Scanner(System.in);
        int guess;
        for(int loop=5;-1<loop;loop--){
            if(loop==0){
                System.out.println();
                System.out.println();
                System.out.println("Haklarınız bitmiştir.");
                System.out.println("aradığımız sayı: "+number);
                break;
            }
            System.out.println();
            System.out.println();
            System.out.print("Tahmininizi giriniz: ");
            guess= val.nextInt();
            if(guess==number){
                System.out.println("sayı bulundu");
                break;
            }
            else if(guess<number) {
                System.out.println("aradığımız sayı daha büyük.");
                System.out.println("Kalan hak: "+(loop-1));
            }
            else{
                System.out.println("aradığımız sayı daha küçük.");
                System.out.println("Kalan hak: "+(loop-1));
            }
        }


    }

}
