//run as java -ea tableGame
import java.util.Scanner;

public class tableGame{
	public static void main(String[] args){
		int T,Q,sum,X,Y;
		String M,N;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		sum = 0;

		while(T>0){
			M = scan.next();
			N = scan.next();
			Q = scan.nextInt();

			sum += M.length()+N.length()+Q;

			assert(M.length()>=1 && M.length()<=100000) : "M must be 1 <= M <= 10^5";
			assert(N.length()>=1 && N.length()<=100000) : "N must be 1 <= N <= 10^5";
			assert(Q>=1 && Q<=100000) : "Q must be 1 <= Q <= 10^5";
			assert(sum<=1000000) : "Sum of N+M+Q must be <= 10^6";

			int[][] query = new int[Q][2];

			X = 0;
			Y = 0;

			for(int i=0;i<Q;i++){
				query[i][0] = scan.nextInt();
				query[i][1] = scan.nextInt();

				assert(query[i][0]>=1 && query[i][0]<=N.length()) : "X must be 1 <= X <= N";
				assert(query[i][1]>=1 && query[i][1]<=M.length()) : "Y must be 1 <= Y <= M";

				if(query[i][0]>X){
					X = query[i][0];
				}

				if(query[i][1]>Y){
					Y = query[i][1];
				}
			}

			int[] row1 = new int[Y+1];
			int[] col1 = new int[X+1];
			int[] row2 = new int[Y+1];
			int[] col2 = new int[X+1];

			if(M.charAt(0)=='0' || N.charAt(0)=='0'){
				row1[1] = 1;
				col1[1] = 1;
			}else{
				row1[1] = 0;
				col1[1] = 0;
			}

			for(int i=2;i<=Y;i++){
				if(row1[i-1]==1 && M.charAt(i-1)=='1'){
					row1[i] = 0;
				}else{
					row1[i] = 1;
				}
			}

			for(int i=2;i<=X;i++){
				if(col1[i-1]==1 && N.charAt(i-1)=='1'){
					col1[i] = 0;
				}else{
					col1[i] = 1;
				}
			}

			if(X>1){
				row2[1] = col1[2];

				for(int i=2;i<=Y;i++){
					if(row1[i]==1 && row2[i-1]==1){
						row2[i] = 0;
					}else{
						row2[i] = 1;
					}
				}
			}

			if(Y>1){
				col2[1] = row1[2];

				for(int i=2;i<=X;i++){
					if(col1[i]==1 && col2[i-1]==1){
						col2[i] = 0;
					}else{
						col2[i] = 1;
					}
				}
			}

			for(int i=0;i<Q;i++){
				X = query[i][0];
				Y = query[i][1];

				if(X==1){
					System.out.print(row1[Y]);
				}else if(Y==1){
					System.out.print(col1[X]);
				}else if(Y>X){
					System.out.print(row2[Y-X+2]);
				}else{
					System.out.print(col2[X-Y+2]);
				}
			}

			System.out.println();

			T--;
		}
	}
}