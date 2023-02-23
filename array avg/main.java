import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("kaç sayı girilecek: ");
        int length = scan.nextInt();
        int[] avgarray = new int[length];
        for(int loop=0;loop<length;loop++){
            avgarray[loop]= scan.nextInt();
        }
        double last=0;
        for (int a: avgarray){
            last+= a;
        }
        last=last/length;
        System.out.printf("%.2f",last);
    }
}
