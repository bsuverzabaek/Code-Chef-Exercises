//run as java -ea campNot
import java.util.Scanner;

public class campNot{
	public static void main(String[] args){
		int T,D,Q;
		int d,p,dead,req;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			D = scan.nextInt();
			assert(D>=1 && D<=31) : "D must be 1 <= D <= 31";

			int[] A = new int[32];

			for(int i=0;i<32;i++){
				A[i] = 0;
			}

			while(D>0){
				d = scan.nextInt();
				p = scan.nextInt();

				assert(d>=1 && d<=31) : "d must be 1 <= d <= 31";
				assert(p>=1 && p<=100) : "p must be 1 <= p <= 100";

				A[d] = p;

				D--;
			}

			for(int i=1;i<32;i++){
				A[i] += A[i-1];
			}

			Q = scan.nextInt();
			assert(Q>=1 && Q<=100) : "Q must be 1 <= Q <= 100";

			while(Q>0){
				dead = scan.nextInt();
				req = scan.nextInt();

				assert(dead>=1 && dead<=31) : "deadlines must be 1 <= dead <= 31";
				assert(req>=1 && req<=5000) : "requirements must be 1 <= req <= 5000";

				if(A[dead]>=req){
					System.out.println("Go Camp");
				}else{
					System.out.println("Go Sleep");
				}

				Q--;
			}

			T--;
		}
	}
}