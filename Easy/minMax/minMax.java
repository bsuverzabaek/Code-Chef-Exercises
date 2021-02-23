//run as java -ea minMax
import java.util.Scanner;

public class minMax{
	public static void main(String[] args){
		int T;
		long N,count;
		String K;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextLong();
			assert(N>=2 && N<=100000) : "N must be 2 <= N <= 10^5";

			K = scan.next();
			count = 0;

			for(int i=0;i<K.length();i++){
				count = (count*10+(K.charAt(i)-'0'))%N;
			}

			if(count>N-count){
				count = N-count;
			}

			if(count==N-count){
				System.out.println(2*count-1);
			}else{
				System.out.println(2*count);
			}

			T--;
		}
	}
}