//run as java -ea brackets
import java.util.Scanner;

public class brackets{
	public static void main(String[] args){
		int T,bal,m;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=5) : "T must be 1 <= T <= 5";

		while(T>0){
			String A;

			A = scan.next();
			assert(A.length()>=1 && A.length()<=100000) : "Length of A must be 1 <= |A| <= 10^5";

			bal = 0;
			m = 0;

			for(int i=0;i<A.length();i++){
				if(A.charAt(i)=='('){
					bal++;
				}else{
					bal--;
				}

				m = max(m,bal);
			}

			for(int i=0;i<m;i++){
				System.out.print("(");
			}

			for(int i=0;i<m;i++){
				System.out.print(")");
			}

			System.out.println();

			T--;
		}
	}

	public static int max(int a,int b){
		return (a>b)?a:b;
	}
}