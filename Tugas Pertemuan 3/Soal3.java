import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK            : ");
        String nik = input.nextLine();
        System.out.print("Masukkan Nama           : ");
        String nama = input.nextLine();
        System.out.println("Kode Golongan:");
        System.out.println("  1 = Menikah");
        System.out.println("  2 = Belum menikah");
        System.out.println("  3 = Cerai");
        System.out.println("  4 = Menikah dan punya anak");
        System.out.print("Masukkan Kode Golongan  : ");
        int kode = input.nextInt();
        System.out.print("Masukkan Jumlah Anak    : ");
        int jumlahAnak = input.nextInt();

        double gajiPokok;
        String status;

        switch (kode) {
            case 1:
                gajiPokok = 1200000;
                status = "Menikah";
                break;
            case 2:
                gajiPokok = 1500000;
                status = "Belum menikah";
                break;
            case 3:
                gajiPokok = 1750000;
                status = "Cerai";
                break;
            case 4:
                gajiPokok = 2000000;
                status = "Menikah dan punya anak";
                break;
            default:
                System.out.println("Kode golongan tidak valid!");
                return;
        }

        // c) Tunjangan pasangan = 10% gaji pokok (hanya untuk yang menikah)
        double tunjanganPasangan = 0;
        if (kode == 1 || kode == 4) {
            tunjanganPasangan = 0.10 * gajiPokok;
        }

        // d) Tunjangan anak = 5% gaji pokok x jumlah anak
        double tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;

        // b) Tunjangan = tunjangan pasangan + tunjangan anak
        double tunjangan = tunjanganPasangan + tunjanganAnak;

        // a) Gaji bersih = gaji pokok + tunjangan
        double gajiBersih = gajiPokok + tunjangan;

        System.out.println();
        System.out.println("========== SLIP GAJI ==========");
        System.out.println("NIK                : " + nik);
        System.out.println("Nama               : " + nama);
        System.out.println("Status             : " + status);
        System.out.println("Jumlah Anak        : " + jumlahAnak);
        System.out.printf("Gaji Pokok         : Rp%,.0f%n", gajiPokok);
        System.out.printf("Tunjangan Pasangan : Rp%,.0f%n", tunjanganPasangan);
        System.out.printf("Tunjangan Anak     : Rp%,.0f%n", tunjanganAnak);
        System.out.printf("Total Tunjangan    : Rp%,.0f%n", tunjangan);
        System.out.printf("Gaji Bersih        : Rp%,.0f%n", gajiBersih);
    }
}
