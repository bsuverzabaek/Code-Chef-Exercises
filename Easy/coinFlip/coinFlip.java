import java.util.Scanner;

public class coinFlip{
	public static void main(String[] args) {
		int T;
		int G;
		int N;
		int I;
		int Q;

		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>10){
				System.out.println("T must be 1 <= T <= 10");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				G = scan.nextInt();

				if(G<=0 || G>20000){
					System.out.println("G must be 1 <= G <= 20000");
				}else{
					break;
				}
			}

			for(int g=1;g<=G;g++){
				while(true){
					I = scan.nextInt();
					N = scan.nextInt();
					Q = scan.nextInt();

					if(N<=0 || N>1000000000){
						System.out.println("N must be 1 <= N <= 10^9");
					}else if(I<=0 || I>2){
						System.out.println("I must be 1 <= I <= 2");
					}else if(Q<=0 || Q>2){
						System.out.println("Q must be 1 <= Q <= 2");
					}else{
						break;
					}
				}

				if(N%2==0 || I==Q){
					System.out.println(N/2);
				}else{
					System.out.println((N/2)+1);
				}
			}

			T--;
		}
	}
}