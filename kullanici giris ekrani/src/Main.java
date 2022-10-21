import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Uname, Passwd, accUname = "admin", accPasswd = "admin", control, newPasswd;
        Scanner val = new Scanner(System.in);
        boolean y = true;
        while (y) {
            y=false;
            System.out.print("Kullanıcı Adınız: ");
            Uname = val.nextLine();
            System.out.print("Şifreniz: ");
            Passwd = val.nextLine();
            if (Uname.equals(accUname) && Passwd.equals(accPasswd)) {
                System.out.println("giriş başarılı!!");
            } else {
                boolean x = true;
                while (x) {
                    x=false;
                    System.out.println("Hatalı şifre ya da kullanıcı adı girdiniz.\nŞifreyi sıfırlamak istiyorsanız \"evet\"\nYeniden şifre girmek istiyorsanız \"hayır\" yazınız");
                    control = val.nextLine();
                    if (control.equals("evet")) {
                        System.out.println("Yeni şifre: ");
                        newPasswd = val.nextLine();
                        if (newPasswd.equals(accPasswd)) {
                            System.out.println("mevcut şifreyle sıfırlamak istediğiniz şifre aynı!");
                        } else {
                            accPasswd = newPasswd;
                            System.out.println("Şifre başarıyla değiştirildi. Mevcut şifre: " + accPasswd);
                            y=true;
                        }

                    } else if (control.equals("hayır")) {
                        y=true;

                    }
                    else{
                        System.out.println("evet ya da hayır seçeneklerini seçiniz.");
                        x=true;
                    }
                }
            }
        }
    }
}