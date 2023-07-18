import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen vize notunuzu giriniz: ");
        double mesaj1 = input.nextDouble();

        System.out.println("Lütfen final notunuzu giriniz: ");
        double mesaj2 = input.nextDouble();

        double yuzde1;
        double yuzde2;

        yuzde1 = mesaj1 * 0.40;
        yuzde2 = mesaj2 * 0.60;

        double toplam;
        toplam = yuzde1 + yuzde2;

        System.out.println("Notunuz: "+toplam);
    }
}