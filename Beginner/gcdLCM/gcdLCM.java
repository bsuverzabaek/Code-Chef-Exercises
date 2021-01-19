import java.util.Scanner;

public class gcdLCM{
	public static void main(String[] args) {
		int T,A,B;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>1000){
				System.out.println("T must be 1 <= T <= 1000");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				A = scan.nextInt();
				B = scan.nextInt();

				if(A<=0 || A>1000000 || B<=0 || B>1000000){
					System.out.println("A and B must be 1 <= A,B <= 1000000");
				}else{
					break;
				}
			}

			System.out.println(gcd(A,B) + " " + lcm(A,B));

			T--;	
		}
	}

	public static int gcd(int A,int B){
		if(A==0){
			return B;
		}else if(B==0){
			return A;
		}else{
			int rem = A%B;
			A = B;
			B = rem;
			return gcd(A,B);
		}
	}

	public static int lcm(int A,int B){
		int ans;
		int gcf = gcd(A,B);

		if(A%gcf==0){
			ans = A/gcf;
			ans *= B;
			return ans;
		}else{
			ans = B/gcf;
			ans *= A;
			return ans;
		}
	}
}