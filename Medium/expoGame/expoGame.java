//run as java -ea expoGame
import java.util.Scanner;

public class expoGame{
	public static void main(String[] args){
		int T,N,ans,p;
		
		int[] a = new int[200000];
		int[] val = new int[1000];
		int[] mark = new int[1000];

		Scanner scan = new Scanner(System.in);

		for(int i=0;i<1000;i++){
			mark[i] = 0;
		}

		a[0] = 0;

		for(int i=0;i<6;i++){
			val[i] = i+1;

			for(int j=0;j<i;j++){
				val[i] *= (i+1);
			}
		}

		for(int i=1;i<=105000;i++){
			for(int j=0;j<6;j++){
				if(i>=val[j]){
					mark[a[i-val[j]]] = 1;
				}
			}

			for(int j=0;j<=6;j++){
				if(mark[j]==0){
					a[i] = j;
					break;
				}
			}

			for(int j=0;j<=6;j++){
				mark[j] = 0;
			}
		}

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";

			ans = 0;

			for(int i=0;i<N;i++){
				p = scan.nextInt();
				assert(p>=1 && p<=100000) : "a["+i+"] must be 1 <= a[i] <= 100000";
				ans ^= a[p];
			}

			if(ans!=0){
				System.out.println("Little Chef");
			}else{
				System.out.println("Head Chef");
			}

			T--;
		}
	}
}