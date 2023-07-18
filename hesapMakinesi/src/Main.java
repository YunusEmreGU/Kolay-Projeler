import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int sayi1 = input.nextInt();
        System.out.println("Sayı Giriniz : ");
        int sayi2 = input.nextInt();
        System.out.println("İşlemi Seçiniz 1-(Toplama: +) 2-(Çıkarma: -) 3-(Bölme: /) 4-(Çarpma: *) : ");
        int sayi3 = input.nextInt();
        int total = 0;


        //if
        if (sayi3 == 1) {
            total = sayi1 + sayi2;
            System.out.println("Sonuç : " + total);
        } else if (sayi3 == 2) {
            total = sayi1 - sayi2;
            System.out.println("Sonuç : " + total);
        } else if (sayi3 == 3) {
            total = sayi1 / sayi2;
            System.out.println("Sonuç : " + total);
        } else if (sayi3 == 4) {
            total = sayi1 * sayi2;
            System.out.println("Sonuç : " + total);
        } else {
            System.out.println("Tanımsız Değer Girdiniz!!!");
        }

        

        //switch
        switch (sayi3){
            case 1:
                total = sayi1 + sayi2;
                System.out.println("Sonuç : " + total);
                break;
            case 2:
                total = sayi1 - sayi2;
                System.out.println("Sonuç : " + total);
                break;
            case 3:
                total = sayi1 * sayi2;
                System.out.println("Sonuç : " + total);
                break;
            case 4:
                total = sayi1 * sayi2;
                System.out.println("Sonuç : " + total);
                break;

        }
    }
}