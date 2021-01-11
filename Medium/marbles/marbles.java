import java.util.Scanner;

public class marbles{
	public static void main(String[] args) {
		int T;
		long n,k,N,R,ans;

		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>100){
				System.out.println("T must be 1 <= T <= 100");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				n = scan.nextLong();
				k = scan.nextLong();

				if(k<=0 || k>n){
					System.out.println("k must be 1 <= k <= n");
				}else if(n<k || n>1000000){
					System.out.println("n must be k <= n <= 1000000");
				}else{
					break;
				}
			}

			R = n - k;
			N = k + R - 1;
			ans = 1;

			if(R>N/2){
				R = N - R;
			}

			for(long i=0;i<R;i++){
				ans *= N--;
				ans /= i + 1;
			}

			System.out.println(ans);

			T--;
		}
	}
}