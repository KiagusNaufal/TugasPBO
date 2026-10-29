import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan penjualan hari ini (Rp): ");
        double penjualan = input.nextDouble();

        double uangJasa;
        double komisi;

        if (penjualan <= 2000000) {
            uangJasa = 100000;
            komisi = 0.10 * penjualan;
        } else if (penjualan <= 5000000) {
            uangJasa = 200000;
            komisi = 0.15 * penjualan;
        } else {
            uangJasa = 300000;
            komisi = 0.20 * penjualan;
        }

        double pendapatan = uangJasa + komisi;

        System.out.println();
        System.out.printf("Penjualan   : Rp%,.0f%n", penjualan);
        System.out.printf("Uang Jasa   : Rp%,.0f%n", uangJasa);
        System.out.printf("Komisi      : Rp%,.0f%n", komisi);
        System.out.printf("Pendapatan  : Rp%,.0f%n", pendapatan);
    }
}
