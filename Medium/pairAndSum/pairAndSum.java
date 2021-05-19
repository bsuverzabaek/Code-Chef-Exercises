//run as java -ea pairAndSum
import java.util.Scanner;

public class pairAndSum{
	public static void main(String[] args){
		int N,x;
		long r,m;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		assert(N<=100000) : "N must be <= 10^5";

		int[] bitCounts = new int[32];

		for(int i=0;i<32;i++){
			bitCounts[i] = 0;
		}

		for(int i=0;i<N;i++){
			x = scan.nextInt();
			assert(x<=1000000000) : "A["+i+"] must be <= 10^9";

			for(int j=0;j<32;j++){
				if((x&1)!=0){
					bitCounts[j]++;
				}
				x >>= 1;
			}
		}

		r = 0;
		m = 0;

		for(int i=0;i<32;i++){
			r += choose2(bitCounts[i])<<m;
			m++;
		}

		System.out.println(r);
	}

	public static long choose2(int n){
		long r;
		r = (long) n;
		return (r*(r-1))>>1;
	}
}