import java.util.Scanner;

public class HitungLuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input panjang alas segitiga
        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = input.nextDouble();

        // Input tinggi segitiga
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        // Hitung luas segitiga
        double luas = 0.5 * alas * tinggi;

        // Menampilkan hasil
        System.out.println("Luas segitiga adalah: " + luas);

        // Menutup scanner
        input.close();
}
}
