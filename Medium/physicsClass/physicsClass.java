//run as java -ea physicsClass
import java.util.Scanner;
import java.util.Arrays;

public class physicsClass{
	public static void main(String[] args){
		int T,N,F,x,y,z;
		long ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			ans = 0;

			N = scan.nextInt();
			F = scan.nextInt();

			assert(N>=1 && N<=10000) : "N must be 1 <= N <= 10^3";
			assert(F>=2 && F<=1000000000) : "F must be 2 <= F <= 10^9";

			int[] h = new int[N];

			for(int i=0;i<N;i++){
				x = scan.nextInt();
				assert(x>=1 && x<=1000000000) : "h["+i+"] must be 1 <= h[i] <= 10^9";

				while(x%F==0){
					x /= F;
				}

				h[i] = x;
			}

			Arrays.sort(h);

			y = h[0];
			z = 1;

			for(int i=1;i<N;i++){
				if(h[i]!=y){
					y = h[i];
					z = 0;
				}

				ans += z;
				z++;
			}

			System.out.println(ans);

			T--;
		}
	}
}