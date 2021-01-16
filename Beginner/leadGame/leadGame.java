import java.util.Scanner;
import java.lang.Math;

public class leadGame{
	public static void main(String[] args) {
		int N,max,sum1,sum2;
		Scanner scan = new Scanner(System.in);

		while(true){
			N = scan.nextInt();

			if(N<=0 || N>10000){
				System.out.println("N must be 1 <= N <= 10000");
			}else{
				break;
			}
		}

		int[] p1 = new int[N];
		int[] p2 = new int[N];

		max = 0;
		sum1 = 0;
		sum2 = 0;

		for(int i=0;i<N;i++){
			while(true){
				p1[i] = scan.nextInt();
				p2[i] = scan.nextInt();

				if(p1[i]<=0 || p1[i]>1000){
					System.out.println("p1["+i+"] must be 1 <= p1[i] <= 1000");
				}else if(p2[i]<=0 || p2[i]>1000){
					System.out.println("p2["+i+"] must be 1 <= p2[i] <= 1000");
				}else{
					break;
				}
			}

			sum1 += p1[i];
			sum2 += p2[i];

			if(Math.abs(sum1-sum2)>max){
				max = sum1 - sum2;
			}
		}

		if(max>0){
			System.out.println("1 " + Math.abs(max));
		}else{
			System.out.println("2 " + Math.abs(max));
		}
	}
}