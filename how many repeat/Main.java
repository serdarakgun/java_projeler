import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner val = new Scanner(System.in);
        ArrayList <Calc> list=new ArrayList<>();
        System.out.print("Eleman sayısı: ");
        int eleman= val.nextInt();
        for(int a=0;a<eleman;a++){
            int sayi= val.nextInt();
            boolean control=true;
            for(Calc x:list){
                if(x.num==sayi){
                    x.times++;
                    control=false;
                    break;
                }
            }
            if(control){
                Calc temp=new Calc(sayi,1);
                list.add(temp);
            }
        }
        System.out.print("Dizi: [");
        for(Calc x:list){
            for(int b=0;b< x.times;b++){
                System.out.print(" "+x.num);
            }
        }
        System.out.println(" ]");
        System.out.println("Tekrar sayıları");
        for (Calc x:list){
            System.out.println(x.num+" sayısı "+x.times+" kere tekrar edildi.");
        }
    }

}
