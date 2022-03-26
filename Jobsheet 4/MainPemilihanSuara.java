import java.util.Scanner;
class PemilihanSuara {
	int pemilih; 
	String[] pilihan;
	String[] kandidat = {
		"Haris","Dian","Bisma","Rani"
	};
	String m = "-";
	int[] nsuara = new int[kandidat.length];

	PemilihanSuara(int np) {
		pemilih = np;
		pilihan = new String[pemilih];
	}

	void showKandidat() {
		System.out.println("===KANDIDAT===");
		for (int i = 0; i <kandidat.length ; i++) {
			System.out.println((i+1)+". "+kandidat[i]);
		}
	}

	String pemenang(String[] arr, int f, int l) {
		//Base case DC
		if (f == l) { 

			// Block Conquer
			if (arr[f].equalsIgnoreCase(kandidat[0])) {
				nsuara[0] += 1;
			}else if (arr[f].equalsIgnoreCase(kandidat[1])) {
				nsuara[1] += 1;
			}else if (arr[f].equalsIgnoreCase(kandidat[2])) {
				nsuara[2] += 1; 
			}else if (arr[f].equalsIgnoreCase(kandidat[3])) {
				nsuara[3] += 1;
			}
		} else { 
			
			// Divide
			int mid = (f + l) / 2; 
			pemenang(arr, f, mid);
			pemenang(arr, mid+1, l);

			// Block Combine
			if (nsuara[0] > (arr.length/2)) {
				m = kandidat[0];
			} if (nsuara[1] > arr.length/2) {
				m = kandidat[1]; 
			} if (nsuara[2] > arr.length/2) {
				m = kandidat[2];
			} if (nsuara[3] > arr.length/2) {
				m = kandidat[3];
			}
		}
		return m;
	}
}

public class MainPemilihanSuara {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PemilihanSuara p = new PemilihanSuara(8);

		p.showKandidat();
		System.out.println("Masukkan nama pilihan anda!! ");
		for (int i = 0; i < p.pemilih; i++) {
			System.out.print("pemilih " + (i + 1) + " : ");
			p.pilihan[i] = sc.nextLine();
		}
		String menang = p.pemenang(p.pilihan, 0,7);
		System.out.println("Ketua BEM terpilih tahun 2022 adalah : " + menang);
	}
}