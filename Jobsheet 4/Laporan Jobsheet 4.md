# Laporan Praktikum Pertemuan 5

Nama  : Zhubair Abhel Frisky M.Z
Kelas : TI-1G / 30
NIM   : 2141720248

## Jawaban Pertanyaan dari Jobsheet 5

### Subbab 4.2.3

1. Jelaskan mengenai base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial!
		if (n == 1) {
			return 1;
		}
	~ Kode tersebut menjelaskan bahwa ketika program mencapai baris tersebut, maka  program akan mereturnkan nilai 1, sehingga pemanggilan fungsi (rekursif call  dengan parameter yang n-1) akan meghasilkan sebuah return nilai

2. Pada implementasi Algoritma Divide and Conquer Faktorial apakah lengkap terdiri dari 3 tahapan divide, conquer, combine? Jelaskan masing-masing bagiannya pada kode program!
	~ Iya tentu, contohnya kaya di program :
	Divide = faktorialDC(n-1) pengurangan pada nilai n. 
	Conquer = n*.faktorialDC(n-1) penyelesaian dengan rekursif. 
	Combine = n*faktorialDC(n-1) pengombinasian dengan perkalian.

3. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for? Buktikan!
	~ Memungkinkan , perulangan pada method faktorialBF() dirubah selain menggunakan for dapat juga di rubah menjadi perulangan jenis while maupun do while. Contohnya pada baris kode di bawah ini : 
	public int faktorialBF(int n) {
		int fakto = 1;
		for (int i = 1; i <= n; i++) {
			fakto *= i;
		}
		return fakto;
	}

4. Tambahkan pegecekan waktu eksekusi kedua jenis method tersebut!
	import java.awt.desktop.SystemEventListener;
	import java.util.Scanner;
	class Faktorial {
		public int nilai;
		public int faktorialBF(int n) {
			int fakto = 1;
			for (int i = 1; i <=n ; i++) {
			fakto = fakto *i;
			}
			return fakto;
		}

		public int faktorialDC(int n) {
			if (n==1){
			return 1;
			} else {
			return n*faktorialDC(n-1);
			}
		}
	}

	public class MainFaktorial {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			long ms,mst;
			System.out.println("=======================================");
			System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
			int elemen = sc.nextInt();

			Faktorial[] fk = new Faktorial[elemen];
			for (int i = 0; i < elemen; i++) { 
				fk[i] = new Faktorial();
				fk[i].nilai = (1+i);
			}

			System.out.println("=======================================");
			System.out.println("Hasil Faktrial dengan Brute Force");
			ms = System.currentTimeMillis();
			for (int i = 0; i < elemen; i++) {
				System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah "+fk[i].faktorialBF(fk[i].nilai));
			}
			mst = System.currentTimeMillis();
			System.out.printf("waktu yang diperlukan %d milidetik\n",mst-ms);

			System.out.println("=======================================");
			System.out.println("Hasil Faktrial dengan Divide and Conquer");
			ms = System.currentTimeMillis();
			for (int i = 0; i < elemen; i++) {
				System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah "+fk[i].faktorialDC(fk[i].nilai));
			}
			mst = System.currentTimeMillis();
			System.out.printf("waktu yang diperlukan %d milidetik\n",mst-ms); 
			System.out.println("=======================================");
		}
	}

5. Buktikan dengan inputan elemen yang di atas 20 angka, apakah ada perbedaan waktu eksekusi?
	~ Ada perbedaan waktu saat eksekusi, tetapi Beberapa hasil faktorial tidak tepat karena melebihi batas dari integer.


### Subbab 4.3.3

1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
	~ PangkatBF() merupakan fungsi brute force yang digunakan untuk menghitung hasil pemangkatan bilangan a oleh n, dengan logika, hasil akan = 1 jika pangkat 0 (tidak masuk looping), jika pagkat > 0 maka hasil akan didefinisikan menjadi hasil * a sebanyak n (pangkat), kemudian direturnkan hasil akhirnya. Sedangkan untuk  PangkatDC()  merupakan fungsi divide and conquer yang berfungsi sama, melainkan logikannya adalah ketika pangkat = 0, maka akan direturnkan 1, jika bukan maka dicek , apakah pangkat ganjil / genap. Jika ganjil maka penghitungan dipecah menjadi  pangkatDC(a,n/2)*pangkatDC(a,n/2)*a. jika pangkat genap, maka penghitungan dipecah menjadi pangkatDC(a,n/2)*pangkatDC(a,n/2) lalu direturnkan hasil akhirnya

