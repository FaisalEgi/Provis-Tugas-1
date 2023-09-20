import java.util.Scanner;

public class DataPengguna {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nama
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        // Meminta pengguna untuk memasukkan usia
        System.out.print("Masukkan usia Anda: ");
        int usia = input.nextInt();

        // Meminta pengguna untuk memasukkan tinggi badan
        System.out.print("Masukkan tinggi badan Anda (dalam meter): ");
        double tinggiBadan = input.nextDouble();

        // Menampilkan hasil input dari pengguna
        System.out.println("===== DataPengguna =====");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi Badan: " + tinggiBadan + " meter");

        // Menutup objek Scanner
        input.close();
    }
}