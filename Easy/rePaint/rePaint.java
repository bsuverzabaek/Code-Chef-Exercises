//run as java -ea rePaint
import java.util.Scanner;

public class rePaint{
	public static void main(String[] args){
		int T,N,K,state,ans;
		String C;
		int[] B = new int[100001];
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();

			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";
			assert(K>=1 && K<=100000) : "K must be 1 <= K <= 10^5";

			C = scan.next();

			for(int i=0;i<100001;i++){
				B[i] = 0;
			}

			state = 0;
			ans = 0;

			for(int i=0;i<N;i++){
				assert(C.charAt(i)=='G' || C.charAt(i)=='R') : "Each letter must be either G or R";

				if(B[i]!=0){
					state = 1-state;
				}

				if((state==0 && C.charAt(i)=='R') || (state==1 && C.charAt(i)=='G')){
					B[min(N,i+K)] = 1;
					ans++;
					state = 1-state;
				}
			}

			System.out.println(ans);

			T--;
		}
	}

	public static int min(int a,int b){
		if(a<b){
			return a;
		}else{
			return b;
		}
	}
}