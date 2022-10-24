import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner val= new Scanner(System.in);
        int sinir,sayac=0;
        System.out.print("sınır olucak sayıyı giriniz: ");
        sinir= val.nextInt();
        System.out.println("4\'ün katları\n---------------");
        while(sinir>=Math.pow(4,sayac) ){
            System.out.println(Math.pow(4,sayac));

            sayac++;
        }
        sayac=0;
        System.out.println("5\'in katları\n---------------");
        while( sinir>=Math.pow(5,sayac)){

            System.out.println(Math.pow(5,sayac));
            sayac++;
        }



    }
}