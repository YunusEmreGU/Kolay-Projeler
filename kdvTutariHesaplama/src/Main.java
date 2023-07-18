import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tutar Giriniz : ");
        int tutar = input.nextInt();

        System.out.println("KDV Oranı : %18");

        double kdv = 0.18;
        double kdvTutar;

        kdvTutar = tutar * kdv;
        System.out.println("KDV Tutarı : " + kdvTutar);

        double total = tutar + kdvTutar;
        System.out.println("KDV'li Tutar : " + total);
    }
}