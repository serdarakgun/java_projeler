import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,tur,fiz,kim,muz,sayac=0,top=0;
        float ort;
        Scanner val=new Scanner(System.in);
        System.out.print("matematik notu: ");
        mat= val.nextInt();
        if(mat<=100 && 0<=mat){
            sayac++;
            top+=mat;
        }
        System.out.print("türkçe notu: ");
        tur= val.nextInt();
        if(tur<=100 && 0<=tur){
            sayac++;
            top+=tur;
        }
        System.out.print("fizik notu: ");
        fiz= val.nextInt();
        if(fiz<=100 && 0<=fiz){
            sayac++;
            top+=fiz;
        }
        System.out.print("kimya notu: ");
        kim=val.nextInt();
        if(kim<=100 && 0<=kim){
            sayac++;
            top+=kim;
        }
        System.out.print("müzik notu: ");
        muz= val.nextInt();
        if(muz<=100 && 0<=muz){
            sayac++;
            top+=muz;
        }
        ort=top/sayac;
        if(ort<=55){
            System.out.println("Dersten geçemediniz");
        }
        else{
            System.out.println("Dersten Geçtiniz");
        }


    }
}