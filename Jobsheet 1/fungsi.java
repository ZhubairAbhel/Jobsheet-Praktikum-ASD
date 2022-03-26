import java.util.Scanner;

public class fungsi {
    public static void main(String[] args) {

        int [][] bunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9 }
        } ;
        int aglonema = 0, keladi = 0, alocasia = 0, mawar = 0 ;
        int pendapatan ;
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                if (b == 0) {
                    aglonema += bunga[a][b] ;
                } else if (b == 1) {
                    keladi += bunga[a][b] ;
                } else if (b == 2) {
                    alocasia += bunga[a][b] ;
                } else {
                    mawar += bunga[a][b] ;
                }
            }
        }
        pendapatan = (10-1)*75000 + (5-2)*50000 + 15*60000 + (7-5)*10000 ;
        System.out.println("A. Jumlah Stock Bunga Berdasarkan Jenis Bunga :") ;
        System.out.println("Jumlah Stock Bunga Aglonema adalah " + aglonema) ;
        System.out.println("Jumlah Stock Bunga Keladi adalah " + keladi) ;
        System.out.println("Jumlah Stock Bunga Alocasia adalah " + alocasia) ;
        System.out.println("Jumlah Stock Bunga Mawar adalah " + mawar + "\n") ;
        System.out.println("B. Pendapatan RoyalGarden1 jika Semua Bunga Terjual Habis :") ;
        System.out.println("Pendapatan RoyalGarden1 adalah Rp " + pendapatan) ;

    }
}