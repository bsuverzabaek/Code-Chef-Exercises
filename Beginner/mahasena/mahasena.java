import java.util.Scanner;

public class mahasena{
	public static void main(String[] args) {
		int N,A,count;
		Scanner scan = new Scanner(System.in);

		while(true){
			N = scan.nextInt();

			if(N<=0 || N>100){
				System.out.println("N must be 1 <= N <= 100");
			}else{
				break;
			}
		}

		count = 0;

		for(int i=0;i<N;i++){
			while(true){
				A = scan.nextInt();

				if(A<=0 || A>100){
					System.out.println("A must be 1 <= A <= 100");
				}else{
					break;
				}
			}

			if(A%2==0){
				count++;
			}
		}

		if(count>N-count){
			System.out.println("READY FOR BATTLE");
		}else{
			System.out.println("NOT READY");
		}
	}
}