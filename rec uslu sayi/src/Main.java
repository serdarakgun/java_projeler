import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner var= new Scanner(System.in);
        System.out.print("üssü alınacak sayıyı giriniz: ");
        int sayi= var.nextInt();
        System.out.print("üssünü giriniz: ");
        int us= var.nextInt();
        int sonuc=fonksiyon(sayi,us);
        System.out.print("cevap= "+sonuc);


    }
    public static int fonksiyon(int taban,int us){



                if(us==0){
                    return 1;
                }
                return  taban * fonksiyon(taban, us-1);
    }
}