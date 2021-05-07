//run as java -ea moneyMatters
import java.util.Scanner;
import java.lang.Math;

public class moneyMatters{
	public static void main(String[] args){
		int T,N,len,sq,i,j,kl;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];

		while(T>0){
			N = scan.nextInt();
			assert(N<=1000000000) : "N must be <= 10^9";

			a[0] = 1;
			b[0] = 0;
			len = 0;

			if(((N+1)&N)!=0){
				sq = (int)Math.sqrt((float)N);

				for(i=1,j=0;i<=sq;i++){
					if((N%(i+1))==i){
						a[j] = i;
						b[j] = 1;
						c[j] = N/(a[j]+1);

						if(a[j]>=c[j]){
							break;
						}

						j++;
					}
				}

				kl = j-1;

				while(kl>=0){
					b[j] = 1;
					a[j] = c[kl];
					j++;
					kl--;
				}

				len = b[0];

				for(i=1;i<j;i++){
					for(int k=i-1;k>=0;k--){
						if((a[i]%(a[k]+1))==a[k]){
							b[i] += b[k];
						}
					}

					len += b[i];
				}
			}else{
				len = N/2;
			}

			System.out.println(len+1);

			T--;
		}
	}
}