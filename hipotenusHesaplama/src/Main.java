import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Kenarı Giriniz : ");
        int kenar1 = input.nextInt();

        System.out.println("2. Kenarı Giriniz : ");
        int kenar2 = input.nextInt();

        double hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));

        System.out.println("Hipotenüs : " + hipotenus);

    }
}