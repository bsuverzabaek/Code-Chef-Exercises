//run as java -ea oneZero
import java.util.Scanner;

public class oneZero{
	public static void main(String[] args){
		int T,N,sumN;
		int countS,countP,sumS,sumP,flag;
		String S,P;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";
		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";
			sumN += N;

			if(T==1){
				assert(sumN<=100000) : "Sum of N over test cases must be <=10^5";
			}

			S = scan.next();
			P = scan.next();

			countS = 0;
			countP = 0;
			sumS = 0;
			sumP = 0;
			flag = 1;

			for(int i=0;i<N;i++){
				assert(S.charAt(i)=='0' || S.charAt(i)=='1') : "String S must only have 0 or 1";
				assert(P.charAt(i)=='0' || P.charAt(i)=='1') : "String P must only have 0 or 1";

				if(S.charAt(i)=='1'){
					countS++;
				}

				if(P.charAt(i)=='1'){
					countP++;
				}
			}

			if(countS==countP){
				for(int i=0;i<N;i++){
					if(S.charAt(i)=='1'){
						sumS++;
					}

					if(P.charAt(i)=='1'){
						sumP++;
					}

					if(sumP>sumS){
						flag = 0;
						break;
					}
				}

				if(flag==1){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			}else{
				System.out.println("No");
			}

			T--;
		}
	}
}