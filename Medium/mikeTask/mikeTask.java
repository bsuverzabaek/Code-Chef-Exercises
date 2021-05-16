//run as java -ea mikeTask
import java.util.Scanner;
import java.util.Arrays;

public class mikeTask{
	public static void main(String[] args){
		long N,X,total,failed,successful;
		Scanner scan = new Scanner(System.in);

		N = scan.nextLong();
		X = scan.nextLong();

		assert(N>=1 && N<=1000000) : "N must be 1 <= N <= 1000000";
		assert(X>=0 && X<=1000000000000000L) : "X must be 0 <= X <= 10^15";

		long[] A = new long[(int)N];

		for(int i=0;i<N;i++){
			A[i] = scan.nextLong();
			assert(A[i]>=1 && A[i]<=1000000000) : "A["+i+"] must be 1 <= A[i] <= 10^9";
		}

		Arrays.sort(A);

		total = 0;
		failed = N;
		successful = 0;

		for(int i=0;i<N;i++){
			if(A[i]%2!=0){
				total += A[i]/2+1;
			}else{
				total += A[i]/2;
			}

			if(total>X){
				if(A[i]%2!=0){
					total -= A[i]/2+1;
				}else{
					total -= A[i]/2;
				}

				break;
			}

			if(A[i]==1){
				successful++;
			}

			failed--;
		}

		for(int i=0;i<N;i++){
			if(!(A[i]==1)){
				total += A[i]/2;

				if(total>X){
					break;
				}

				successful++;
			}
		}

		System.out.println(failed + " " + successful);
	}
}