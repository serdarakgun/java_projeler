import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner val= new Scanner(System.in);
        String userName,password;

        int right=3;
        int balance=1500;
        int select;

        while(right>0){

        System.out.print("Kullanıcı adınız: " );
        userName= val.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password= val.nextLine();

        if(userName.equals("patika") && password.equals("dev123")){

            System.out.println("Merhaba bankaya hoşgeldiniz!");
            System.out.println("İşlem seçiniz\n-----------------\n1 -> Para yatırma\n2 -> Para çekme\n3 -> Bakiye sorgulama\n4 -> Çıkış yap");
            select= val.nextInt();
            int price;
            switch (select){
                case 1:
                    price=0;
                    System.out.print("Para miktarı : ");
                    price = val.nextInt();
                    balance += price;
                    break;
                case 2:
                    price=0;
                    System.out.print("Para miktarı : ");
                    price = val.nextInt();
                    if (price > balance) {
                        System.out.println("Bakiye yetersiz.");
                    } else {
                        balance -= price;
                    }
                    break;
                case 3:
                    System.out.println("Bakiyeniz : " + balance);
                    break;
                case 4:
                    System.out.println("Tekrar görüşmek üzere!");
                    System.exit(0);

            }

        }
        else {
            right--;
            System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
            if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
            }
            else{
                System.out.println("Kalan Hakkınız : " + right);
            }
        }

        }
    }
}