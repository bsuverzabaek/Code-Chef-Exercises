//run as java -ea chairs
import java.util.Scanner;

public class chairs{
	public static void main(String[] args){
		int T,N,sumN,count,flag,con,len;
		String chairs;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=5000) : "T must be 1 <= T <= 5000";

		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			sumN += N;

			if(T==1){
				assert(sumN>=1 && sumN<=1000000) : "Sum of N must be 1 <= sumN <= 10^6";
			}

			chairs = scan.next();
			count = 0;
			flag = 0;

			for(int i=0;i<N;i++){
				if(chairs.charAt(i)=='0'){
					count++;
				}

				if(chairs.charAt(i)=='1'){
					flag = 1;
				}
			}

			assert(flag==1) : "There must be at least one chair occupied";
			con = 0;

			for(int i=0;i<N;i++){
				if(chairs.charAt(i)=='0' && chairs.charAt((i+N-1)%N)=='1'){
					len = 1;

					while(chairs.charAt((i+1)%N)=='0'){
						len++;
						i++;
					}

					con = max(con,len);
				}
			}

			System.out.println(count-con);

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