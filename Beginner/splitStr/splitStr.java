//run as java -ea splitStr
import java.util.Scanner;

public class splitStr{
	public static void main(String[] args){
		int T,N,sumN,c;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10000) : "T must be 1 <= T <= 10^4";

		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=2 && N<=100000) : "N must be 2 <= N <= 10^5";

			String S;

			S = scan.next();
			assert(S.length()==N) : "Length of S must be == N";

			sumN += N;

			for(int i=0;i<N;i++){
				assert(S.charAt(i)>=97 && S.charAt(i)<=122) : "All letters must be lowercase";
			}

			if(T==1){
				assert(sumN<=1000000) : "Sum of N must be <= 10^6";
			}

			c = 0;

			for(int i=0;i<N-1;i++){
				if(S.charAt(i)==S.charAt(N-1)){
					c++;
					break;
				}
			}

			if(c>0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			T--;
		}
	}
}