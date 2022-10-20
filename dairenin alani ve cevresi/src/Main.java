import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float yaricap;
        float merkezaci;
        float alan;
        float cevre;

        float pi = 3.14f;
        Scanner num=new Scanner(System.in);
        System.out.print("dairenin yarıçapını giriniz: ");
        yaricap= num.nextFloat();
        System.out.print("dairenin merkez açısını giriniz: ");
        merkezaci= num.nextFloat();

        alan= (pi*(yaricap*yaricap)*merkezaci)/360;
        System.out.println(String.format("%.2f",alan));
        cevre=2*pi*yaricap*merkezaci/360;
        System.out.println(String.format("%.2f",cevre));



    }
}