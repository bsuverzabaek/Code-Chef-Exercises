//run as java -ea thatMyScore
import java.util.Scanner;

public class thatMyScore{
	public static void main(String[] args){
		int T,N,p,s,sum;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=1000) : "N must be 1 <= N <= 1000";

			int[] arr = new int[8];

			for(int i=0;i<8;i++){
				arr[i] = 0;
			}

			while(N>0){
				p = scan.nextInt();
				s = scan.nextInt();

				assert(p>=1 && p<=11) : "p must be 1 <= p <= 11";
				assert(s>=0 && s<=100) : "s must be 0 <= s <= 100";

				if(p<=8){
					if(arr[p-1]==0 || arr[p-1]<s){
						arr[p-1] = s;
					}
				}

				N--;
			}

			sum = 0;

			for(int i=0;i<8;i++){
				sum += arr[i];
			}

			System.out.println(sum);

			T--;
		}
	}
}