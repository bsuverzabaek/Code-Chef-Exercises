//run as java -ea chefShop
import java.util.Scanner;

public class chefShop{
	public static void main(String[] args){
		int T,N,K,ans,c,w,p,q,l;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=250) : "T must be 1 <= T <= 250";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();

			assert(N>=1 && N<=10) : "N must be 1 <= N <= 10";
			assert(K>=1 && K<=100000000) : "K must be 1 <= K <= 100000000";

			int[] cost = new int[N];
			int[] weight = new int[N];

			for(int i=0;i<N;i++){
				cost[i] = scan.nextInt();
				weight[i] = scan.nextInt();

				assert(cost[i]>=1 && cost[i]<=100000000) : "cost["+i+"] must be 1 <= cost[i] <= 100000000";
				assert(weight[i]>=1 && weight[i]<=100000000) : "weight["+i+"] must be 1 <= weight[i] <= 100000000";
			}

			p = 1<<N;

			int[] subset = new int[10];

			for(int i=0;i<10;i++){
				subset[i] = 0;
			}

			ans = -1;

			for(int i=0;i<p;i++){
				q = i;
				l = 0;

				while(l<N){
					if((q&1)==1){
						subset[l] = 1;
					}else{
						subset[l] = 0;
					}

					q >>= 1;
					l++;
				}

				c = 0;
				w = 0;

				for(int j=0;j<N;j++){
					if(subset[j]==1){
						c += cost[j];
						w += weight[j];
					}
				}

				if(c<=K && w>ans){
					ans = w;
				}
			}

			System.out.println(ans);

			T--;
		}
	}
}