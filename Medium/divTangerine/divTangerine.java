//run as java -ea divTangerine
import java.util.Scanner;

public class divTangerine{
	public static void main(String[] args){
		int T,n,k,p,i,j,in;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			n = scan.nextInt();
			k = scan.nextInt();
			p = scan.nextInt();

			assert(n>=1 && n<=50000000) : "n must be 1 <= n <= 5*10^7";
			assert(k>=1 && k<=min(500,n)) : "k must be 1 <= k <= min(500,n)";
			assert(p>=1 && p<=min(500,n)) : "p must be 1 <= p <= min(500,n)";

			int[] a = new int[500];
			int[] b = new int[500];

			for(i=0;i<k;i++){
				in = scan.nextInt();
				assert(in>=1 && in<=n) : "l["+i+"] must be 1 <= l[i] <= n";

				a[i] = in;

				in = scan.nextInt();
				assert(in>=1 && in<=n) : "r["+i+"] must be 1 <= r[i] <= n";
			}

			for(i=0;i<p;i++){
				in = scan.nextInt();
				assert(in>=1 && in<=n) : "a["+i+"] must be 1 <= a[i] <= n";

				b[i] = in;

				in = scan.nextInt();
				assert(in>=1 && in<=n) : "b["+i+"] must be 1 <= b[i] <= n";
			}

			for(i=0;i<p;i++){
				for(j=0;j<k;j++){
					if(b[i]==a[j]){
						break;
					}
				}

				if(j==k){
					System.out.println("No");
					break;
				}
			}

			if(i==p){
				System.out.println("Yes");
			}

			T--;
		}
	}

	public static int min(int a,int b){
		if(a<b){
			return a;
		}else{
			return b;
		}
	}
}