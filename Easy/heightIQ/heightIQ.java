//run as java -ea heightIQ
import java.util.Scanner;

public class heightIQ{
	public static void main(String[] args){
		int T,N,stu,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=5) : "T must be 1 <= T <= 5";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=1000) : "N must be 1 <= N <= 10^3";

			int[] arr = new int[N];
			int[] height = new int[N];
			int[] iq = new int[N];

			for(int i=0;i<N;i++){
				height[i] = scan.nextInt();
				assert(height[i]>=1 && height[i]<=1000000000) : "height["+i+"] must be 1 <= height[i] <= 10^9";
				arr[i] = 1;
			}

			for(int i=0;i<N;i++){
				iq[i] = scan.nextInt();
				assert(iq[i]>=1 && iq[i]<=1000000000) : "iq["+i+"] must be 1 <= iq[i] <= 10^9";
			}

			ans = 1;
			stu = 1;

			while(stu<N){
				for(int i=0;i<stu;i++){
					if(height[i]<height[stu] && iq[i]>iq[stu]){
						arr[stu] = max(arr[stu],arr[i]+1);

						if(ans<arr[stu]){
							ans = arr[stu];
						}
					}
				}

				stu++;
			}

			System.out.println(ans);

			T--;
		}
	}

	public static int max(int a,int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
}