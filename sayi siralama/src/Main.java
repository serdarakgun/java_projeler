import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        int a,b,c;
        System.out.println("üç sayı giriniz");
        a= val.nextInt();
        b= val.nextInt();
        c= val.nextInt();
        if(b<c){
            if(a>c){
                System.out.println(""+b+c+a);
            }
            else if(a<b){
                System.out.println(""+a+b+c);
            }
            else{
                System.out.println(""+b+a+c);
            }
        }
        else{

            if(a>b){
                System.out.println(""+c+b+a);
            }
            else if(a<c){
                System.out.println(""+a+c+b);
            }
            else{
                System.out.println(""+c+a+b);
            }
        }
    }
}