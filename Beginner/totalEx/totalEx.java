import java.util.Scanner;

public class totalEx{
	public static void main(String[] args){
		int T,Q,P;
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
				Q = scan.nextInt();
				P = scan.nextInt();

				if(Q<=0 || Q>100000 || P<=0 || P>100000){
					System.out.println("Q and P must be 1 <= Q,P <= 100000");
				}else{
					break;
				}
			}

			if(Q>1000){
				float total = Q*P;
				total -= (Q*P*0.1);
				System.out.format("%.6f\n",total);
			}else{
				System.out.format("%.6f\n",(float)Q*P);
			}

			T--;
		}
	}
}