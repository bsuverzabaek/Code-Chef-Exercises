//run as java -ea pieceOfCake
import java.util.Scanner;

public class pieceOfCake{
	public static void main(String[] args){
		int T,max;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			String S;

			S = scan.next();
			assert(S.length()>=1 && S.length()<=50) : "Length of string must be 1 <= |S| <= 50";

			int[] a = new int[26];

			for(int i=0;i<26;i++){
				a[i] = 0;
			}

			max = 0;

			if(S.length()%2==1){
				System.out.println("NO");
			}else{
				for(int i=0;i<S.length();i++){
					if(S.charAt(i)>='a' && S.charAt(i)<='z'){
						a[S.charAt(i)-'a']++;
					}
				}

				for(int i=0;i<26;i++){
					if(max<a[i]){
						max = a[i];
					}
				}

				if(max==S.length()/2){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}

			T--;
		}
	}
}