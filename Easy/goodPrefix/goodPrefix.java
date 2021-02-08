//run as java -ea goodPrefix
import java.util.Scanner;

public class goodPrefix{
	public static void main(String[] args){
		int T,K,X,ans;
		String S;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			S = scan.next();
			K = scan.nextInt();
			X = scan.nextInt();

			for(int i=0;i<S.length();i++){
				assert(S.charAt(i)>=97 && S.charAt(i)<=122) : "String S must only have lower case letters";
			}

			assert(K>=0 && K<=10000) : "K must be 0 <= K <= 10000";
			assert(X>=1 && X<=10000) : "X must be 1 <= X <= 10000";

			int[] F = new int[26];
			ans = 0;

			for(int i=0;i<S.length();i++){
				if(F[S.charAt(i)-'a']==X){
					if(K==0){
						break;
					}else{
						K--;
					}
				}else{
					F[S.charAt(i)-'a']++;
					ans++;
				}
			}

			System.out.println(ans);

			T--;
		}
	}
}