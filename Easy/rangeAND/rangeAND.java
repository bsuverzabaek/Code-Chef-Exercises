//run as java -ea rangeAND
import java.util.Scanner;

public class rangeAND{
	public static void main(String[] args){
		int T,mod;
		long L,R,count,count2,count3,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		mod = 1000000007;

		while(T>0){
			L = scan.nextLong();
			R = scan.nextLong();

			assert(L>=1 && L<=R) : "L must be 1 <= L <= R";
			assert(R<=1000000000000000000L) : "R must be L <= R <= 10^18";

			count = 0;
			count2 = 0;
			count3 = 0;
			ans = 0;

			for(int i=0;i<60;i++){
				count = min(R-L+1,count3-count2+1)%mod;

				if((L & ((long)1<<i))!=0){
					ans += (count*(((long)1<<i)%mod)%mod)%mod;
					count2 += ((long)1<<i);
				}

				count3 += ((long)1<<i);
			}

			System.out.println(ans);

			T--;
		}
	}

	public static long min(long a,long b){
		if(a<b){
			return a;
		}else{
			return b;
		}
	}
}