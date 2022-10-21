import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int islem;
        float sayi1,sayi2,sonuc = 0f;
        boolean key=true;
        while(key) {
            System.out.println("1 -> toplama\n2 -> çıkarma\n3 -> çarpma\n4 -> bölme\n5 -> çıkış");
            System.out.print("işlem seçiniz: ");
            islem = num.nextInt();
            if(0<islem && islem<6){
                switch (islem) {

                    case 1:
                        System.out.print("İlk sayıyı giriniz: ");
                        sayi1 = num.nextInt();
                        System.out.print("İkinci sayıyı giriniz: ");
                        sayi2 = num.nextInt();
                        sonuc = sayi1 + sayi2;
                        System.out.println("cevap: "+String.format("%.2f",sonuc));
                        break;
                    case 2:
                        System.out.print("İlk sayıyı giriniz: ");
                        sayi1 = num.nextInt();
                        System.out.print("İkinci sayıyı giriniz: ");
                        sayi2 = num.nextInt();
                        sonuc = sayi1 - sayi2;
                        System.out.println("cevap: "+String.format("%.2f",sonuc));
                        break;
                    case 3:
                        System.out.print("İlk sayıyı giriniz: ");
                        sayi1 = num.nextInt();
                        System.out.print("İkinci sayıyı giriniz: ");
                        sayi2 = num.nextInt();
                        sonuc = sayi1 * sayi2;
                        System.out.println("cevap: "+String.format("%.2f",sonuc));
                        break;
                    case 4:
                        System.out.print("İlk sayıyı giriniz: ");
                        sayi1 = num.nextInt();
                        System.out.print("İkinci sayıyı giriniz: ");
                        sayi2 = num.nextInt();
                        if (sayi2 == 0) {
                            System.out.println("paydada sıfır bulunamaz!");

                        }
                        sonuc = sayi1 / sayi2;
                        System.out.println("cevap: "+String.format("%.2f",sonuc));
                        break;
                    case 5:
                        key=false;
                        break;


                }
            }
            else{
                System.out.println("Geçerli bir işlem seçiniz");
                continue;
            }




        }


    }
}