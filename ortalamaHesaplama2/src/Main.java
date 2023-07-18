import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Fizik Notunuz : ");
        int fizik = input.nextInt();

        System.out.println("Matematik Notunuz : ");
        int matematik = input.nextInt();

        System.out.println("Türkçe Notunuz : ");
        int turkce = input.nextInt();

        System.out.println("Kimya Notunuz : ");
        int kimya = input.nextInt();

        System.out.println("Müzik Notunuz : ");
        int muzik = input.nextInt();

        System.out.println("Tarih Notunuz : ");
        int tarih = input.nextInt();

        double avarage;

        avarage = (fizik + matematik + turkce + kimya + muzik + tarih) / 6;

        System.out.println("Ortalamanız : " + avarage);
    }
}