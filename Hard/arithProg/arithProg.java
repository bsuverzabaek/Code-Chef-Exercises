//run as java -ea arithProg
import java.util.Scanner;

public class arithProg{
	public static void main(String[] args){
		int N,val,ans,mRange;
		Scanner scan = new Scanner(System.in);

		int[] count = new int[30003];
		int[] dist = new int[30003];

		for(int i=0;i<30003;i++){
			count[i] = 0;
			dist[i] = 0;
		}

		N = scan.nextInt();
		assert(N>=3 && N<=100000) : "N must be 3 <= N <= 30000";

		ans = 0;

		for(int i=0;i<N;i++){
			val = scan.nextInt();
			assert(val>=1 && val<=30000) : "A["+i+"] must be 1 <= A[i] <= 30000";

			count[val]++;
			ans += dist[val];

			if(val<15001){
				mRange = val;
			}else{
				mRange = 30002-val;
			}

			for(int j=1;j<=mRange;j++){
				dist[val+j] += count[val-j];
				dist[val-j] += count[val+j];
			}
		}

		for(int i=0;i<30003;i++){
			ans += (count[i]*(count[i]-1)*(count[i]-2))/6;
		}

		System.out.println(ans);
	}
}