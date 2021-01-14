import java.util.Scanner;

public class serejaVote{
	public static void main(String[] args) {
		int T,N;
		int sum,over,count;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>50){
				System.out.println("T must be 1 <= T <= 50");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				N = scan.nextInt();

				if(N<=0 || N>10000){
					System.out.println("N must be 1 <= N <= 10000");
				}else{
					break;
				}
			}

			int[] B = new int[N];

			for(int i=0;i<N;i++){
				while(true){
					B[i] = scan.nextInt();

					if(B[i]<0 || B[i]>1000){
						System.out.println("B["+i+"] must be 0 <= B[i] <= 1000");
					}else{
						break;
					}
				}
			}

			sum = 0;
			over = 0;
			count = 0;

			for(int i=0;i<N;i++){
				if(B[i]>100){
					over = 1;
				}else if(B[i]>0){
					count++;
				}

				sum += B[i];
			}

			if(over==0 && sum-100>=0 && sum-100<count){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			T--;
		}
	}
}