//run as java -ea multipleChoice
import java.util.Scanner;

public class multipleChoice{
	public static void main(String[] args){
		int T,N,num,score;
		String S,U;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";

			S = scan.next();
			U = scan.next();

			for(int i=0;i<N;i++){
				assert(S.charAt(i)=='A' || S.charAt(i)=='B' || S.charAt(i)=='C' || S.charAt(i)=='D') : "String S must be made up of A, B, C, or D";
				assert(U.charAt(i)=='A' || U.charAt(i)=='B' || U.charAt(i)=='C' || U.charAt(i)=='D' || U.charAt(i)=='N') : "String U must be made up of A, B, C, D, or N";
			}

			num = 0;
			score = 0;

			while(num<N){
				if(U.charAt(num)=='N'){
					num++;
				}else{
					if(S.charAt(num)==U.charAt(num)){
						score++;
						num++;
					}else{
						num += 2;
					}
				}
			}

			System.out.println(score);
			
			T--;
		}
	}
}