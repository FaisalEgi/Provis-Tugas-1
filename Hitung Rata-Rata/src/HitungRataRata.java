import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulangi = true;

        while (ulangi) {
            int total = 0;
            int jumlahAngka = 0;

            System.out.println("Masukkan serangkaian angka (selesai dengan menginputkan 0):");
            
            while (true) {
                try {
                    int angka = input.nextInt();
                    if (angka == 0) {
                        break;
                    }
                    total += angka;
                    jumlahAngka++;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Input tidak valid. Mohon masukkan angka.");
                    input.nextLine(); // Pemberitahuan jika input tidak valid
                }
            }

            if (jumlahAngka > 0) {
                double rataRata = (double) total / jumlahAngka;
                System.out.println("Nilai rata-rata: " + rataRata);
            } else {
                System.out.println("Tidak ada angka yang dimasukkan.");
            }

            System.out.print("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
            String pilihan = input.next();

            if (!pilihan.equalsIgnoreCase("ya")) {
                ulangi = false;
            }
        }

        System.out.println("Terima kasih! Program berhenti.");
        input.close();
    }
}

