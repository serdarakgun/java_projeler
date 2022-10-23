import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int heat;
        System.out.print("Sıcaklığı Giriniz: ");
        heat= val.nextInt();
        if(heat<25){

            if(heat>=15){
                System.out.println("Pikniğe gidebilirsiniz");

            }
            else{
                if(heat<5){
                    System.out.println("Kayağa gidebilirsiniz");
                }
                else{
                    System.out.println("Sinemaya gidebilirsiniz");
                }
            }


        }
        else{
            System.out.println("Yüzmeye Gidebilirsiniz");
        }





    }
}