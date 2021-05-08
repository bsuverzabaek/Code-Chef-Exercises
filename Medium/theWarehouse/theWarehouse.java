//run as java -ea theWarehouse
import java.util.Scanner;

public class theWarehouse{
	public static void main(String[] args){
		int T,n;
		String S;
		long min;
		Scanner scan = new Scanner(System.in);

		long[][] a = new long[6][3];
		long[] ans = new long[6];

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			S = scan.next();
			assert(S.length()>=1 && S.length()<=100000) : "Length of String S must be 1 <= |S| <= 10^5";

			n = S.length();

			for(int i=0;i<n;i++){
				assert(S.charAt(i)=='r' || S.charAt(i)=='g' || S.charAt(i)=='b') : "String S must have only r,g,b";
			}

			for(int i=0;i<6;i++){
				for(int j=0;j<3;j++){
					a[i][j] = 0;
				}
				ans[i] = 0;
			}

			for(int i=0;i<n;i++){
				if(S.charAt(i)=='r'){
					ans[0] += a[0][1]+a[0][2];
					ans[1] += a[1][1]+a[1][2];
					ans[2] += 0;
					ans[3] += 0;
					ans[4] += a[4][2];
					ans[5] += a[5][1];

					a[0][0] += 1;
					a[1][0] += 1;
					a[2][0] += 1;
					a[3][0] += 1;
					a[4][0] += 1;
					a[5][0] += 1;
				}else if(S.charAt(i)=='b'){
					ans[0] += a[0][2];
					ans[1] += 0;
					ans[2] += a[2][0]+a[2][2];
					ans[3] += a[3][0];
					ans[4] += a[4][0]+a[4][2];
					ans[5] += 0;

					a[0][1] += 1;
					a[1][1] += 1;
					a[2][1] += 1;
					a[3][1] += 1;
					a[4][1] += 1;
					a[5][1] += 1;
				}else{
					ans[0] += 0;
					ans[1] += a[1][1];
					ans[2] += a[2][0];
					ans[3] += a[3][0]+a[3][1];
					ans[4] += 0;
					ans[5] += a[5][0]+a[5][1];

					a[0][2] += 1;
					a[1][2] += 1;
					a[2][2] += 1;
					a[3][2] += 1;
					a[4][2] += 1;
					a[5][2] += 1;
				}
			}

			min = ans[0];

			for(int i=1;i<6;i++){
				if(min>ans[i]){
					min = ans[i];
				}
			}

			System.out.println(min);

			T--;
		}
	}
}