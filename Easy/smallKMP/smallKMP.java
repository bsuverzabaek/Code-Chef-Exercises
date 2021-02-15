//run as java -ea smallKMP
import java.util.Scanner;

public class smallKMP{
	public static void main(String[] args){
		int T,x,k,flag=0;
		String S,P;
		Scanner scan = new Scanner(System.in);

		int[] A = new int[26];
		int[] B = new int[26];

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			S = scan.next();
			P = scan.next();

			for(int i=0;i<26;i++){
				A[i] = 0;
				B[i] = 0;
			}

			for(int i=0;i<S.length();i++){
				assert(S.charAt(i)>=97 && S.charAt(i)<=122) : "All letters must be lower case";
				x = (int)S.charAt(i)-97;
				A[x]++;
			}

			k = (int)P.charAt(0)-97;

			for(int i=0;i<P.length();i++){
				assert(P.charAt(i)>=97 && P.charAt(i)<=122) : "All letters must be lower case";
				x = (int)P.charAt(i)-97;
				B[x]++;
			}

			for(int i=0;i<26;i++){
				A[i] -= B[i];
			}

			for(int i=0;i<k;i++){
				for(int j=0;j<A[i];j++){
					char c = (char)(i+97);
					System.out.print(c);
				}
			}

			for(int i=1;i<P.length();i++){
				if(P.charAt(0)>P.charAt(i)){
					flag = 1;
					break;
				}

				if(P.charAt(0)<P.charAt(i)){
					flag = 0;
					break;
				}
			}

			if(flag==1){
				System.out.print(P);
				for(int i=k;i<26;i++){
					for(int j=0;j<A[i];j++){
						char c = (char)(i+97);
						System.out.print(c);
					}
				}
			}

			if(flag==0){
				for(int j=0;j<A[k];j++){
					char c = (char)(k+97);
					System.out.print(c);
				}
				System.out.print(P);
				for(int i=k+1;i<26;i++){
					for(int j=0;j<A[i];j++){
						char c = (char)(i+97);
						System.out.print(c);
					}
				}
			}

			System.out.println();

			T--;
		}
	}
}