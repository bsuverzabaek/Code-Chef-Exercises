//run as java -ea devaSena
import java.util.Scanner;

public class devaSena{
	public static void main(String[] args){
		int T,N,x,max1,p1,p2,mod,count,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=30) : "T must be 1 <= T <= 30";

		mod = 1000000007;

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			max1 = -1;
			ans = 1;

			int[] A = new int[100000];
			int[] S = new int[100000];

			for(int i=0;i<100000;i++){
				A[i] = 0;
				S[i] = 0;
			}

			for(int i=0;i<N;i++){
				x = scan.nextInt();
				assert(x>=1 && x<=100000) : "A["+i+"] must be 1 <= A[i] <= 10^5";
				A[x]++;

				if(x>max1){
					max1 = x;
				}
			}

			for(int i=max1;i>1;i--){
				p1 = A[i];
				p2 = 0;

				for(int j=2;(i*j)<=max1;j++){
					p1 += A[i*j];
					p2 = (p2+S[i*j])%(mod-1);
				}

				count = (binCount(2,p1,mod-1)-1-p2+mod-1)%(mod-1);
				ans = (ans*binCount(i,count,mod))%mod;
				S[i] = count;
			}

			System.out.println(ans);

			T--;
		}
	}

	public static int binCount(int a,int b,int m){
		int res = 1;

		while(b!=0){
			if((b&1)!=0){
				res = (res*a)%m;
			}

			a = (a*a)%m;
			b >>= 1;
		}

		return res;
	}
}