//run as java -ea phonePrices
import java.util.Scanner;

public class phonePrices{
	public static void main(String[] args){
		int T,N,count;
		boolean good;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=7 && N<=100) : "N must be 7 <= N <= 100";

			int[] P = new int[N];
			count = 0;

			for(int i=0;i<N;i++){
				P[i] = scan.nextInt();
				assert(P[i]>=350 && P[i]<=750) : "P["+i+"] must be 350 <= P[i] <= 750";

				good = true;

				for(int j=max(i-5,0);j<i;j++){
					good = good && P[i]<P[j];
				}

				if(good==true){
					count++;
				}
			}

			System.out.println(count);

			T--;
		}
	}

	public static int max(int a,int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
}