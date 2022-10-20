import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        double boy;
        double kilo;
        double sonuc;
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy= val.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo= val.nextDouble();
        sonuc=kilo/(boy*boy);
        System.out.println(sonuc);
    }
}