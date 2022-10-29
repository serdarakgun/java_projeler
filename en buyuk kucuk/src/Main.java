import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner var= new Scanner(System.in);
        int eleman,sayi1,sayi2,buyuk,kucuk;
        System.out.print("kaç eleman gireceğinizi yazınız: ");
        eleman= var.nextInt();
        System.out.print("1. sayı: ");
        sayi1= var.nextInt();
        buyuk=sayi1;
        kucuk=sayi1;
        for(int i=1;i<eleman;i++){
            System.out.print((eleman+1)+". sayı: ");
            sayi2= var.nextInt();
            if(buyuk<sayi2){
                buyuk=sayi2;

            }
            if(kucuk>sayi2){
                kucuk=sayi2;
            }
        }
        System.out.println("en büyük sayı: "+buyuk);
        System.out.println("en küçük sayı: "+kucuk);




    }
}