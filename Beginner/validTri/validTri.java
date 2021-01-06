import java.util.Scanner;

public class validTri{
	public static void main(String[] args) {
		int T;
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("Input T: ");
			T = scan.nextInt();

			if(T<=0 || T>1000){
				System.out.println("T must be 1 <= T <= 180");
			}else{
				break;
			}
		}

		while(T>0){
			int A;
			int B;
			int C;

			while(true){
				System.out.print("Input A: ");
				A = scan.nextInt();

				if(A<=0 || A>180){
					System.out.println("A must be 1 <= A <= 180");
				}else{
					break;
				}
			}

			while(true){
				System.out.print("Input B: ");
				B = scan.nextInt();

				if(B<=0 || B>180){
					System.out.println("B must be 1 <= B <= 180");
				}else{
					break;
				}
			}

			while(true){
				System.out.print("Input C: ");
				C = scan.nextInt();

				if(C<=0 || C>180){
					System.out.println("C must be 1 <= C <= 180");
				}else{
					break;
				}
			}

			if(A+B+C==180){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			T--;
		}
	}
}