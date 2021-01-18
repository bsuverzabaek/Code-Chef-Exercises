import java.util.Scanner;

public class primaTest{
	public static void main(String[] args) {
		int T,N,prime;
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

				if(N<=0 || N>100000){
					System.out.println("N must be 1 <= N <= 100000");
				}else{
					break;
				}
			}

			prime = 0;

			for(int i=1;i<=N/2;i++){
				if(N%i==0){
					prime++;
				}
			}

			if(prime==1){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}

			T--;
		}
	}
}