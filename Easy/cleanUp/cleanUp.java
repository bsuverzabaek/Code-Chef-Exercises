import java.util.Scanner;
import java.util.Arrays;

public class cleanUp{
	public static void main(String[] args) {
		int T;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>50){
				System.out.println("T must be 1 <= T <= 50");
			}else{
				break;
			}
		}

		int n;
		int m;

		while(T>0){

			while(true){
				n = scan.nextInt();
				m = scan.nextInt();

				if(m<0 || m>n){
					System.out.println("m must be 0 <= m <= n");
				}else if(n<m || n>1000){
					System.out.println("n must be m <= n <= 1000");
				}else{
					break;
				}
			}

			int[] done = new int[m];

			for(int i=0;i<m;i++){
				while(true){
					done[i] = scan.nextInt();

					if(done[i]<1 || done[i]>n){
						System.out.println("done["+i+"] must be 1 <= done[i] <= n");
					}else{
						break;
					}
				}
			}

			boolean[] arr = new boolean[n];

			Arrays.sort(done);

			for(int i=0;i<m;i++){
				done[i]--;
			}

			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					if(done[i]==j){
						arr[j]=true;
					}
				}
			}

			int count = 0;

			for(int i=0;i<n;i++){
				if(arr[i]==false){
					count++;
					if(count%2!=0){
						System.out.print(i+1+ " ");
					}
				}
			}

			System.out.println();
			count = 0;

			for(int i=0;i<n;i++){
				if(arr[i]==false){
					count++;
					if(count%2==0){
						System.out.print(i+1+ " ");
					}
				}
			}

			System.out.println();

			T--;
		}
	}
}