2. Pada method PangkatDC() terdapat potongan program sebagai berikut:
	//Bilangan ganjil
	if (n % 2 == 1) {
		return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * 2);
	//Bilangan genap
	} else {
		return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
	}
	Jelaskan arti potongan kode tersebut
	~  Jika pangkat ganjil maka penghitungan dipecah dengan recursif call menjadi pangkatDC(a,n/2)*pangkatDC(a,n/2)*a. Jika pangkat genap, maka  penghitungan dipecah menjadi  pangkatDC(a,n/2)*pangkatDC(a,n/2)  lalu direturnkan hasil akhirnya.

3. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
	~ ya, tahap combine ditunjukkan  ketika program telah mendapatkan hasil return-an dari  masing-masing proses recursif callnya, kemudian hasil tersebut dioperasikan (dikalikan antara satu dengan yang lain)

4. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor.
	import java.util.Scanner;
	class Pangkat {
		public int nilai,pangkat;
		Pangkat(int a, int n){
			nilai = a;
			pangkat = n;
		}
		public int pangkatBF(int a, int n){ 
			int hasil = 1;
			for (int i = 0; i < n ; i++) {
				hasil = hasil * a;
			}
			return hasil;
		}
		public int pangkatDC(int a, int n){
		if (n==0){
			return 1;
		} else {
			if (n%2==1){
				return pangkatDC(a,n/2)*pangkatDC(a,n/2)*a;
			} else {
				return pangkatDC(a,n/2)*pangkatDC(a,n/2);
			}
		}
	}

	public class MainPangkat {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a,n;
			System.out.println("=======================================");
			System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
			int elemen = sc.nextInt();
			Pangkat[] png = new Pangkat[elemen];
			for (int i = 0; i <elemen ; i++) { 
				System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
				a=sc.nextInt();
				System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
				n=sc.nextInt();
				png[i] = new Pangkat(a,n);
			}
			System.out.println("=======================================");
			System.out.println("Hasil Pangkat dengan Brute Force");
			for (int i = 0; i < elemen; i++) {
				System.out.println("Hasil "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
			}
			System.out.println("=======================================");
			System.out.println("Hasil Pangkat dengan Divide and Conquer");
			for (int i = 0; i < elemen; i++) {
				System.out.println("Hasil "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
			}
			System.out.println("=======================================");
		}
	}

5. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan! 
	import java.util.Scanner;
	class Pangkat {
		public int nilai,pangkat;
		Pangkat(int a, int n){
			nilai = a;
			pangkat = n;
		}
		public int pangkatBF(int a, int n){
			int hasil = 1; 
			for (int i = 0; i < n ; i++) {
				hasil = hasil * a;
			}
			return hasil;
		}
		public int pangkatDC(int a, int n){
		if (n==0){
			return 1;
		} else {
			if (n%2==1){
				return pangkatDC(a,n/2)*pangkatDC(a,n/2)*a;
			} else {
				return pangkatDC(a,n/2)*pangkatDC(a,n/2);
			}
		}
	}

	public class MainPangkat {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a,n;
			System.out.println("=======================================");
			System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
			int elemen = sc.nextInt();
			Pangkat[] png = new Pangkat[elemen];

			for (int i = 0; i <elemen ; i++) {
				System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : "); 
				a=sc.nextInt();
				System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
				n=sc.nextInt();
				png[i] = new Pangkat(a,n);
			}
			System.out.println("=== METODE ===");
			System.out.println("1. Brute Force");
			System.out.println("2. Divide and Conquer");
			System.out.print("Pilih Metode (1/2) : ");
			int metode = sc.nextInt();

			switch (metode) {
			case 1 -> {
				System.out.println("=======================================");
				System.out.println("Hasil Pangkat dengan Brute Force");
				for (int i = 0; i < elemen; i++) {
					System.out.println("Hasil " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
				}
			}
			case 2 -> {
			System.out.println("=======================================");
			System.out.println("Hasil Pangkat dengan Divide and Conquer");
			for (int i = 0; i < elemen; i++) { 
				System.out.println("Hasil " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
			}
			System.out.println("=======================================");
			}
			default  -> System.out.println("masukkan metode salah!");
			}
		}
	}

### Subbab 4.4.3 

1. Berikan ilustrasi perbedaan perhitungan keuntungan dengan method TotalBF() ataupun TotalDC() 
	misal isi arr[] = (5,6,7)
	double totalBF(double[] arr) :   step 1 : total = 0 + 5
	step 2 : total = 5 + 6
	step 3 : total = 11 + 7
	step 4 : return 18
	double totalDC(double[] arr,0,3-1) :
	step 1 : deret array dibagi menjadi 2 bagian yaitu left side indeks ke [0], mid [1], 
	right side[2]
	step 2 : lalu total kiri,  lsum = totalDC(arr,0,0),  angka didalam parameter adalah 
	indeks, maka direturnkan nilai 5
	step 3 : lalu total kanan, rsum = totalDC(arr,2,2),  angka didalam parameter adalah 
	indeks,  maka direturnkan nilai 7
	step 4 : dijumlahkan totalnya return lsum+rsum+arr[mid] = 5 + 7 + 6 = 18

2. Perhatikan output dari kedua jenis algoritma tersebut bisa jadi memiliki hasil berbeda di belakang koma. Bagaimana membatasi output di belakang koma agar menjadi standar untuk kedua jenis algoritma tersebut. 
	~ dengan menggunakan printf, ketika menampilkan hasilnya.
	System.out.println("Algoritma Brute Force");
	System.out.printf("Total keuntungan perusahaan selama %d bulan adalah 
	= %.2f\n",sm[i].elemen,sm[i].totalBF(sm[i].keuntungan));
	System.out.println("\nAlgoritma Divide Conquer");
	System.out.printf("Total keuntungan perusahaan selama %d bulan adalah 
	= %.2f\n",sm[i].elemen,sm[i].totalDC(sm[i].keuntungan,0, sm[i].elemen-1));

3. Mengapa terdapat formulasi return value berikut? Jelaskan! return lsum + rsum + arr[mid]; 
	~  untuk menjumlahkan hasil dari left side sum + right side sum + middle value, sehingga didapatkan total keuntungan dari bulan pertama sampai terakhir.

4. Kenapa dibutuhkan variable mid pada method TotalDC()? 
	~ untuk membagi permasalahan menjadi 2 bagian  yaitu kiri dan kanan  (3 termasuk mid valunya) , lalu recursif call dari lsum (diakhiri sampai mid-1), dan rsum (diawali dari mid+1) sehingga mid value belum diikutkan dalam perhitungan, maka return terakhir lsum+rsum+arr[mid].

5. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan dengan program! 
	import java.util.Scanner;
	class Sum {
		public int elemen;
		public double[] keuntungan;
		public double total;
		Sum(int elemen){
			this.elemen = elemen;
			keuntungan = new double[elemen];
			this.total=0;
		}

		double totalBF(double[] arr){
			for (int i = 0; i < elemen ; i++) {
				total = total + arr[i];
			}
			return total;
		}

		double totalDC(double[] arr,int l,int r){ 
			if (l==r){
				return arr[l];
			} else if (l<r){
				int mid = (l+r)/2;
				double lsum = totalDC(arr,l,mid-1);
				double rsum = totalDC(arr,mid+1,r);
				return lsum+rsum+arr[mid];
			}
			return 0;
		}
	}

	public class MainSum {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("=============================================");
			System.out.println("Program menghitung keuntungan Total (Satuan Juta. Misal 5.9)");
			System.out.print("Masukkan jumlah perusahaan : ");
			int np = sc.nextInt();
			Sum[] sm = new Sum[np];

			for (int i = 0; i < np; i++) {
				System.out.println("PERUSAHAAN "+(i+1));
				System.out.print("masukkan jumlah bulan : ");
				int elemen = sc.nextInt();
				sm[i] = new Sum(elemen);
				for (int j = 0; j < sm[i].elemen ; j++) {
					System.out.print("Masukkan untung 
					bulan ke-"+(j+1)+" = ");
					sm[i].keuntungan[j]= sc.nextDouble(); 
				}
			System.out.println("=============================================");
			}

			for (int i = 0; i < np; i++) {
				System.out.println("=============================================");
				System.out.println("\nPERUSAHAAN "+(i+1));
				System.out.println("=============================================");
				System.out.println("Algoritma Brute Force");
				System.out.printf("Total keuntungan perusahaan selama %d bulan adalah = %.2f\n",sm[i].elemen,sm[i].totalBF(sm[i].keuntungan));
				System.out.println("\nAlgoritma Divide Conquer");
				System.out.printf("Total keuntungan perusahaan selama %d bulan adalah = %.2f\n",sm[i].elemen,sm[i].totalDC(sm[i].keuntungan,0 , sm[i].elemen-1));
			}
		}
	}
		

