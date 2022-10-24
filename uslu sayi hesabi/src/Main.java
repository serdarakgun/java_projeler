import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        int sayi,us,sonuc=1;
        System.out.print("üssü alınacak sayıyı giriniz: ");
        sayi= val.nextInt();
        System.out.print("sayının üssünü giriniz: ");
        us= val.nextInt();
        for(int sayac=0;sayac<us;sayac++){

            sonuc=sonuc*sayi;

        }
        System.out.println("cevap: "+sonuc);


    }
}