//run as java -ea chefBipartite
import java.util.Scanner;

public class chefBipartite{
	public static void main(String[] args){
		int T,n,m,d,D,vertex,offset;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			n = scan.nextInt();
			m = scan.nextInt();
			d = scan.nextInt();
			D = scan.nextInt();

			assert(n>=1 && n<=100) : "n must be 1 <= n <= 100";
			assert(m>=0 && m<=n*n) : "m must be 0 <= m <= n*n";
			assert(d>=1 && d<=D) : "d must be 1 <= d <= D";
			assert(D>=d && D<=n) : "D must be d <= D <= n";

			if((m/n<d) || (m+n-1)/n>D){
				System.out.println(-1);
			}else{
				vertex = 1;
				offset = 0;

				for(int i=0;i<m;i++){
					System.out.println(vertex + " " + (1+(vertex-1+offset)%n));
					vertex++;

					if(vertex>n){
						vertex = 1;
						offset++;
					}
				}
			}

			T--;
		}
	}
}