import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();

        // Kabisat: habis dibagi 4 tetapi tidak habis dibagi 100,
        // atau habis dibagi 400
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println(tahun + " adalah tahun KABISAT");
        } else {
            System.out.println(tahun + " BUKAN tahun kabisat");
        }
    }
}
