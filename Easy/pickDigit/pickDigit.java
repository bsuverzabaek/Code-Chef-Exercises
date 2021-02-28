//run as java -ea pickDigit
import java.util.Scanner;

public class pickDigit{
	public static void main(String[] args){
		int T,N,ones,two;
		String S;
		char c;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			S = scan.next();
			assert(S.length()>=1);

			int[] A = new int[10];
			
			for(int i=0;i<10;i++){
				A[i] = 0;
			}

			N = S.length();

			for(int i=0;i<N;i++){
				A[S.charAt(i)-48]++;
			}

			for(int i=65;i<=90;i++){
				ones = i%10;
				two = i/10;

				if(ones==two && A[ones]>1){
					c = (char)i;
					System.out.print(c);
				}else if(ones!=two && A[ones]!=0 && A[two]!=0){
					c = (char)i;
					System.out.print(c);
				}
			}

			System.out.println();

			T--;
		}
	}
}