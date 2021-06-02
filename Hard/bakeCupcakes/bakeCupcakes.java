//run as java -ea bakeCupcakes
import java.util.Scanner;

public class bakeCupcakes{
	public static void main(String[] args){
		int T,n,m,g;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=30) : "T must be 1 <= T <= 30";

		while(T>0){
			n = scan.nextInt();
			m = scan.nextInt();
			g = scan.nextInt();

			assert(n>=1 && n<=1000) : "n must be 1 <= n <= 1000";
			assert(m>=1 && m<=20000) : "m must be 1 <= m <= 20000";
			assert(g>=0 && g<=n) : "g must be 0 <= g <= n";
			assert(n-g<=15) : "n-g must be <= 15";

			int[] fe = new int[m];
			int[] se = new int[m];
			int[] use = new int[1000];

			for(int i=0;i<1000;i++){
				use[i] = 0;
			}

			for(int i=0;i<m;i++){
				fe[i] = scan.nextInt();
				se[i] = scan.nextInt();

				assert(fe[i]>=0 && fe[i]<=n-1) : "i must be 0 <= i <= n-1";
				assert(se[i]>=0 && se[i]<=n-1) : "j must be 0 <= j <= n-1";
			}

			if(cover(0,n-g,use,fe,se,m)!=0){
				System.out.println("Possible");
			}else{
				System.out.println("Impossible");
			}

			T--;
		}
	}

	public static int cover(int st,int k,int[] use,int[] fe,int[] se,int m){
		if(st==m){
			return 1;
		}

		if(use[fe[st]]!=0 || use[se[st]]!=0){
			return cover(st+1,k,use,fe,se,m);
		}

		if(k==0){
			return 0;
		}

		use[fe[st]] = 1;

		if(cover(st+1,k-1,use,fe,se,m)!=0){
			return 1;
		}

		use[fe[st]] = 0;
		use[se[st]] = 1;

		if(cover(st+1,k-1,use,fe,se,m)!=0){
			return 1;
		}

		use[se[st]] = 0;
		return 0;
	}
}