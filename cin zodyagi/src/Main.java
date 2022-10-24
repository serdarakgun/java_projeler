import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yil,zodyak;
        System.out.print("Doğum yılınızı giriniz: ");
        Scanner val= new Scanner(System.in);
        yil= val.nextInt();
        zodyak=yil%12;
        switch (zodyak){
            case 0:
                System.out.println("çin zodyağı burcunuz maymun");
                break;
            case 1:
                System.out.println("çin zodyağı burcunuz horoz");
                break;
            case 2:
                System.out.println("çin zodyağı burcunuz köpek");
                break;
            case 3:
                System.out.println("çin zodyağı burcunuz domuz");
                break;
            case 4:
                System.out.println("çin zodyağı burcunuz fare");
                break;
            case 5:
                System.out.println("çin zodyağı burcunuz öküz");
                break;
            case 6:
                System.out.println("çin zodyağı burcunuz kaplan");
                break;
            case 7:
                System.out.println("çin zodyağı burcunuz tavşan");
                break;
            case 8:
                System.out.println("çin zodyağı burcunuz ejderha");
                break;
            case 9:
                System.out.println("çin zodyağı burcunuz yılan");
                break;
            case 10:
                System.out.println("çin zodyağı burcunuz at");
                break;
            case 11:
                System.out.println("çin zodyağı burcunuz koyun");
                break;




        }
    }
}