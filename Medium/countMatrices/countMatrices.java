//run as java -ea countMatrices
import java.util.Scanner;

public class countMatrices{
	public static void main(String[] args){
		int T,N,pro,count;
		long ans,d;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=50) : "T must be 1 <= T <= 50";

		while(T>0){
			N = scan.nextInt();
			assert(N>=3 && N<=2500) : "N must be 3 <= N <= 2500";

			ans = 0;

			for(int i=N-1;i>=1;i--){
				d = 0;
				pro = i*(N-i)-1;
				count = 0;

				for(int j=1;j*j<=pro;j++){
					count++;
					d = d+(pro/j)-j;
				}

				ans = ans+(d*2)+count;
			}

			System.out.println(ans);

			T--;
		}
	}
}