//run as java -ea luckyCount
import java.util.Scanner;

public class luckyCount{
	public static void main(String[] args){
		int T,N,s4,s7;
		Scanner scan = new Scanner(System.in);

		int[] f4 = new int[100001];
		int[] f7 = new int[100001];
		int[] ans = new int[100001];
		int[] c = new int[100001];

		f4[4] = 1;
		f7[7] = 1;

		for(int i=14;i<=100000;i++){
			if(i%10==4){
				f4[i] = 1+f4[i/10];
			}else{
				f4[i] = f4[i/10];
			}

			if(i%10==7){
				f7[i] = 1+f7[i/10];
			}else{
				f7[i] = f7[i/10];
			}
		}

		ans[1] = 1;
		c[0] = 2;

		s4 = 0;
		s7 = 0;

		for(int i=2;i<=100000;i++){
			s4 += f4[i];
			s7 += f7[i];
			ans[i] = ans[i-1]+c[s4-s7];
			c[s4-s7]++;
		}

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			System.out.println(ans[N]);

			T--;
		}
	}
}