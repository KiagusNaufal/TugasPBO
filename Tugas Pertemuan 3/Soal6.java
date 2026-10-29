import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah memiliki kartu member? (y/t): ");
        String jawab = input.next();
        boolean member = jawab.equalsIgnoreCase("y");

        System.out.print("Masukkan total belanja (Rp)        : ");
        double totalBelanja = input.nextDouble();

        double diskon = 0;

        if (member) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }

        double totalBayar = totalBelanja - diskon;

        System.out.printf("Diskon                             : Rp%,.0f%n", diskon);
        System.out.printf("Total yang harus dibayar           : Rp%,.0f%n", totalBayar);

        System.out.print("Masukkan uang yang diberikan (Rp)  : ");
        double uang = input.nextDouble();

        if (uang >= totalBayar) {
            double kembalian = uang - totalBayar;
            System.out.printf("Kembalian                          : Rp%,.0f%n", kembalian);
        } else {
            double kurang = totalBayar - uang;
            System.out.printf("Uang kurang                        : Rp%,.0f%n", kurang);
        }
    }
}
