//run as java -ea lightRect
import java.util.Scanner;

public class lightRect{
	public static void main(String[] args){
		int T,K,N;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=5000) : "T must 1 <= T <= 5000";

		while(T>0){
			K = scan.nextInt();
			N = scan.nextInt();

			assert(K>=1 && K<=100) : "K must be 1 <= K <= 100";
			assert(N>=1 && N<=1000000000) : "N must be 1 <= N <= 10^9";

			int[] x = new int[K];
			int[] y = new int[K];

			for(int i=0;i<K;i++){
				x[i] = scan.nextInt();
				y[i] = scan.nextInt();

				assert(x[i]>=0 && x[i]<=N-1) : "x must be 0 <= x <= N-1";
				assert(y[i]>=0 && y[i]<=N-1) : "y must be 0 <= y <= N-1";
			}

			if(K==1){
				if((x[0]==0 || x[0]==N-1) && (y[0]==0 || y[0]==N-1)){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}else if(K==2){
				if((x[0]==0 || x[0]==N-1) && (y[0]==0 || y[0]==N-1)){
					System.out.println("yes");
				}else if((x[1]==0 || x[1]==N-1) && (y[1]==0 || y[1]==N-1)){
					System.out.println("yes");
				}else if((y[0]==0 || y[0]==N-1) && (y[1]==0 || y[1]==N-1)){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}else if(K==3){
				if((x[0]==0 || x[0]==N-1) && ((y[0]>=y[1] && y[0]>=y[2]) || (y[0]<=y[1] && y[0]<=y[2]))){
					System.out.println("yes");
				}else if((y[0]==0 || y[0]==N-1) && ((x[0]>=x[1] && x[0]>=x[2]) || (x[0]<=x[1] && x[0]<=x[2]))){
					System.out.println("yes");
				}else if((x[1]==0 || x[1]==N-1) && ((y[1]>=y[0] && y[1]>=y[2]) || (y[1]<=y[0] && y[1]<=y[2]))){
					System.out.println("yes");
				}else if((y[1]==0 || y[1]==N-1) && ((x[1]>=x[0] && x[1]>=x[2]) || (x[1]<=x[0] && x[1]<=x[2]))){
					System.out.println("yes");
				}else if((x[2]==0 || x[2]==N-1) && ((y[2]>=y[0] && y[2]>=y[1]) || (y[2]<=y[0] && y[2]<=y[1]))){
					System.out.println("yes");
				}else if((y[2]==0 || y[2]==N-1) && ((x[2]>=x[0] && x[2]>=x[1]) || (x[2]<=x[0] && x[2]<=x[1]))){
					System.out.println("yes");
				}else if((x[2]==0 || x[2]==N-1) && ((y[1]==0 || y[1]==N-1) || (y[0]==0 || y[0]==N-1))){
					System.out.println("yes");
				}else if((x[1]==0 || x[1]==N-1) && ((y[2]==0 || y[2]==N-1) || (y[0]==0 || y[0]==N-1))){
					System.out.println("yes");
				}else if((x[0]==0 || x[0]==N-1) && ((y[1]==0 || y[1]==N-1) || (y[2]==0 || y[2]==N-1))){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}else if(K>=4){
				System.out.println("yes");
			}

			T--;
		}
	}
}