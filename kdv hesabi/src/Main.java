import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double fiyat;
        double kdv;
        double sonfiyat;
        System.out.print("alıcağınız ürünün fiyatını giriniz : ");
        Scanner oku = new Scanner(System.in);
        fiyat = oku.nextDouble();

        if(fiyat<=1000){
             kdv=(fiyat/100*18);
             sonfiyat = kdv+ fiyat;
        }
        else {
             kdv=(fiyat/100*8);
             sonfiyat = kdv+ fiyat;
        }
        System.out.println("KDV'siz fiyat: "+fiyat);
        System.out.println("KDV'li fiyat: "+sonfiyat);
        System.out.println("KDV tutarı: "+kdv);


    }


}