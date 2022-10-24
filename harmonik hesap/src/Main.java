import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner val= new Scanner(System.in);
        int limit;
        double sonuc=0;
        System.out.print("sınır olucak sayıyı giriniz: ");
        limit= val.nextInt();
        double sayac=0;
       while(sayac<limit){
           sonuc+=(1/(sayac+1));
            sayac++;
        }
        System.out.println("cevap: "+String.format("%.2f",sonuc));

    }
}