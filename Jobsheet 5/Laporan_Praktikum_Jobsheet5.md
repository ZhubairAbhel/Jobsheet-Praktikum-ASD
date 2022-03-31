# Laporan Praktikum Jobsheet 5
### Nama  : Zhubair Abhel
### NIM   : 2141720248
### Kelas : TI-1G
### Absen : 30

## **SubBab 5.2.2**  

<img src = img/praktikum1.png>
<img src = img/praktikum2.png>

## **SubBab 5.2.3**

1. Terdapat di method apakah proses bubble sort?  
**Terdapat pada method bubblesort**  

2. Terdapat di method apakah proses selection sort?
**tidak terdapat method selection sort pada program tersebut**  

3. Apakah yang dimaksud proses swap? Tuliskan potongan program untuk melakukan 
proses swap tersebut!  
**Swap adalah proses menukar value. Contoh x=1 dan y=2 diswap menjadi x=2 y=1**  
```java
Mahasiswa tmp = listMhs[j];
listMhs[j] = listMhs[j - 1];
listMhs[j - 1] = tmp
```  

4. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:
Untuk apakah proses tersebut?  
**Untuk swap listMhs[j] dengan listMhs[j-1] jika syarat if terpenuhi**  

5. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j? 
**perulangan i untuk melanjutkan ke proses pengerutan selanjutnya jika pengutuan pertema sudah dilakukan 
seterusnya. perulangan j untuk melakukan pengurutan. Misal jika angka x sudah diurutkan dengan perulangan j 
maka perulangan i akan membuat j melakukan perulangan lagi tanpa x karena x sudah terurut.**  

b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?  
**karena jika listMhs nya 5 maka index nya 0-4 oleh karena itu menggunakan -1**  

c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?  
**karena agar tidak meng include angka yang sudah terurut. jika listMhs adalah 5
dan angka yang terurut sudah 2 index maka yang diurutkan hanyalah 3 index saja jadi 
jika i nya sudah 2 maka hanya mengurutkan index 0-2 karena 5-2 = 3 index**  

d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan 
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?  
**Perulangan i ada sebanyak 50 kali dan ada 49 tahap**  

## **SubBab 5.3.2**  

<img src = img/praktikum1.png>  
<img src = img/praktikum3.png>  

## **SubBab 5.3.3**  

Di dalam method selection sort, terdapat baris program seperti di bawah ini:
Untuk apakah proses tersebut, jelaskan!  
**Untuk mengurutkan data. Jadi ketika perulangan masih memenuhi syarat jika listMhs[j].ipk 
lebih kecil dari listMhs[idxMin].ipk maka idxMin akan diupdate dengan j yaitu index yang lebih 
kecil tadi.**  

## **SubBab 5.4.2**  

<img src = img/praktikum1.png>  
<img src = img/praktikum4.png>  

## **SubBab 5.4.3**  
```java
void insertionSort(boolean asc) {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            if (asc) {
                while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
            } else {
                while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
            }
            listMhs[j] = temp;
        }
    }
```  
<img src = img/praktikum5.png>  

## **SubBab 5.4.3**  

**Source Code Program Class Tiket**  
```java
package pertemuan_6.jobsheet5;

public class Tiket {
    String maskapai, asal, tujuan;
    int harga;

    Tiket(String m, int h, String a, String t) {
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }

    void tampil() {
        System.out.println("Maskapai = " + maskapai);
        System.out.println("Harga = " + harga);
        System.out.println("Asal = " + asal);
        System.out.println("Tujuan = " + tujuan);
    }
}
```  
**Source Code Program Class TiketService**  
```java
package pertemuan_6.jobsheet5;

public class TiketService {
    Tiket[] tikets = new Tiket[5];
    int idx;

    void tambah(Tiket t) {
        if (idx < tikets.length) {
            tikets[idx] = t;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilAll() {
        for (Tiket t : tikets) {
            t.tampil();
            System.out.println("----------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < tikets.length - 1; i++) {
            for (int j = 1; j < tikets.length - i; j++) {
                if (tikets[j].harga > tikets[j - 1].harga) {
                    Tiket tmp = tikets[j];
                    tikets[j] = tikets[j - 1];
                    tikets[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < tikets.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < tikets.length; j++) {
                if (tikets[j].harga < tikets[idxMin].harga) {
                    idxMin = j;
                }
            }
            Tiket tmp = tikets[idxMin];
            tikets[idxMin] = tikets[i];
            tikets[i] = tmp;
        }
    }

}
```  

**Source Code Program Class MainTiket**  

```java
package pertemuan_6.jobsheet5;

public class MainTiket {
    public static void main(String[] args) {
        TiketService ts = new TiketService();
        Tiket t1 = new Tiket("Garuda" , 7000 , "Jakarta" , "Bali");
        Tiket t2 = new Tiket("Shukoi" , 4000 , "Kediri" , "Bali");
        Tiket t3 = new Tiket("Pesawat tempur" , 5000 , "Blitar" , "Bali");
        Tiket t4 = new Tiket("Andromeda" , 15000 , "Surabaya" , "Bali");
        Tiket t5 = new Tiket("Hydra" , 10000 , "Malang" , "Bali");

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
```  

**ScreenShot Hasil Program**  

<img src = img/latihan1.png>  
<img src = img/latihan2.png>  
<img src = img/latihan3.png>  