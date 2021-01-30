//run as java -ea encodeString
import java.util.Scanner;

public class encodeString{
	public static void main(String[] args){
		int T,N,x;
		String S;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=4 && N<=100000) : "N must be 4 <= N <= 10^5";

			S = scan.next();
			assert(S.length()%4==0);

			for(int i=0;i<N;i++){
				assert(S.charAt(i)=='0' || S.charAt(i)=='1');
			}

			for(int i=0;i<N;i+=4){
				x=0;

				for(int j=0;j<4;j++){
					x = (x<<1) | (S.charAt(i+j)-'0');
				}

				System.out.print((char)(x+'a'));
			}

			System.out.println();

			T--;
		}
	}
}