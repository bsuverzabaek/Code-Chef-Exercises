//run as java -ea totalDiamonds
import java.util.Scanner;

public class totalDiamonds{
	public static void main(String[] args){
		int T,start,end,N;
		long prev;

		long[] pre = new long[2000003];
		long[] num = new long[1000003];

		Scanner scan = new Scanner(System.in);

		for(int i=0;i<=2000001;i++){
			pre[i] = diamond(i);
		}

		num[1] = 2;
		prev = num[1];
		start = 2;
		end = 2;

		for(int i=2;i<=1000001;i++){
			prev = prev-pre[start]+pre[end+1];
			num[i] = num[i-1]+2*prev+pre[end+2];
			prev = prev+pre[end+2];
			start++;
			end += 2;
		}

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=1000000) : "N must be 1 <= N <= 10^6";
			System.out.println(num[N]);


			T--;
		}
	}

	public static long diamond(long sum){
		long rem,evenSum,oddSum,ans;

		evenSum = 0;
		oddSum = 0;

		while(sum!=0){
			rem = sum%10;
			sum /= 10;

			if(rem%2==0){
				evenSum += rem;
			}else{
				oddSum += rem;
			}
		}

		if(evenSum-oddSum>=0){
			ans = evenSum-oddSum;
		}else{
			ans = oddSum-evenSum;
		}

		return ans;
	}
}