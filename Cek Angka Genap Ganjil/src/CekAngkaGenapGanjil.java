import java.util.Scanner;

public class CekAngkaGenapGanjil {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        while (true) {
            // Meminta pengguna untuk memasukkan angka bulat
            System.out.print("Masukkan sebuah angka bulat (0 untuk keluar): ");
            int angka = input.nextInt();

            // Masukan angka 0 untuk keluar dari program
            if (angka == 0) {
                System.out.println("Terima kasih! Program berhenti.");
                break;
            }

            // Memeriksa apakah angka genap atau ganjil
            if (angka % 2 == 0) {
                System.out.println("Angka genap.");
            } else {
                System.out.println("Angka ganjil.");
            }
        }

        // Menutup objek Scanner
        input.close();
    }
}
