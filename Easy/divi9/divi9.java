//run as java -ea divi9
import java.util.Scanner;

public class divi9{
	public static void main(String[] args){
		int T,sum,M;
		String N;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			N = scan.next();
			sum = 0;

			for(int i=0;i<N.length();i++){
				sum += (N.charAt(i)-'0');
			}

			M = sum%9;

			if((N.length()>1 && sum<9) || (M>(9-M))){
				System.out.println(9-M);
			}else{
				System.out.println(M);
			}

			T--;
		}
	}
}