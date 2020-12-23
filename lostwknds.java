import java.util.Scanner;

public class lostwknds{
	public static void main(String[] args) {
		int T;
		Scanner scan = new Scanner(System.in);

		int[] A = new int[5];
		int P;

		while(true){
			System.out.print("Input T: ");
			T = scan.nextInt();

			if(T<=0 || T>1000){
				System.out.println("T must be 1 <= T <= 1000");
			}else{
				break;
			}
		}

		while(T>0){
			for(int i=0;i<5;i++){
				while(true){
					A[i] = scan.nextInt();
					
					if(A[i]<0 || A[i]>24){
						System.out.println("A[" + i + "] must be 0 <= A[i] <= 24");
					}else{
						break;
					}
				}
			}

			while(true){
				System.out.print("Input P: ");
				P = scan.nextInt();

				if(P<=0 || P>24){
					System.out.println("P must be 1 <= P <= 24");
				}else{
					break;
				}
			}

			int sum = 0;

			for(int i=0;i<5;i++){
				sum += A[i];
			}

			if(P*sum > 120){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

			T--;
		}
	}
}