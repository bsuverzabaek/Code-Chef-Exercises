//run as java -ea pourWater
import java.util.Scanner;

public class pourWater{
	public static void main(String[] args){
		int T,A,B,C;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			A = scan.nextInt();
			assert(A<=40000) : "A cannot be more than 40000";

			B = scan.nextInt();
			assert(B<=40000) : "B cannot be more than 40000";

			C = scan.nextInt();
			assert(C<=40000) : "C cannot be more than 40000";

			if(C>A && C>B){
				System.out.println(-1);
			}else if(C%gcd(A,B)!=0){
				System.out.println(-1);
			}else if(C==A || C==B){
				System.out.println(1);
			}else{
				System.out.println(min(pour(A,B,C),pour(B,A,C)));
			}

			T--;
		}
	}

	public static int gcd(int A,int B){
		if(B==0){
			return A;
		}

		return gcd(B,A%B);
	}

	public static int pour(int A,int B,int C){
		int move = 1;
		int a = A;
		int b = 0;
		int tfr;

		while(a!=C && b!=C){
			tfr = min(a,B-b);
			b += tfr;
			a -= tfr;
			move++;

			if(a==C || b==C){
				break;
			}

			if(a==0){
				a = A;
				move++;
			}

			if(b==B){
				b = 0;
				move++;
			}
		}

		return move;
	}

	public static int min(int A,int B){
		if(A<B){
			return A;
		}else{
			return B;
		}
	}
}