package Jobsheet 5;

public class MainTiket {
    public static void main(String[] args) {
        TiketService ts = new TiketService();
        Tiket t1 = new Tiket("Naruto" , 7000 , "Konohagakure" , "Otogakure");
        Tiket t2 = new Tiket("Sakura" , 4000 , "Otogakure" , "Konohagakure");
        Tiket t3 = new Tiket("Sasuke" , 5000 , "Sunagakure" , "Kirigakure");
        Tiket t4 = new Tiket("Kakashi" , 15000 , "Kirigakure" , "Sunagakure");
        Tiket t5 = new Tiket("Jiraya" , 10000 , "Konohagakure" , "Sunagakure");

        ts.tambah(t1);
        ts.tambah(t2);
        ts.tambah(t3);
        ts.tambah(t4);
        ts.tambah(t5);

        System.out.println("\nTiket sebelum disorting : \n");
        ts.tampilAll();
        
        System.out.println("\nTiket setelah disorting dengan bubblesort\n");
        ts.bubbleSort();
        ts.tampilAll();

        System.out.println("\nTiket setelah disorting dengan selection sort\n");
        ts.selectionSort();
        ts.tampilAll();

    }
}
