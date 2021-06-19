//run as java -ea chefGift
import java.util.Scanner;

public class chefGift{
	public static void main(String[] args){
		int T,n,k,even;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			n = scan.nextInt();
			k = scan.nextInt();

			assert(n>=1 && n<=50) : "n must be 1 <= n <= 50";
			assert(k>=0 && k<=n) : "k must be 0 <= k <= n";

			int[] a = new int[n];
			even = 0;

			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
				assert(a[i]>=1 && a[i]<=100) : "a["+i+"] must be 1 <= a[i] <= 100";

				if(a[i]%2==0){
					even++;
				}
			}

			if(even==n && k==0){
				System.out.println("NO");
			}else if(even>=k){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			T--;
		}
	}
}