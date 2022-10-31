import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        boolean sonuc;
        System.out.print("sayı giriniz: ");
        int sayi= var.nextInt();
        sonuc=palindrom(sayi);
        if(sonuc){
            System.out.print("sayımız palindrom bir sayıdır!");
        }
        else{
            System.out.print("sayımız palindrom bir sayı değildir!");
        }

    }
    static boolean palindrom(int sayi){
        int tmp=sayi,ters,son=0;
        while(tmp!=0){
            ters=tmp%10;
            tmp/=10;
            son=(son*10)+ters;
        }
        return sayi == son;
    }
}