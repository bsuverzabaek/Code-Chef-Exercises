import java.util.Scanner;

public class farmerPlot{
	public static void main(String[] args) {
		int T,M,N,a,b;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>20){
				System.out.println("T must be 1 <= T <= 20");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				N = scan.nextInt();
				M = scan.nextInt();

				if(N<=0 || N>10000 || M<=0 || M>10000){
					System.out.println("M and N must be 1 <= M,N <= 10000");
				}else{
					break;
				}
			}

			a = N;
			b = M;

			while(a!=b){
				if(a>b){
					a-=b;
				}else{
					b-=a;
				}
			}

			System.out.println((N/a)*(M/b));

			T--;
		}
	}
}