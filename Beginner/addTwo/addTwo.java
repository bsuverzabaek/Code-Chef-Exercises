import java.util.Scanner;

public class addTwo{
	public static void main(String[] args) {
		int T;
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("Input T: ");
			T = scan.nextInt();

			if(T<1 || T>1000){
				System.out.println("T must be 1 <= T <= 1000");
			}else{
				break;
			}
		}

		while(T>0){
			int A;
			int B;

			while(true){
				System.out.print("Input A: ");
				A = scan.nextInt();

				if(A<0 || A>10000){
					System.out.println("A must be 0 <= A <= 10000");
				}else{
					break;
				}
			}

			while(true){
				System.out.print("Input B: ");
				B = scan.nextInt();

				if(B<0 || B>10000){
					System.out.println("B must be 0 <= B <= 10000");
				}else{
					break;
				}
			}

			System.out.println(sum(A,B));

			T--;
		}
	}

	public static int sum(int A, int B){
		return A + B;
	}
}