import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi Giriniz : ");
        int kilometre = input.nextInt();
        double kmtutari = 2.20;
        double acilisUcreti = 10;

        double total = kilometre * kmtutari + acilisUcreti;

        if (total < 20) {
            System.out.println("Kısa Mesafe Ücreti : 20TL");
        } else {
            System.out.println("Ücret : " + total);
        }

    }
}