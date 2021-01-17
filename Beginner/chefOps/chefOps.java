import java.util.Scanner;

public class chefOps{
	public static void main(String[] args) {
		int T,A,B;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>10000){
				System.out.println("T must be 1 <= T <= 10000");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				A = scan.nextInt();
				B = scan.nextInt();

				if(A<=0 || A>1000000001 || B<=0 || B>1000000001){
					System.out.println("A and B must be 1 <= A,B <= 1000000001");
				}else{
					break;
				}
			}

			if(A<B){
				System.out.println("<");
			}else if(A>B){
				System.out.println(">");
			}else{
				System.out.println("=");
			}
			
			T--;
		}
	}
}