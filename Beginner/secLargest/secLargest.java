import java.util.Scanner;

public class secLargest{
	public static void main(String[] args) {
		int T,A,B,C;
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
				C = scan.nextInt();

				if(A<=0 || A>1000000){
					System.out.println("A must be 1 <= A <= 1000000");
				}else if(B<=0 || B>1000000){
					System.out.println("B must be 1 <= B <= 1000000");
				}else if(C<=0 || C>1000000){
					System.out.println("C must he 1 <= C <= 1000000");
				}else{
					break;
				}
			}

			if((A>B && A<C) || (A>C && A<B)){
				System.out.println(A);
			}else if((B>A && B<C) || (B>C && B<A)){
				System.out.println(B);
			}else if((C>A && C<B) || (C>B && C<A)){
				System.out.println(C);
			}

			T--;
		}
	}
}