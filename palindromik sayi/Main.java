import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner val = new Scanner(System.in);
        String word = val.nextLine();
        int loop=word.length()/2;
        for(int i=0;i<loop;i++){
            if(word.charAt(i)!=word.charAt(word.length()-i-1)){
                System.out.println("palindromik kelime değildir");
                System.exit(1);
            }
        }
        System.out.println("kelime palindromiktir");
    }

}
