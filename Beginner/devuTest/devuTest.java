import java.util.Scanner;

public class devuTest{
	public static void main(String[] args) {
		int T,n,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10000) : "T must be 1 <= T <= 10^4";

		while(T>0){

			n = scan.nextInt();
			assert(n>=1 && n<=50) : "n must be 1 <= n <= 50";

			int[] count = new int[51];

			for(int i=0;i<51;i++){
				count[i] = 0;
			}

			for(int i=0,d;i<n;i++){
				d = scan.nextInt();
				assert(d>=1 && d<=100) : "d must be 1 <= d <= 100";
				count[d]++;
			}

			ans = 0;

			for(int i=0;i<51;i++){
				if(count[i]>0){
					ans++;
				}
			}

			System.out.println(ans);

			T--;
		}


	}
}