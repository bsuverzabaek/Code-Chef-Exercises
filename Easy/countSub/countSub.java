import java.util.Scanner;
import java.lang.System;

public class countSub{
	public static void main(String[] args) {
		int T,N,sum;
		long ans,count;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>100000){
				System.out.println("T must be 1 <= T <= 10^5");
			}else{
				break;
			}
		}

		sum = 0;

		while(T>0){

			while(true){
				N = scan.nextInt();

				if(N<=0 || N>100000){
					System.out.println("N must be 1 <= N <= 10^5");
				}else{
					break;
				}
			}

			sum += N;

			if(T==1 && sum>100000){
				System.out.println("The sum of N over all test cases must be <= 10^5");
				System.exit(0);
			}

			String s = scan.next();

			if(s.length()>N){
				String cut = s.substring(0,N);
				s = cut;
			}

			ans = 0;
			count = 0;

			for(int i=0;i<N;i++){
				if(s.charAt(i)=='1'){
					count++;
				}
			}

			ans = (count*(count+1))/2;
			System.out.println(ans);

			T--;
		}
	}
}