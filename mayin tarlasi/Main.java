import java.util.Scanner;

public class Main {

    public static void main(String[] args ){//kazanma durumunu yaz
                                            //0 çıkarsa etrafını aç
        Scanner var= new Scanner(System.in);
        System.out.print("istenen satır sayısı: ");
        int row = var.nextInt();
        System.out.print("istenen sütun sayısı: ");
        int col = var.nextInt();
        MineSweeper game = new MineSweeper(row,col);
        boolean condition=true;
        int rowGuess;
        int colGuess;
        while(condition){
            System.out.println();
            System.out.print("satır seç: ");
            rowGuess= var.nextInt();
            if(rowGuess>row){
                System.out.print("geçerli bir satır sayısı giriniz");
                continue;
            }
            System.out.print("sütun seç: ");
            colGuess= var.nextInt();
            if(colGuess>col){
                System.out.print("geçerli bir sütun sayısı giriniz");
                continue;
            }
            condition= game.userChoice(rowGuess-1,colGuess-1);
            System.out.println("============================");
        }
    }
}
