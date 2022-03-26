import java.util.Scanner ;
public class MainSum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in) ;
		System.out.println("=============================================================") ;
		System.out.print("Masukkan Jumlah Perusahaan  : ") ;
		int prs = sc.nextInt() ;
		Sum [] sm = new Sum[prs] ;
		for (int a = 0; a < prs; a++) {
			System.out.println("=============================================================") ;
			System.out.println("Program Hitung Keuntungan Total (Satuan Juta. Misal 5.9)") ;
			System.out.println("Total Keuntungan Perusahaan ke-" + (a+1)) ;
			System.out.print("Masukkan Jumlah Bulan : ") ;
			int elm = sc.nextInt() ;

			sm[a] = new Sum(elm) ;
			System.out.println("=============================================================") ;
			for (int i = 0; i < sm[a].elemen; i++) {
				System.out.print("Masukkan Untung Bulan ke-" + (i+1) + " : ") ;
				sm[a].keuntungan[i] = sc.nextDouble() ;
			}
			System.out.println("=============================================================") ;
			System.out.println("Algoritma Brute Force") ;
			System.out.println("Total Keuntungan Perusahaan Selama " + sm[a].elemen + " bulan adalah : " + (float)sm[a].totalBF(sm[a].keuntungan)) ;
			System.out.println("=============================================================") ;
			System.out.println("Algoritma Devide Conquer") ;
			System.out.println("Total Keuntungan Perusahaan Selama " + sm[a].elemen + " bulan adalah : " + (float)sm[a].totalDC(sm[a].keuntungan, 0, sm[a].elemen-1)) ;
		}
	}
}