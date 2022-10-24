import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        int sayi,sonuc=0,tmp;
        System.out.print("basamakları toplanıcak saıyı giriniz: ");
        sayi= val.nextInt();
        while(sayi!=0){

            tmp=sayi%10;
            sonuc+=tmp;
            sayi=sayi/10;
        }
        System.out.println("basamakların toplamı: "+sonuc);
    }
}