import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner var= new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int sayi = var.nextInt();
        int tmp=sayi;
        while(sayi>0){
            System.out.print(sayi+" ");
            sayi=sayi-5;
        }
        while(sayi!=tmp){
            System.out.print(sayi+" ");
            sayi=sayi+5;

        }
        System.out.print(sayi);

    }
}
