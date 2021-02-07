//run as java -ea notTri
import java.util.Scanner;
import java.util.Arrays;

public class notTri{
	public static void main(String[] args){
		int N,count,l,r;
		Scanner scan = new Scanner(System.in);

		while(true){
			N = scan.nextInt();
			assert((N>=3 && N<=2000) || N==0) : "N must be 0 or 3 <= N <= 2000";

			count = 0;

			if(N==0){
				break;
			}else{
				int[] L = new int[N];

				for(int i=0;i<N;i++){
					L[i] = scan.nextInt();
					assert(L[i]>=1 && L[i]<=1000000) : "L["+i+"] must be 1 <= L[i] <= 1000000";
				}

				Arrays.sort(L);

				for(int i=N-1;i>=1;i--){
					l = 0;
					r = N-1;

					while(l<r){
						if(L[l]+L[r]<L[i]){
							count += r-l;
							l++;
						}else{
							r--;
						}
					}
				}

				System.out.println(count);
			}
		}
	}
}