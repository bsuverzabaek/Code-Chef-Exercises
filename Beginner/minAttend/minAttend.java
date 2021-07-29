//run as java -ea minAttend
import java.util.Scanner;

public class minAttend{
	public static void main(String[] args){
		int T,N,c,p;
		float x;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=120) : "N must be 1 <= N <= 120";

			String B;
			B = scan.next();

			c = 0;

			for(int i=0;i<N;i++){
				assert(B.charAt(i)=='0' || B.charAt(i)=='1') : "All characters must be 0 or 1";

				if(B.charAt(i)=='0'){
					c++;
				}
			}

			p = 120-c;
			x = (p*100)/120;

			if(x>=75){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			T--;
		}
	}
}