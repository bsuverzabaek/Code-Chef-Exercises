//run as java -ea chefChick
import java.util.Scanner;

public class chefChick{
	public static void main(String[] args){
		int T,N,min;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";

			int[] a = new int[N];
			min = 100001;

			for(int i=0;i<N;i++){
				a[i] = scan.nextInt();
				assert(a[i]>=1 && a[i]<=100000) : "a["+i+"] must be 1 <= a[i] <= 10^5";

				if(min>a[i]){
					min = a[i];
				}
			}

			System.out.println(min);

			T--;
		}
	}
}