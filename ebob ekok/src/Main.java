import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int birinci,ikinci;
        Scanner var = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz: ");
        birinci= var.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        ikinci= var.nextInt();
        if(ikinci>birinci){
            int tmp;
            tmp=birinci;
            birinci=ikinci;
            ikinci=tmp;
        }
        int sayac=1;
        int ebob=1;
        while (sayac<=ikinci){
            if(ikinci%sayac==0 && birinci%sayac==0){

                ebob=sayac;

            }
            sayac++;

        }
        int ekok=(birinci*ikinci)/ebob;
        System.out.println("ebob: "+ebob);
        System.out.println("ekok: "+ekok);
    }
}