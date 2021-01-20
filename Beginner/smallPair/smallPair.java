import java.util.Scanner;
import java.util.Arrays;

public class smallPair{
	public static void main(String[] args) {
		int T,N;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0){
				System.out.println("T must be greater than 0");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				N = scan.nextInt();

				if(N<=1){
					System.out.println("N must be greater than 1");
				}else{
					break;
				}
			}

			int[] a = new int[N];

			for(int i=0;i<N;i++){
				while(true){
					a[i] = scan.nextInt();

					if(a[i]<=0 || a[i]>1000000){
						System.out.println("a["+i+"] must be 1 <= a[i] <= 10^6");
					}else{
						break;
					}
				}
			}

			Arrays.sort(a);

			System.out.println(a[0]+a[1]);

			T--;
		}
	}
}