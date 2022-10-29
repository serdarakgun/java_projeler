import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int basamak,sayac=1;
        Scanner var= new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz: ");
        basamak= var.nextInt();
        for(int hesap=1;hesap<basamak;hesap++){
            sayac+=2;
        }
        for(int i=0;i<basamak;i++){
            for(int a=0;a<i;a++){
                System.out.print(" ");
            }
            for(int j=sayac;0<j;j--){
                System.out.print("*");
            }
            sayac-=2;
            System.out.println();
        }
    }
}