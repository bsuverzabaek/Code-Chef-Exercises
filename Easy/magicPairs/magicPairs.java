//run as java -ea magicPairs
import java.util.Scanner;

public class magicPairs{
	public static void main(String[] args){
		int T,n,d;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=4) : "T must be 1 <= T <= 4";

		while(T>0){
			n = scan.nextInt();
			assert(n>=1 && n<=100000) : "n must be 1 <= n <= 100000";

			int[] a = new int[n];

			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
				assert(a[i]>=0 && a[i]<=1000000000) : "a["+i+"] must be 0 <= a[i] <= 10^9";
			}

			d = (((n-1)*n)/2);
			System.out.println(d);

			T--;
		}
	}
}