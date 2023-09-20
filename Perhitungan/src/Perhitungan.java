import java.util.Scanner;

public class Perhitungan {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan dua angka bulat
        System.out.print("Masukkan angka pertama: ");
        int angkaPertama = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angkaKedua = input.nextInt();

        // Melakukan operasi penjumlahan
        int hasilPenjumlahan = angkaPertama + angkaKedua;
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);

        // Melakukan operasi pengurangan
        int hasilPengurangan = angkaPertama - angkaKedua;
        System.out.println("Hasil pengurangan: " + hasilPengurangan);

        // Melakukan operasi perkalian
        int hasilPerkalian = angkaPertama * angkaKedua;
        System.out.println("Hasil perkalian: " + hasilPerkalian);

        // Melakukan operasi pembagian
        if (angkaKedua != 0) {
            double hasilPembagian = (double) angkaPertama / angkaKedua;
            System.out.println("Hasil pembagian: " + hasilPembagian);
        } else {
            System.out.println("Pembagian oleh nol tidak diizinkan.");
        }

        // Menutup objek Scanner
        input.close();
    }
}