import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,sayac=0;
        Scanner val= new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        sayi = val.nextInt();
        System.out.println("çift sayılar\n-----------------------");
        while(sayac<=sayi){
            if(sayac%2==0){
                System.out.print(" "+sayac);
            }
            sayac++;

        }
    }
}