//run as java -ea serejaD
import java.util.Scanner;

public class serejaD{
	public static void main(String[] args){
		int n,m,t,d,q1,q2;
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		assert(n>=1 && n<=100000) : "n must be 1 <= n <= 10^5";

		int[] a = new int[100001];

		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
			assert(a[i]>=1 && a[i]<=1000000) : "a["+i+"] must be 1 <= a[i] <= 10^6";
		}

		m = scan.nextInt();
		assert(m>=1 && m<=100000) : "m must be 1 <= m <= 10^5";

		while(m>0){
			t = scan.nextInt();
			d = scan.nextInt();

			assert(t>=a[0] && t<=1000000) : "t must be a[0] <= t <= 10^6";
			assert(d>=0 && d<=1000000) : "d must be 0 <= d <= 10^6";

			q1 = lowerBound(a,n-1,t);

			if(q1>=n || a[q1]>t){
				q1--;
			}

			while(q1>0 && a[q1-1]+d>=a[q1]){
				q2 = lowerBound(a,q1-1,a[q1]-d);
				q1 = q2;
			}

			System.out.println(q1+1);

			m--;
		}
	}

	public static int lowerBound(int[] a,int high,int t){
		int l = 0;
		int mid;

		while(high>=l){
			mid = (l+high)/2;

			if(a[mid]>=t){
				high = mid-1;
			}else{
				l = mid+1;
			}
		}

		return l;
	}
}