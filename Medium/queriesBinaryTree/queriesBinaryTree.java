//run as java -ea queriesBinaryTree
import java.util.Scanner;

public class queriesBinaryTree{
	public static void main(String[] args){
		int Q;
		long n,u,v,a,b,ans;
		Scanner scan = new Scanner(System.in);

		Q = scan.nextInt();
		assert(Q>=1 && Q<=20000) : "Q must be 1 <= Q <= 2*10^4";

		while(Q>0){
			n = scan.nextLong();
			u = scan.nextLong();
			v = scan.nextLong();

			assert(u>=1 && u<=n) : "u must be 1 <= u <= n";
			assert(v>=1 && v<=n) : "v must be 1 <= v <= n";
			assert(n<=1000000000) : "n must be <= 10^9";

			a = 1;
			b = 1;

			if(u>v){
				ans = u;
				u = v;
				v = ans;
			}

			ans = LCA(u,v,a,b);

			if(b>a){
				a = b;
			}

			System.out.println(ans+(n-v)/a);

			Q--;
		}
	}

	public static long LCA(long u,long v,long a,long b){
		while(u!=v){
			if(u>v){
				u >>= 1;
				a <<= 1;
			}else if(v>u){
				v >>= 1;
				b <<= 1;
			}
		}

		return u;
	}
}