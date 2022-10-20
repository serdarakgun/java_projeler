import java.time.Period;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double Start=10;
        double PerKm=2.20;
        double Km;
        double Son=0;
        Scanner Kmeter = new Scanner(System.in);
        System.out.print("alınan yol miktarı (km cinsinden): ");
        Km= Kmeter.nextDouble();
        Son=Start+(PerKm*Km);
        if(Son<20){
            Son=20;
            System.out.println("para tutarı: "+String.format("%.2f",Son)+"TL");
        }
        else{
            System.out.println("para tutarı: "+String.format("%.2f",Son)+"TL");
        }




    }
}