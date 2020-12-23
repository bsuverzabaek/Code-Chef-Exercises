import java.util.Scanner;

public class chefmean{
	public static void main(String[] args){
		int T;
		Scanner scan = new Scanner(System.in);

		System.out.print("Input T: ");
		T = scan.nextInt();

		while(T > 0){
			int N;
			System.out.print("Input N: ");
			N = scan.nextInt();

			int[] arr = new int[N];

			for(int i=0;i<N;i++){
				arr[i] = scan.nextInt();
			}

			int s;
			s = sum(arr,N);

			int count = 0;

			for(int i=0;i<N;i++){
				if(s*(N-1) == N*(s-arr[i])){
					if(count==0){
						System.out.println(i+1);
						count++;
					}
				}
			}

			if(count==0){
				System.out.println("Impossible");
			}

			T--;
		}

	}

	public static int sum(int[] arr,int N){
		int sum = 0;

		for(int i=0;i<N;i++){
			sum += arr[i];
		}

		return sum;
	}
}