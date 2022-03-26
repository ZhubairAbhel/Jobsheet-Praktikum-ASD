import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no_indu_mhs;
        int hitung; // untuk menghitung dan menemukan 2 angka trakhir dari nim tsb
        int default_NIM;
        default_NIM = 2041720000;
        boolean cof = false ;
do {
        System.out.println("\n+=================================+");
        System.out.println("| P R O G R A M - C E K - H A R I |");
        System.out.println("+=================================+");
        System.out.print("| Masukkan NIM anda : ");
        no_indu_mhs = input.nextInt();
        System.out.println("+=================================+\n");

        // rumus
        hitung = no_indu_mhs - 2041720000;

        int i = 10;
        if (hitung < 10) {
            hitung = hitung + i;
        }
        System.out.println("- - - - - - - H A S I L - - - - - -\n");
        System.out.println("+=================================+");
        System.out.println("| 2 Digit Terakhir = " + hitung + "           |");
        System.out.println("+=================================+");

        for (int j = 0; j < hitung; j++) {
            int cekhari = j % 7;
            if (cekhari == 0) {
                System.out.print("Senin, ");
            } else if (cekhari == 1) {
                System.out.print("Selasa, ");
            } else if (cekhari == 2) {
                System.out.print("Rabu, ");
            } else if (cekhari == 3) {
                System.out.print("Kamis, ");
            } else if (cekhari == 4) {
                System.out.print("Jum'at, ");
            } else if (cekhari == 5) {
                System.out.print("Sabtu, ");
            } else {
                System.out.print("Minggu, ");
            }

        }
    } while (cof = true);
    }

}