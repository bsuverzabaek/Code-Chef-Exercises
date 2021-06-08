//run as java -ea palinStrings
import java.util.Scanner;

public class palinStrings{
	public static void main(String[] args){
		int T,flag;
		String A,B;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			A = scan.next();
			B = scan.next();

			assert(A.length()>=1 && A.length()<=1000) : "Length of strings must be 1 <= |A| <= 1000";
			assert(B.length()>=1 && B.length()<=1000) : "Length of strings must be 1 <= |B| <= 1000";

			int[] C1 = new int[26];
			int[] C2 = new int[26];

			for(int i=0;i<26;i++){
				C1[i] = 0;
				C2[i] = 0;
			}

			flag = 0;

			for(int i=0;i<A.length();i++){
				C1[A.charAt(i)-'a']++;
			}

			for(int i=0;i<B.length();i++){
				C2[B.charAt(i)-'a']++;
			}

			for(int i=0;i<26;i++){
				if(C1[i]>0 && C2[i]>0){
					flag = 1;
					break;
				}
			}

			if(flag==1){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

			T--;
		}
	}
}