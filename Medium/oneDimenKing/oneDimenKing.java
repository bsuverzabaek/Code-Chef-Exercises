//run as java -ea oneDimenKing
import java.util.Scanner;

public class oneDimenKing{
	public static void main(String[] args){
		int T,N,count,temp,j;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			count = 0;
			temp = N;

			int[] a = new int[N];
			int[] b = new int[N];
			int[] c = new int[2002];

			for(int i=0;i<2002;i++){
				c[i] = 0;
			}

			for(int i=0;i<N;i++){
				a[i] = scan.nextInt();
				b[i] = scan.nextInt();

				assert(a[i]>=0 && a[i]<=b[i]) : "a["+i+"] must be 0 <= a[i] <= b[i]";
				assert(b[i]>=a[i] && b[i]<=2000) : "b["+i+"] must be a[i] <= b[i] <= 2000";

				c[b[i]]++;
			}

			for(int i=0;i<2002;i++){
				if(c[i]!=0){
					count++;
					j = 0;

					for(int k=0;k<temp;k++){
						if(b[k]<i || a[k]>i){
							a[j] = a[k];
							b[j] = b[k];
							j++;
						}else{
							c[b[k]]--;
						}
					}

					temp = j;
				}
			}

			System.out.println(count);

			T--;
		}
	}
}