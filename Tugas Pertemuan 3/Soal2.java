import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kode hari (1-7): ");
        int kode = input.nextInt();

        String hari;
        switch (kode) {
            case 1:
                hari = "Senin";
                break;
            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;
            case 4:
                hari = "Kamis";
                break;
            case 5:
                hari = "Jumat";
                break;
            case 6:
                hari = "Sabtu";
                break;
            case 7:
                hari = "Minggu";
                break;
            default:
                hari = null;
        }

        if (hari != null) {
            System.out.println("Nama hari: " + hari);
        } else {
            System.out.println("Kode hari tidak valid! Masukkan angka 1 - 7.");
        }
    }
}
