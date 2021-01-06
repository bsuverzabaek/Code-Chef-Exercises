import java.util.Scanner;

public class greatRun{
	public static void main(String[] args) {
		int T;
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("Input T: ");
			T = scan.nextInt();

			if(T<=0 || T>10){
				System.out.println("T must be 1 <= T <= 10");
			}else{
				break;
			}
		}

		while(T>0){
			int N;
			int K;

			while(true){
				N = scan.nextInt();
				K = scan.nextInt();

				if(N>100 || N<K){
					System.out.println("N must be K <= N <= 100");
				}else if(K<=0 || K>N){
					System.out.println("K must be 1 <= K <= N");
				}else{
					break;
				}
			}

			int [] a = new int[N];

			for(int i=0;i<N;i++){
				while(true){
					a[i] = scan.nextInt();
					if(a[i]<=0 || a[i]>100){
						System.out.println("a["+i+"] must be 1 <= a[i] <= 100");
					}else{
						break;
					}
				}
			}

			int max = 0;

			for(int i=0;i<N-1;i++){
				if(a[i]+a[i+1]>max){
					max = a[i] + a[i+1];
				}
			}

			System.out.println(max);

			T--;
		}
	}
}