//run as java -ea rupsaTri
import java.util.Scanner;

public class rupsaTri{
	public static void main(String[] args){
		int T,N;
		Scanner scan = new Scanner(System.in);

		boolean[] P = new boolean[5000001];
		boolean[] Q = new boolean[5000001];

		for(int i=2;i<2237;i++){
			if(P[i]==true){
				continue;
			}

			for(int j=2;i*j<5000001;j++){
				P[i*j] = true;
			}
		}

		for(int i=2;i<5000001;i++){
			if(P[i]==true){
				continue;
			}

			if((i-1)%4==0){
				for(int j=1;i*j<5000001;j++){
					Q[i*j] = true;
				}
			}
		}

		T = scan.nextInt();
		assert(T>=1 && T<=1000000) : "T must be 1 <= T <= 10^6";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=5000000) : "N must be 1 <= N <= 5*10^6";

			if(Q[N]==true){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			T--;
		}
	}
}