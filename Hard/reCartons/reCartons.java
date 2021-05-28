//run as java -ea reCartons
import java.util.Scanner;

public class reCartons{
	public static void main(String[] args){
		int N,k,temp,min;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];

		for(int i=0;i<N;i++){
			a[i] = scan.nextInt();
		}

		for(int i=0;i<N;i++){
			b[i] = scan.nextInt();
		}

		for(int i=0;i<N;i++){
			k = 0;

			while(a[i]!=b[k]){
				k++;
			}

			c[i] = k;
		}

		min = 0;

		for(int i=0;i<N-1;i++){
			for(int j=0;j<N-1;j++){
				if(c[j]>c[j+1]){
					temp = c[j];
					c[j] = c[j+1];
					c[j+1] = temp;
					min++;
				}
			}
		}

		System.out.println(min);
	}
}