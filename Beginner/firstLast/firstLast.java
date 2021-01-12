import java.util.Scanner;

public class firstLast{
	public static void main(String[] args) {
		int T,N,sum;
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
				N = scan.nextInt();

				if(N<=0 || N>1000000){
					System.out.println("N must be 1 <= N <= 1000000");
				}else{
					break;
				}
			}

			sum = 0;
			sum += N%10;

			while(N>0){
				if(N<10 && N>0){
					sum += N;
				}
				N /= 10;
			}

			System.out.println(sum);

			T--;
		}
	}
}