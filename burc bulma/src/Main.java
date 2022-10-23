import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        int ay,gun;
        System.out.print("Doğdunuz ayı giriniz: ");
        ay = val.nextInt();
        System.out.print("Doğdunuz günü giriniz: ");
        gun = val.nextInt();
        if(1<=ay && ay<=12) {
            if (ay == 1) {//ocak
                if (1 <= gun && gun <= 31) {
                    if (gun > 21) {
                        System.out.println("burcunuz kova");
                    } else {
                        System.out.println("burcunuz oğlak");
                    }
                } else {
                    System.out.println("günü hatalı girdiniz");
                }

            } else if (ay == 2) {//şubat
                if (1 <= gun && gun <= 28) {
                    if (gun > 19) {
                        System.out.println("burcunuz balık");
                    } else {
                        System.out.println("burcunuz kova");
                    }
                } else {
                    System.out.println("günü hatalı girdiniz");
                }
            } else if (ay == 3) {//mart
                if (1 <= gun && gun <= 31) {
                    if (gun > 20) {
                        System.out.println("burcunuz koç");
                    } else {
                        System.out.println("burcunuz balık");
                    }
                } else {
                    System.out.println("günü hatalı girdiniz");
                }
            } else if (ay == 4) {//nisan
                if (1 <= gun && gun <= 30) {
                    if (gun > 20) {
                        System.out.println("burcunuz boğa");
                    } else {
                        System.out.println("burcunuz koç");
                    }
                } else {
                    System.out.println("günü hatalı girdiniz");
                }
            } else if (ay == 5) {//mayıs
                if (1 <= gun && gun <= 31) {
                    if (gun > 21) {
                        System.out.println("burcunuz ikizler");
                    } else {
                        System.out.println("burcunuz boğa");
                    }
                } else {
                    System.out.println("günü hatalı girdiniz");
                }
            } else if (ay == 6) {//haziran
                if (1 <= gun && gun <= 30) {
                    if (gun > 22) {
                        System.out.println("burcunuz yengeç");
                    } else {
                        System.out.println("burcunuz ikizler");
                    }
                } else {
                    System.out.println("günü hatalı girdiniz");
                }
            } else if (ay == 7) {//temmuz
                if (1 <= gun && gun <= 31) {
                    if (gun > 22) {
                        System.out.println("burcunuz aslan");
                    } else {
                        System.out.println("burcunuz yengeç");
                    }
                } else {
                    System.out.println("günü hatalı girdiniz");
                }
            } else if (ay == 8) {//ağustos
                if (1 <= gun && gun <= 31) {
                    if (gun > 22) {
                        System.out.println("burcunuz başak");
                    } else {
                        System.out.println("burcunuz aslan");
                    }
                } else {
                    System.out.println("günü hatalı girdiniz");
                }
            } else if (ay == 9) {//eylül
                if (1 <= gun && gun <= 30) {
                    if (gun > 22) {
                        System.out.println("burcunuz terazi");
                    } else {
                        System.out.println("burcunuz başak");
                    }
                } else {
                    System.out.println("günü hatalı girdiniz");
                }
            } else if (ay == 10) {//ekim
                if (1 <= gun && gun <= 31) {
                    if (gun > 22) {
                        System.out.println("burcunuz akrep");
                    } else {
                        System.out.println("burcunuz terazi");
                    }
                } else {
                    System.out.println("günü hatalı girdiniz");
                }
            } else if (ay == 11) {//kasım
                if (1 <= gun && gun <= 30) {
                    if (gun > 21) {
                        System.out.println("burcunuz yay");
                    } else {
                        System.out.println("burcunuz akrep");
                    }
                } else {
                    System.out.println("günü hatalı girdiniz");
                }
            } else if (ay == 12) {//aralık
                if (1 <= gun && gun <= 31) {
                    if (gun > 21) {
                        System.out.println("burcunuz oğlak");
                    } else {
                        System.out.println("burcunuz yay");
                    }
                } else {
                    System.out.println("günü hatalı girdiniz");
                }
            }
        }
        else{
            System.out.println("Ayı yanlış girdiniz");
        }

    }
}