import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner val = new Scanner(System.in);
        System.out.print("i indisi: ");
        int a = val.nextInt();
        System.out.print("j indisi: ");
        int b = val.nextInt();
        int[][] matrix = new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0 ; j<b ; j++){
              matrix[i][j]=val.nextInt();
            }
        }
        System.out.println("matrix : ");
        for(int i=0;i<a;i++){
            for(int j=0 ; j<b ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("transpose : ");
        for(int j=0 ; j<b ; j++){
            for(int i=0;i<a;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
