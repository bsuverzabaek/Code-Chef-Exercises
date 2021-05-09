//run as java -ea doofMatrix
import java.util.Scanner;
import java.lang.Math;

public class doofMatrix{
	public static void main(String[] args){
		int T,N,count,sumN;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=2000) : "T must be 1 <= T <= 2000";

		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=2000) : "N must be 1 <= N <= 2000";

			sumN += (int)Math.pow(N,2);

			if(T==1){
				assert(sumN<=4000000) : "Sum of N^2 must be <=4*10^6";
			}

			if(N==1){
				System.out.println("Hooray");
				System.out.println(1);
			}else if(N%2!=0){
				System.out.println("Boo");
			}else{
				int[][] A = new int[N+1][N+1];

				for(int i=1;i<=N;i++){
					A[i][i] = 2*N-1;
				}

				count = -1;

				for(int i=1;i<=N-1;i++){
					if(i==N-2){
	                    if(i==1){
	                    	A[i][N]=1;
	                    }else{
	                    	A[i][N]=(A[i-1][N]+2)%(N-1);
	                    	break;
	                    }
	                }

	                if(count==-1){
	                    count=1;
	                    A[i][N]=N-1;
	                }else{
	                    count=A[i-1][i+1]+1;
	                    A[i][N]=(count-1)%(N-1);
	                }

	                for(int j=i+1;j<=N-1;j++){
	                    if(count==N){
	                   		count=1;
	                    	A[i][j]=count;
	                    	count++;
	                    }
	                }
				}

				for(int i=2;i<=N;i++){
	                for(int j=1;j<i;j++){
	                    A[i][j]=2*N-1-A[j][i];
	                }
	            }

	            System.out.println("Hooray");

	            for(int i=1;i<=N;i++){
	                for(int j=1;j<=N;j++){
	                	System.out.print(A[i][j] + " ");
	           	 	}
	                System.out.println();
	            }
			}

			T--;
		}
	}
}