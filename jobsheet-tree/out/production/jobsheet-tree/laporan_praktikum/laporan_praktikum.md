# Laporan Praktikum Pertemuan 13 Tree
## Nama  : Zhubair Abhel Frisky M.Z
## Nim   : 2141720248
## Kelas : TI-1G
## Absen : 30

## **Praktikum 1**
**2.1.2 Pertanyaan**
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif
   dilakukan dibanding binary tree biasa?
   
2. **Karena dalam binary search tree terdapat beberapa aturan yang menjadikan data dari sebuah tree lebih terstruktur, misalnya seperti aturan bahwa semua *left-child* harus lebih
   kecil dari pada *right-child* dan *parent-nya* sehingga itu akan memudahkan kita dalam melakukan traversal, sedangkan pada tree biasa kita akan lebih lama dalam melakukan traversal untuk mencari
   data yang akan di cari.**
3. Untuk apakah di class Node, kegunaan dari atribut left dan right?
4. 
   **atribut right dan left merupakan sebuah implementasi untuk menyimpan data child oleh suatu parent. misal kita memiliki sebuah node parent maka kita ingin
   parent memiliki child right maka disitulah atribut right kita gunakan untuk menyimpan data dari child.** 
5. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?

   **atribut *root* berfungsi sebagai Node utama yang tidak boleh memiliki parent, sehingga sebuah root hanya memiliki child**
   b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?

   **ketika objek tree pertama kali dibuat maka root nya akan bernilai null, kita baru mengisi root ketika memanggil fungsi add() yang pertama**
6. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa
   yang akan terjadi? 
   **data  baru itu akan menjadi *root*, karena pada hakikatnnya data pertama adalah parent dari semua *child* atau *node***
7. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah
   ini. Jelaskan secara detil untuk apa baris program tersebut?

   if(data<current.data){
   if(current.left!=null){
   current = current.left;
   }else{
   current.left = new Node(data);
   break;
   }

   **Program diatas bermaksud untuk menambahkan data, akan tetapi ketika data itu kurang dari node yang sekarang
   maka data akan ditambahkan pada *left-child* akan tetapi sebelum ditambahkan kita lakukan pengecekan terlebih dahulu
   apakah *left-child*nya bernilai null atau tidak, jika null maka akan dilakukan pengecekan mulai dari awal lagi
   jika *tidak-null* maka baru ditambahkan**

## **Praktikum 2**
**Pertanyaan Percobaan 2**
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class
   BinaryTreeArray?
   ** int array data digunakan untuk menyimpan sebuah data tree , sedangakan idx-last
2. Apakah kegunaan dari method populateData()?
3. Apakah kegunaan dari method traverseInOrder()?Algoritma dan Struktur Data 2021-2022
   Tim Ajar Algoritma dan Struktur Data 2021-2022
   Jurusan Teknologi Informasi-Politeknik Negeri Malang
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks
   berapakah posisi left child dan rigth child masin-masing?
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor
   4?





