import java.util.Scanner;

public class puppySum{
	public static void main(String[] args) {
		int T,D,N,sum;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>16){
				System.out.println("T must be 1 <= T <= 16");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				D = scan.nextInt();
				N = scan.nextInt();

				if(D<=0 || D>4 || N<=0 || N>4){
					System.out.println("D and N must be 1 <= D,N <= 4");
				}else{
					break;
				}
			}

			sum = N;

			while(D>=1){
				sum = sum*(sum+1)/2;
				D--;
			}

			System.out.println(sum);

			T--;
		}
	}
}