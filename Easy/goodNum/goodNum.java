//run as java -ea goodNum
import java.util.Scanner;

public class goodNum{
	public static void main(String[] args){
		int[] S = new int[100009];
		int[] pSum = new int[100009];

		for(int i=0;i<100009;i++){
			S[i] = 0;
			pSum[i] = 0;
		}

		boolean[] prime = new boolean[500000];
		boolean[] freeNum = new boolean[500000];

		for(int i=0;i<500000;i++){
			prime[i] = false;
			freeNum[i] = false;
		}

		int[] C = new int[500000];

		for(int i=0;i<500000;i++){
			C[i] = 0;
		}

		prime[0] = true;
		prime[1] = true;

		for(int i=2;i*i<=500000;i++){
			if(!prime[i]){
				for(int j=i*i;j<500000;j+=i){
					prime[j] = true;
				}
			}
		}

		S[1] = 1;

		for(int i=2;i<100009;i++){
			S[i]++;
			for(int j=i;j<100009;j+=i){
				S[j] += i;
			}
		}

		freeNum[0] = true;

		for(int i=2;i*i<=100009;i++){
			for(int j=i*i;j<100009;j+=i*i){
				freeNum[j] = true;
			}
		}

		for(int i=2;i<500000;i++){
			if(!prime[i]){
				for(int j=i;j<500000;j+=i){
					C[j]++;
				}
			}
		}

		for(int i=2;i<100009;i++){
			pSum[i] = pSum[i-1];
			if(!freeNum[i] && !prime[C[S[i]]]){
				pSum[i] += S[i];
			}
		}

		int T,L,R;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			L = scan.nextInt();
			R = scan.nextInt();

			assert(L>=1 && L<=R) : "L must be 1 <= L <= R";
			assert(R>=L && R<=100000) : "R must be L <= R <= 10^5";

			System.out.println(pSum[R]-pSum[L-1]);

			T--;
		}
	}
}