# Laporan Praktikum Jobsheet 8
### Nama  : Ikmal Faris Musyaffa
### NIM   : 2141720123
### Kelas : TI-1G
### Absen : 15

## **SubBab 8.2.2**  

<img src= img/p11.png>  

## **SubBab 8.2.3**  

1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size 
bernilai 0?  

**Karena front dan rear agar tidak ada data harus bernilai -1, jika bernilai 0 maka front dan rear ada di indeks 0 sedangkan size nya masih 0 atau tidak ada raung.**

2.  Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!  
```java
if (rear == max - 1) {
    rear = 0;
}
```
**Jika rear ada di index terakhir dari array maka rear nya akan di set ke 0, jadi rear tidak akan melewati batas maksimal dari indeks array**

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut! 
```java
```
****

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), 
melainkan int i=front?  

**Ya karena bisa saja indeks terdepan bukan indeks 0, indeks terdepan adalah front jadi yang di tampilkan adalah dimulai dari indeks front**

5. Pada method print, jelaskan maksud dari potongan kode berikut!  
```java
i = (i + 1) % max;
```
**Jadi ini iterasi untuk mengeprint data pada array. Ketika i sudah pada indeks paling terakhir dari array, i akan kembali ke 0. Misal max = 5, front = 3, rear = 2 maka akan seperti berikut :  
i = 3 -> print index 3  
i = (3+1) % max // i = 4 -> print index 4  
i = (4+1) % max // i = 0 -> print index 0 // karena 5 % 5 = 0  
i = (0+1) % max // i = 1 -> print index 1  
i = (1+1) % max // i = 2 -> print index 2  //menggunakan sout di luar while karena syarat while adalah i != rear  
dengan begitu sistem tidak akan mengeprint indeks diluar indeks array dan mengulang ke 0 jika i sudah pada indeks paling terakhir dari array**  

6. Tunjukkan potongan kode program yang merupakan queue overflow!
```java
System.out.print("Masukkan data baru: ");
int dataMasuk = sc.nextInt();
Q.Enqueue(dataMasuk);
break;
```
dan
```java
if (IsFull()) {
    System.out.println("Queue sudah penuh");
}
```

7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan 
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi 
queue overflow dan queue underflow, program dihentikan!

**Method Dequeue tidak perlu modifikasi sedangkan method Enqueue saya modifikasi menjadi :**  
```java
public int Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            return 0;
        } else {
            if (IsEmpty()){
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
            return 1;
        }
    }
```  
**Untuk fungsi main saya edit pada bagian case 1 dan 2 menjadi :**  
```java
case 1:
    System.out.print("Masukkan data baru: ");
    int dataMasuk = sc.nextInt();
    pilih = Q.Enqueue(dataMasuk);
    break;
case 2:
    int dataKeluar = Q.Dequeue();
    if (dataKeluar != 0) {
        System.out.println("Data yang dikeluarkan: " + dataKeluar);
        break;
    } else {
        pilih = dataKeluar;
        break;
    }
```
**Screenshot Hasil Program**  
<img src= img/p12.png>  
<img src= img/p13.png>  

## **SubBab 8.3.2**  

<img src= img/p21.png>  

## **SubBab 8.3.3**  

1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!  
```java
if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
            && data.saldo != 0) {
        System.out.println("Data yang dikeluarkan: " + data.norek + " " + data.nama + " "
                + data.alamat + " " + data.umur + " " + data.saldo);
        break;
    }
```  
**Ketika masuk ke case 2 dan data[front] mempunyai isi atau tidak sama dengan kosong, maka sistem akan mengprint data yang telah didequeue tersebut**

2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class 
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula 
daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear
dapat dipanggil!

**Modifikasi dari class Queue :**  
```java
public void peekRear() {
    if (!IsEmpty()) {
        System.out.println("Elemen terbelakang: " + data[rear].norek + " " + data[rear].nama + " "
                + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
    } else {
        System.out.println("Queue masih kosong");
    }
}
```
**Modifikasi dari class QueueMain :**  
```java
public static void menu() {
    System.out.println("Pilih Menu:");
    System.out.println("1. Antrian Baru");
    System.out.println("2. Antrian Keluar");
    System.out.println("3. Cek Antrian Terdepan");
    System.out.println("4. Cek Semua Antrian");
    System.out.println("5. Cek Antrian Paling Belakang");
    System.out.println("-------------------");
}
```
```java
        case 5:
            antri.peekRear();
            break;
    }

} while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
```
**ScreenShot hasil program**  
<img src= img/p22.png>  

