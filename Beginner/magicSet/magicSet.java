//run as java -ea magicSet
import java.util.Scanner;
import java.lang.Math;

public class magicSet{
	public static void main(String[] args){
		int T,m,n,count;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			n = scan.nextInt();
			m = scan.nextInt();

			assert(n>=1 && n<=30) : "n must be 1 <= n <= 30";
			assert(m>=1 && m<=1000) : "m ust be 1 <= m <= 1000";

			int[] a = new int[n];
			count = 0;

			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
				assert(a[i]>=1 && a[i]<=1000) : "a["+i+"] must be 1 <= a[i] <= 1000";

				if(a[i]%m==0){
					count++;
				}
			}

			System.out.println((int)Math.pow(2,count)-1);

			T--;
		}
	}
}