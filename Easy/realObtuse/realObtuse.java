//run as java -ea realObtuse
import java.util.Scanner;
import java.lang.Math;

public class realObtuse{
	public static void main(String[] args){
		int T,k,A,B;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			k = scan.nextInt();
			A = scan.nextInt();
			B = scan.nextInt();

			assert(k>=3 && k<=1000000000) : "k must be 3 <= k <= 10^9";
			assert(A>=1 && A<=k && B>=1 && B<=k) : "A and B must be 1 <= A,B <= k";
			assert(A!=B) : "A and B must not be equal";

			if(Math.abs(A-B)==k-Math.abs(A-B)){
				System.out.println(0);
			}else{
				System.out.println(min(Math.abs(A-B),k-Math.abs(A-B))-1);
			}

			T--;
		}
	}

	public static int min(int a,int b){
		if(a<b){
			return a;
		}else{
			return b;
		}
	}
}