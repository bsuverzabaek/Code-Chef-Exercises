import java.util.Scanner;
import java.util.Arrays;

public class raceHorses{
	public static void main(String[] args) {
		int T;
		int N;
		int min;

		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>10){
				System.out.println("T must be 1 <= T <= 10");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				N = scan.nextInt();

				if(N<=1 || N>5000){
					System.out.println("N must be 2 <= N <= 5000");
				}else{
					break;
				}
			}

			int[] S = new int[N];

			for(int i=0;i<N;i++){
				while(true){
					S[i] = scan.nextInt();

					if(S[i]<=0 || S[i]>1000000000){
						System.out.println("S["+i+"] must be 1 <= S[i] <= 10^9");
					}else{
						break;
					}
				}
			}

			Arrays.sort(S);
			min = 1000000000;

			for(int i=1;i<N;i++){
				if(S[i]-S[i-1]<min){
					min = S[i]-S[i-1];
				}
			}

			System.out.println(min);

			T--;
		}
	}
}