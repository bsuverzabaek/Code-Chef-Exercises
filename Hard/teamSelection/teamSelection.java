//run as java -ea teamSelection
import java.util.Scanner;
import java.lang.Math;

public class teamSelection{
	public static void main(String[] args){
		int T,N,curSum,ans,bestDiff;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";

			ans = 0;
			curSum = 0;

			int[] ele = new int[N];
			int[] sum = new int[450002];

			for(int i=0;i<N;i++){
				ele[i] = scan.nextInt();
				assert(ele[i]>=1 && ele[i]<=450) : "Each skill point must be 1 <= s <= 450";

				curSum += ele[i];

				if((i&1)!=0){
					ans += ele[i];
				}
			}

			for(int i=0;i<=curSum;i++){
				sum[i] = 0;
			}

			sum[0] = 1;
			curSum = 0;

			for(int i=0;i<N;i++){
				for(int j=curSum+ele[i];j>=ele[i];j--){
					sum[j] |= (sum[j-ele[i]]<<1);
				}

				curSum += ele[i];
			}

			bestDiff = Math.abs(curSum-2*ans);

			for(int i=0;i<=curSum;i++){
				if((sum[i]&(1<<(N/2)))!=0 || (sum[i]&(1<<(N-N/2)))!=0){
					if(bestDiff>Math.abs(curSum-2*i)){
						ans = i;
						bestDiff = Math.abs(curSum-2*i);
					}
				}
			}

			if(ans>curSum-ans){
				ans = curSum-ans;
			}

			System.out.println(ans + " " + (curSum-ans));

			T--;
		}
	}
}