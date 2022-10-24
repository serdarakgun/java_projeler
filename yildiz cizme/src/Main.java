import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        System.out.print("yıldız büyüklüğü için sayı giriniz(tek sayı): ");
        int sayi;
        sayi= val.nextInt();
        for(int i=1; i<sayi;i+=2){
            System.out.println("");
            for(int j=0;j<(sayi-i)/2;j++){
                System.out.print(" ");

            }
            for(int a=0;a<i;a++){
                System.out.print("*");
            }



        }


        for(int i=sayi; 0<i;i-=2){
            System.out.println("");
            for(int j=0;j<(sayi-i)/2;j++){
                System.out.print(" ");

            }
            for(int a=0;a<i;a++){
                System.out.print("*");
            }



        }
    }
}