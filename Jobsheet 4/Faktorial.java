import java.util.* ;
public class Faktorial {
	public int nilai ;
	public int ind = nilai ;

	public int faktorialBF(int n) {
		long start= System.currentTimeMillis();
		int fakto = 1;
		for (int i = 1; i <= n; i++) {
			fakto = fakto * i ;
		}
		long end=System.currentTimeMillis() ;
		long exc = end - start ;
		System.out.println("Waktu Eksekusi : " + exc + " ms");
		return fakto ;
	}
	public int faktorialDC(int n) {
		long start= System.currentTimeMillis();
		int fakto ;
		if (n == 1) {
			return 1;
		} else {
			fakto = n * faktorialDC(n-1) ;
		}
		long end=System.currentTimeMillis() ;
		long exc = end - start ;
		System.out.println("Waktu Eksekusi : " + exc + " ms");
		return fakto ;
	}
}