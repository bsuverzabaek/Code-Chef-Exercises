import java.util.Scanner;

public class decInc{
	public static void main(String[] args) {
		int N;
		Scanner scan = new Scanner(System.in);

		while(true){
			N = scan.nextInt();

			if(N<0 || N>1000){
				System.out.println("N must be 0 <= N <= 1000");
			}else{
				break;
			}
		}

		if(N%4==0){
			System.out.println(N+1);
		}else{
			System.out.println(N-1);
		}
	}
}