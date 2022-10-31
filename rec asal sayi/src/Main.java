import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner var= new Scanner(System.in);
        System.out.print("kontrol edilecek sayıyı giriniz: ");
        int sayi= var.nextInt();

        boolean sonuc=asal(sayi,sayi);
        if(sonuc){
        System.out.print("sayı asaldır");
        }
        else{
            System.out.print("sayı asal değldir");
        }
    }
    public static boolean asal(int sayi,int sayac){
        if(sayac==2){
            return true;
        }
        else if(sayac>2) {
            int sonuc = sayi % (sayac - 1);
            if (sonuc == 0) {
                return false;
            } else {
                return asal(sayi, sayac - 1);
            }
        }
        else{
            return false;
        }

    }

}