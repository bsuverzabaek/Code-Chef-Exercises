//run as java -ea chefNumbers
import java.util.Scanner;

public class chefNumbers{
	public static void main(String[] args){
		int N,low,high,ans,x,m;
		Scanner scan = new Scanner(System.in);

		int[] a = new int[100001];

		N = scan.nextInt();
		assert(N>=1 && N<=100000) : "N must be 1 <= N <= 100000";

		ans = 0;

		for(int i=0;i<N;i++){
			low = 0;
			high = ans-1;

			x = scan.nextInt();
			assert(x>=1 && x<=100000) : "A["+i+"] must be 1 <= A[i] <= 100000";

			while(low<=high){
				m = (low+high)/2;

				if(a[m]<=x){
					high = m-1;
				}else{
					low = m+1;
				}
			}

			a[low] = x;
			ans = max(ans,low+1);
		}

		System.out.println(ans);
	}

	public static int max(int a,int b){
		return (a>b)?a:b;
	}
}