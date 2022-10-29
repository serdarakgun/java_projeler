import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner var= new Scanner(System.in);
        int basamak,sayi1=0,sayi2=1,tmp;

        System.out.print("kaç basamak sürsün: ");
        basamak= var.nextInt();
        for(int a=0;a<basamak;a++){
            if(a==0){
                System.out.print(" "+sayi1);
            }
            else if(a==1){
                System.out.print(" "+sayi2);
            }
            else{
                System.out.print(" "+(sayi1+sayi2));
                tmp=sayi2;
                sayi2=sayi1+sayi2;
                sayi1=tmp;
            }

        }
    }
}