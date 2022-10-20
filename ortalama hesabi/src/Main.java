import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int topnot=0;
        int tmpnot;
        System.out.print("Ders sayısını giriniz : ");
        Scanner not= new Scanner(System.in);
        int derssayi = not.nextInt();
        for(int i=0;i<derssayi;i++){

            System.out.print((i+1)+". not:");
            tmpnot= not.nextInt();
            topnot=topnot+tmpnot;
        }

        String karne= topnot >= derssayi * 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(karne);

    }
}