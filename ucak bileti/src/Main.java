import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args)
    {
        Scanner val = new Scanner(System.in);
        int yol,yas,islem;
        double bilet;
        double son;

        System.out.print("uçakla gittiğiniz mesafe(KM bazında): ");
        yol= val.nextInt();
        bilet=yol*0.10;
        System.out.print("yaşınızı giriniz: ");
        yas= val.nextInt();
        System.out.println("1 -> tek gidiş\n2 -> gidiş-dönüş");
        System.out.print("seçiminiz: ");
        islem= val.nextInt();

        if(islem !=1 && islem !=2 || yol<=0 || yas<=0){

            System.out.println("hatalı giriş yapıldı");
        }
        else {
            if (0 <= yas && yas < 12) {
                if (islem == 1) {
                    son = bilet - (bilet * 50 / 100);
                } else {
                    bilet = bilet - (bilet * 50 / 100);
                    son=(bilet- (bilet * 20 / 100))*2;
                }
                System.out.println("toplam tutar: "+ String.format("%.2f",son));
            } else if (12 <= yas && yas <= 24) {
                if (islem == 1) {
                    son = bilet - (bilet * 10 / 100);
                } else {
                    bilet = bilet - (bilet * 10 / 100);
                    son=(bilet- (bilet * 20 / 100))*2;
                }
                System.out.println("toplam tutar: "+ String.format("%.2f",son));
            } else if (yas > 65) {
                if (islem == 1) {
                    son = bilet - (bilet * 30 / 100);
                } else {
                    bilet = bilet - (bilet * 30 / 100);
                    son=(bilet- (bilet * 20 / 100))*2;
                }
                System.out.println("toplam tutar: "+ String.format("%.2f",son));

            } else {
                if(islem==1){
                    System.out.println("toplam tutar: "+String.format("%.2f",bilet));
                }
                else{
                    son=bilet-(bilet*20/100);
                    System.out.println("toplam tutar: "+ String.format("%.2f",son));
                }
            }

        }

    }
}