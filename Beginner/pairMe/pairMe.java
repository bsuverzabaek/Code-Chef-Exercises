//run as java -ea pairMe
import java.util.Scanner;
import java.util.Arrays;

public class pairMe{
	public static void main(String[] args){
		int T;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();

		while(T>0){
			int[] a = new int[3];

			for(int i=0;i<3;i++){
				a[i] = scan.nextInt();
				assert(a[i]>=1 && a[i]<=1000) : "Each value must be 1 <= a <= 1000";
			}

			Arrays.sort(a);

			if(a[0]+a[1]==a[2]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			T--;
		}
	}
}