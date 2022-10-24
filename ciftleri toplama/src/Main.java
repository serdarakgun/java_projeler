import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int sayi,sonuc=0;
        Scanner val= new Scanner(System.in);

        do{
            System.out.print("sayı giriniz: ");
            sayi= val.nextInt();
            if(sayi%4==0){

                sonuc=sayi+sonuc;
            }


        }while(sayi%2==0);
        System.out.println("toplam: "+sonuc );
    }
}