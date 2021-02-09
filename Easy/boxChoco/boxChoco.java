//run as java -ea boxChoco
import java.util.Scanner;

public class boxChoco{
	public static void main(String[] args){
		int T,N,max,init=0,fin=0,K=0;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=5) : "T must be 1 <= T <= 5";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000 && N%2==0) : "N must be 1 <= N <= 10^5 and even";

			int[] W = new int[N];
			max = 0;

			for(int i=0;i<N;i++){
				W[i] = scan.nextInt();
				assert(W[i]>=1 && W[i]<=100000) : "W["+i+"] must be 1 <= W[i] <= 10^5";

				if(W[i]>max){
					max = W[i];
				}
			}

			int i;

			for(i=0;i<N;i++){
				if(W[i]==max){
					init = i;
					fin = i;
					i++;
					break;
				}
			}

			while(i<N){
				if(W[i]==max){
					fin = i;
				}
				i++;
			}

			if(init==N/2){
				K=(N-fin);
			}else if(init>N/2){
				K=(init-N/2)+(N-fin);
			}else if(init<N/2){
				if(fin+(N/2-init)>=N){
					K=0;
				}else{
					K=N-(fin+(N/2-init));
				}
			}

			System.out.println(K);

			T--;
		}
	}
}