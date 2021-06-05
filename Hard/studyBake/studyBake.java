//run as java -ea studyBake
import java.util.Scanner;

public class studyBake{
	public static void main(String[] args){
		int T,n,sumN,index,target;
		double tanV,greed;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		sumN = 0;

		while(T>0){
			n = scan.nextInt();
			assert(n>=1 && n<=100000) : "n must be 1 <= n <= 10^5";

			sumN += n;
			assert(sumN<=500000) : "Sum of n must be <= 5*10^5";

			int[] x = new int[n];
			int[] h = new int[n];
			int[] ans = new int[n];

			for(int i=0;i<n;i++){
				x[i] = scan.nextInt();
				h[i] = scan.nextInt();
				assert(x[i]>=1 && x[i]<=1000000) : "x["+i+"] must be 1 <= x[i] <= 10^6";
				assert(h[i]>=1 && h[i]<=1000000) : "h["+i+"] must be 1 <= h[i] <= 10^6";
				ans[i] = -2;
			}

			for(int i=0;i<n-1;i++){
				assert(x[i]<x[i+1]) : "x[i] must be < x[i+1]";
			}

			for(int i=n-2;i>=0;i--){
				if(h[i]<=h[i+1]){
					continue;
				}

				ans[i] = i+1;
				tanV = (double)(h[i+1]-h[i])/(x[i]-x[i+1]);
				index = i+1;

				for(int j=i+1;j<n;j++){
					target = ans[index];

					if(target==-2){
						target = index+1;
					}

					if(target>=n || h[target]>=h[i]){
						break;
					}

					index = target;
					greed = (double)(h[target]-h[i])/(x[i]-x[target]);

					if(tanV>=greed){
						ans[i] = target;
						tanV = greed;
					}
				}
			}

			for(int i=0;i<n;i++){
				System.out.print((ans[i]+1) + " ");
			}
			System.out.println();

			T--;
		}
	}
}