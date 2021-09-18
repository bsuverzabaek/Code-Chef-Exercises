//run as java -ea chefSubarray
import java.util.Scanner;

public class chefSubarray{
	public static void main(String[] args){
		int N,count,max;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		assert(N>=1 && N<=100000) : "N must be 1 <= N <= 100000";

		int[] A = new int[N];

		for(int i=0;i<N;i++){
			A[i] = scan.nextInt();
			assert(A[i]>=0 && A[i]<=10000) : "A["+i+"] must be 0 <= A[i] <= 10000";
		}

		if(A[0]==0){
			count = 0;
		}else{
			count = 1;
		}

		max = count;

		for(int i=1;i<N;i++){
			if(A[i]!=0){
				count++;
			}else{
				if(count>max){
					max = count;
				}
				count = 0;
			}
		}

		System.out.println(max);
	}
}