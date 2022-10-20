import javax.naming.NameNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner len= new Scanner(System.in);

        double a,b,c;
        double alan=0;
        double u=0;
        System.out.println("üçgenin kenar uzunluklarını yazınız");
        System.out.print("1. kenar uzunluğu: ");
        a= len.nextDouble();
        System.out.print("2. kenar uzunluğu: ");
        b= len.nextDouble();
        System.out.print("3. kenar uzunluğu: ");
        c= len.nextDouble();
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("üçgenin alanı: "+alan);

    }
}