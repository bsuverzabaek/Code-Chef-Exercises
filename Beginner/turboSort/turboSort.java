import java.util.Scanner;
import java.util.Arrays;

public class turboSort{
	public static void main(String[] args) {
		int t;
		Scanner scan = new Scanner(System.in);

		while(true){
			t = scan.nextInt();

			if(t<=0 || t>1000000){
				System.out.println("t must be 1 <= t <= 10^6");
			}else{
				break;
			}
		}

		int[] N = new int[t];

		for(int i=0;i<t;i++){
			while(true){
				N[i] = scan.nextInt();

				if(N[i]<0 || N[i]>1000000){
					System.out.println("N["+i+"] must be 0 <= N[i] <= 10^6");
				}else{
					break;
				}
			}
		}

		Arrays.sort(N);
		System.out.println();

		for(int i=0;i<t;i++){
			System.out.println(N[i]);
		}
	}
}