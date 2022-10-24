import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayac,elemansayi;
        double sonuc;
        Scanner val= new Scanner(System.in);
        System.out.print("kümenin eleman sayısı: ");
        elemansayi= val.nextInt();
        System.out.print("kaçlı gruplar oluşturulacak:");
        sayac= val.nextInt();
        if(elemansayi>=sayac){

            sonuc=fakhesap(elemansayi)/(fakhesap(sayac)*(fakhesap(elemansayi-sayac)));
            System.out.println("C("+elemansayi+","+sayac+")="+String.format("%.2f",sonuc));
        }
        else{
            System.out.println("kümenin eleman sayısı alt kümedeki eleman sayısından fazla olmalıdır.");
        }

    }
    public static int fakhesap(int sayi){
        int sonuc=1;
        for(int sayac=0;sayac<sayi;sayac++){

            sonuc=sonuc*(sayi-sayac);

        }
        return sonuc;
    }
}