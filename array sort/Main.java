import java.util.Scanner;
public class Main {

    public static void main(String[] args){

    Scanner val = new Scanner(System.in);
    System.out.print("Dizinin boyutu: ");
    int loop= val.nextInt();
    int[] array = new int[loop];
    for(int a=0;a<loop;a++){
        array[a]= val.nextInt();
    }
        System.out.print("Sıralama: ");
        for(int x : sort(array,loop)){
            System.out.print(x);
            System.out.print(" ");
        }
    }
    private static int[] sort(int[] array,int length){

        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(array[i]>array[j]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
    return array;
    }

}
