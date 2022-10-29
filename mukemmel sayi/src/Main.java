import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner var= new Scanner(System.in);
        int sayi,sayac=1,son=0;
        System.out.print("bir sayı giriniz: ");
        sayi= var.nextInt();
        while(sayac<sayi){
            if(sayi%sayac==0){
                son+=sayac;
            }
            sayac++;

        }
        if(son==sayi){
            System.out.println(sayi+" mükemmel bir sayıdır");
        }
        else{
            System.out.println(sayi+" mükemmel bir sayı değildir");
        }
    }
}