import java.util.Scanner ;
public class MainPangkat{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in) ;

		System.out.println("=================================================") ;
		System.out.print("Masukkan Jumlah Elemen yang ingin Dihitung : ") ;
		int elemen = sc.nextInt() ;

		Pangkat [] png = new Pangkat[elemen] ;

		for (int i = 0; i < elemen; i++) {
			System.out.print("Masukkan Nilai ke-" + (i+1) + " : ") ;
			int n = sc.nextInt() ;
			System.out.print("Masukkan Pangkat ke-" + (i+1) + " : ") ;
			int p = sc.nextInt() ;
			png[i] = new Pangkat (n, p) ;
		}
		System.out.println("==============Menu Pemilihan Metode==============") ;
		System.out.println("1. Brute Force\n2. Devide and Conquer") ;
		System.out.print("Pilih Opsi (1 atau 2): ") ;
		int opsi = sc.nextInt() ;
		if (opsi == 1) {
			System.out.println("=================================================") ;
			System.out.println("Hasil Pangkat dengan Brute Force") ;
			for (int i = 0; i < elemen; i++) {
			System.out.println("Pangkat dari Nilai " + png[i].nilai + " Pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat)) ;
			}
		} else if (opsi == 2) {
			System.out.println("=================================================") ;
			System.out.println("Hasil Pangkat dengan Devide dan Conquer") ;
			for (int i = 0; i < elemen; i++) {
			System.out.println("Pangkat dari Nilai " + png[i].nilai + " Pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat)) ;
			}
		} else {
			System.out.println("------------=Opsi Tidak Dikenali=------------") ;
		}
		System.out.println("=================================================") ;
	}
}