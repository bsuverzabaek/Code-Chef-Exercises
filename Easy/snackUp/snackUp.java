//run as java -ea snackUp
import java.util.Scanner;

public class snackUp{
	public static void main(String[] args){
		int T,N,r1,r2,shift;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=2 && N<=100) : "N must be 2 <= N <= 100";
			System.out.println(N);

			shift = 0;

			for(int i=0;i<N;i++){
				System.out.println(N);
				
				for(int j=0;j<N;j++){
					r1 = (j+shift)%N;
					r2 = (j+shift+1)%N;

					System.out.println((j+1) + " " + (r1+1) + " " + (r2+1));
				}
				shift += 2;
			}

			T--;
		}
	}
}