import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float Armut= 2.14f;
        float Elma= 3.67f;
        float Domates= 1.11f;
        float Muz= 0.95f;
        float Patlican= 5.00f;
        float toplam=0;
        Scanner val=new Scanner(System.in);
        System.out.println("Armut : 2,14 TL\n" +
                "Elma : 3,67 TL\n" +
                "Domates : 1,11 TL\n" +
                "Muz: 0,95 TL\n" +
                "Patlıcan : 5,00 TL");
        System.out.print("kaç kilo armut ? :  ");
        toplam+= (val.nextFloat()*2.14);
        System.out.print("kaç kilo elma ? : ");
        toplam+= (val.nextFloat()*3.67);
        System.out.print("kaç kilo domates ? :  ");
        toplam+= (val.nextFloat()*1.11);
        System.out.print("kaç kilo muz ? : ");
        toplam+= (val.nextFloat()*0.95);
        System.out.print("kaç kilo patlıcan ? :  ");
        toplam+= (val.nextFloat()*5);
        System.out.println(toplam);





    }
}