## **SubBab 8.4**  

1. 

**Method peekPosition()**  
```java
public void peekPosition(int dataDicari) {
        int i = front;
        int posisi = 1;
        System.out.print("data " + dataDicari + " ada pada posisi : ");
        while(i != rear) {
            if (data[i]==dataDicari){
                System.out.print(posisi + " ");
            }
            i = (i+1) % max;
            posisi++;
        }
        if (data[i] == dataDicari){
            System.out.print(posisi + " ");
        }
        System.out.println();
    }
```
**Method peekAt()**  
```java
public void peekAt(int position) {
        int idxDicari = front;
        System.out.print("Data pada posisi " + position + " adalah : ");
        for (int i = 0 ; i < position - 1 ; i++){
            idxDicari = (idxDicari + 1) % max;
        }
        System.out.println(data[idxDicari] + " ");
    }
```
**ScreenShot Hasil Program**  
<img src= img/t11.png>  
<img src= img/t12.png>  
<img src= img/t13.png>  
<img src= img/t14.png>  
<img src= img/t15.png>  

2.

**Class Mahasiswa**  
```java
package pertemuan_10.tugas.no2;

public class Mahasiswa {
    String nim, nama;
    int absen;
    double ipk;

    Mahasiswa(String nim, String nama, int absen, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
    }

    Mahasiswa(){
        
    }
}
```

**Class Queue**  
```java
package pertemuan_10.tugas.no2;

public class Queue {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].nim + " " + data[front].nama + " "
                    + " " + data[front].absen + " " + data[front].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].nim + " " + data[i].nama + " "
                + " " + data[i].absen + " " + data[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println(data[i].nim + " " + data[i].nama + " "
            + " " + data[i].absen + " " + data[i].ipk);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Mahasiswa dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public Mahasiswa Dequeue() {
        Mahasiswa dt = new Mahasiswa();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen terbelakang: " + data[rear].nim + " " + data[rear].nama + " "
                    + " " + data[rear].absen + " " + data[rear].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String dataDicari) {
        int i = front;
        int posisi = 1;
        System.out.print("data " + dataDicari + " ada pada posisi : ");
        while(i != rear) {
            if (data[i].nim.equals(dataDicari)){
                System.out.print(posisi + " ");
            }
            i = (i+1) % max;
            posisi++;
        }
        if (data[i].nim.equals(dataDicari)){
            System.out.print(posisi + " ");
        }
        System.out.println();
    }

    public void peekAt(int position) {
        int idxDicari = front;
        System.out.print("Data pada posisi " + position + " adalah : ");
        for (int i = 0 ; i < position - 1 ; i++){
            idxDicari = (idxDicari + 1) % max;
        }

        System.out.println(data[idxDicari].nim + " " + data[idxDicari].nama + " "
        + " " + data[idxDicari].absen + " " + data[idxDicari].ipk);
    }
}

```

**Class QueueMain**
```java
package pertemuan_10.tugas.no2;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih Menu:");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian Mahasiswa");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("6. Cari Posisi Mahasiswa Berdasarkan NIM");
        System.out.println("7. Cari data Mahasiswa Berdasarkan Posisi");
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen: ");
                    int absen = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    Mahasiswa nb = new Mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Mahasiswa data = antri.Dequeue();
                    if (!"".equals(data.nim) && !"".equals(data.nama) && data.absen != 0
                            && data.ipk != 0) {
                        System.out.println("Data yang dikeluarkan: " + data.nim + " " + data.nama 
                                + " " + data.absen + " " + data.ipk);
                        break;
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang ingin dicari : ");
                    String dataDicari = sc.nextLine();
                    antri.peekPosition(dataDicari);
                    break;
                case 7:
                    System.out.print("Masukkan posisi Mahasiswa yang ingin dicari : ");
                    int posDicari = sc.nextInt();
                    antri.peekAt(posDicari);
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
```

**ScreenShot Hasil Program**
<img src= img/t21.png>  
<img src= img/t22.png>  
<img src= img/t23.png>  
<img src= img/t24.png>  
<img src= img/t25.png>  