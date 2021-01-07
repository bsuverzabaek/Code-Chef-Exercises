import java.util.Scanner;

public class cielProb{
	public static void main(String[] args) {
		int A;
		int B;

		Scanner scan = new Scanner(System.in);

		while(true){
			A = scan.nextInt();
			B = scan.nextInt();

			if(B<=0 || B>=A || A<=B || A>10000){
				System.out.println("A and B must be 1 <= B < A <= 10000");
			}else{
				break;
			}
		}

		if((A-B)%10==9){
			System.out.println(A-B-1);
		}else{
			System.out.println(A-B+1);
		}
	}
}