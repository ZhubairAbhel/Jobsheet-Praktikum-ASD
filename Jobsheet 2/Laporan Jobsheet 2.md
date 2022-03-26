# Laporan Praktikum Algoritman dan Struktur Data
author : Zhubair Abhel (TI-1G) 2141720248
## Jawaban Pertanyaan

### 2.2 Deklarasi Class, Atribut, dan Method
1. Karakteristik Kelas atau Objek ada 2 yaitu

a. Kelas/objek adalah sebuah Gambaran umum dari sebuah objek. Sehingga kelas/objek akan kita jadikan dalam realisasi sebuah objek yang nyata.
    b. Setiap kelas memiliki suatu atribut dan method.

2. Kata kunci apakah yang digunakan untuk mendeklarasikan class ?

    kata kunci new adalah kata kunci yang akan kita gunakan untuk instansiasi dari sebuah class/objek.
3. Perhatikan class *Barang* yang ada di Praktikum di atas, ada beberapa atribut yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja deklarasi atribut dilakukan?
    
    Atribut:
        
        1. Nama Barang : String ->  baris 13.
        2. Jenis Barang : String ->  baris 13.
        3. Stok : int ->  baris 14.
        4. Harga Satuan : int ->  baris 14.
4. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan! Dan pada baris berapa saja 
deklarasi method dilakukan?

        1. tampilBarang() ->  baris 16.
        2. tambahStok() ->  baris 23.
        3. kurangiStok() ->  baris 27.
        4. hitungHargaTotal() ->  baris 31.
5. Perhatikan method kurangiStok() yang ada di class Barang, modifikasi isi method tersebut 
sehingga proses pengurangan hanya dilakukan jika stok masih ada (masih lebih besar dari 0) 

code : 

java
kurangiStock(int n){

if(this.stok >0){
      this.stok = this.stok -n; 
}else {
    System.out.println("Status kurangi stok : Gagal")
    }
}

6. Menurut Anda, mengapa method *tambahStok()* dibuat dengan memiliki 1 parameter berupa 
bilangan int?

Karena, ketika kita ingin mengurangi stok maka kita membutuhkan suatu parameter berupa int yang akan kita gunakan sebagai bilangan untuk mengurangi jumlah stok barang

7. Menurut Anda, mengapa method *hitungHargaTotal()*memiliki tipe data int?

Karena membutuhkan nilai balik atau keluaran

8. Menurut Anda, mengapa method *tambahStok()* memiliki tipe data void?

Karena tidak membutuhkan nilai keluaran

## **SubBab 2.3**

1. Pada class BarangMain, pada baris berapakah proses instansiasi dilakukan? Dan apa nama objek
yang dihasilkan?  

    **instansiasi dilakukan terdapat pada baris 15, nama objeknya yaitu b1**  

2. Bagaimana cara mengakses atribut dan method dari suatu objek?
     
     **Dengan mengetikkan nama objek yang telah di instansiasi lalu ketikan atribut atau method.**  
     **Contoh: b1.stock, b1.tampilBarang()**

     ## **SubBab 2.4**  

1. Perhatikan class Barang yang ada di Praktikum 2.4.1, pada baris berapakah deklarasi 
konstruktor berparameter dilakukan?  

    **baris 18**  

2. Perhatikan class BarangMain di Praktikum 2.4.1, apa sebenarnya yang dilakukan pada baris 
program dibawah ini?  

    **Instansiasi konstruktor berparameter dengan nama objek baru yaitu b2**  

3. Coba buat objek dengan nama b3 dengan menggunakan konstruktor berparameter dari class 
Barang.  
    Barang b3 = new Barang("Botol Kecap", "Bumbu Masakan", 3, 12000);