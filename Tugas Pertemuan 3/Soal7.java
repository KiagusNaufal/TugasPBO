import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU LUAS BANGUN DATAR ===");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih menu (1-5): ");
        int pilihan = input.nextInt();

        double luas;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();
                luas = sisi * sisi;
                System.out.println("Luas Persegi = " + luas);
                break;
            case 2:
                System.out.print("Masukkan alas  : ");
                double alasSegitiga = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggiSegitiga = input.nextDouble();
                luas = 0.5 * alasSegitiga * tinggiSegitiga;
                System.out.println("Luas Segitiga = " + luas);
                break;
            case 3:
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();
                luas = Math.PI * r * r;
                System.out.println("Luas Lingkaran = " + luas);
                break;
            case 4:
                System.out.print("Masukkan sisi sejajar a: ");
                double a = input.nextDouble();
                System.out.print("Masukkan sisi sejajar b: ");
                double b = input.nextDouble();
                System.out.print("Masukkan tinggi        : ");
                double tinggiTrapesium = input.nextDouble();
                luas = 0.5 * (a + b) * tinggiTrapesium;
                System.out.println("Luas Trapesium = " + luas);
                break;
            case 5:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = input.nextDouble();
                luas = 0.5 * d1 * d2;
                System.out.println("Luas Layang-layang = " + luas);
                break;
            default:
                System.out.println("Menu tidak valid! Pilih angka 1 - 5.");
        }
    }
}
