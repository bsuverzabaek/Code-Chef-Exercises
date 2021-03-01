//run as java -ea mightyFriend
import java.util.Scanner;
import java.util.Arrays;

public class mightyFriend{
	public static void main(String[] args){
		int T,N,K,i,j,num,sum1,sum2;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();

			assert(N>=1 && N<=10000) : "N must be 1 <= N <= 10000";
			assert(K>=0 && K<=10000) : "K must be 0 <= K <= 10000";

			int l1 = (N+1)/2;
			int l2 = N/2;

			int[] motu = new int[l1];
			int[] tomu = new int[l2];

			i = 0;
			j = 0;

			for(int a=1;a<=N;a++){
				num = scan.nextInt();
				assert(num>=1 && num<=10000) : "Each element must be 1 <= a <= 10000";

				if(a%2!=0){
					motu[i] = num;
					i++;
				}else{
					tomu[j++] = num;
				}
			}

			Arrays.sort(motu);
			Arrays.sort(tomu);

			i = l1-1;
			j = 0;

			while(K>0){
				if(motu[i]>tomu[j]){
					K--;

					int t = motu[i];
					motu[i] = tomu[j];
					tomu[j] = t;

					i--;
					j++;
				}else{
					break;
				}
			}

			sum1 = 0;
			sum2 = 0;

			for(i=0;i<l1;i++){
				sum1 += motu[i];
			}

			for(j=0;j<l2;j++){
				sum2 += tomu[j];
			}

			if(sum2>sum1){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			T--;
		}
	}
}