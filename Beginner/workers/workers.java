//run as java -ea workers
import java.util.Scanner;

public class workers{
	public static void main(String[] args){
		int N,min,temp,temp2,sum;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		assert(N>=1 && N<=1000) : "N must be 1 <= N <= 1000";

		int[] c = new int[N];
		int[] t = new int[N];

		for(int i=0;i<N;i++){
			c[i] = scan.nextInt();
			assert(c[i]>=1 && c[i]<=100000) : "c["+i+"] must be 1 <= c[i] <= 100000";
		}

		for(int i=0;i<N;i++){
			t[i] = scan.nextInt();
			assert(t[i]>=1 && t[i]<=3) : "t["+i+"] must be 1 <= t[i] <= 3";
		}

		min = 1000000;
		temp = 1000000;
		temp2 = 1000000;

		for(int i=0;i<N;i++){
			if(t[i]==1 && c[i]<temp){
				temp = c[i];
			}else if(t[i]==2 && c[i]<temp2){
				temp2 = c[i];
			}else if(t[i]==3 && c[i]<min){
				min = c[i];
			}
		}

		sum = temp + temp2;

		if(min<sum){
			System.out.println(min);
		}else{
			System.out.println(sum);
		}
	}
}