//run as java -ea evenTual
import java.util.Scanner;

public class evenTual{
	public static void main(String[] args){
		int T,N,flag;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=200) : "T must be 1 <= T <= 200";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=1000) : "N must be 1 <= N <= 1000";

			String S;
			S = scan.next();

			for(int i=0;i<N;i++){
				assert(S.charAt(i)>=97 && S.charAt(i)<=122) : "All letters must be lower case";
			}

			int[] count = new int[26];

			for(int i=0;i<26;i++){
				count[i] = 0;
			}

			for(int i=0;i<N;i++){
				count[S.charAt(i)-97]++;
			}

			flag = 0;

			for(int i=0;i<N;i++){
				if(count[i]%2!=0){
					flag = 1;
					break;
				}
			}

			if(flag==1){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}

			T--;
		}
	}
}