//run as java -ea magicSchool
import java.util.Scanner;
import java.lang.Math;

public class magicSchool{
	public static void main(String[] args){
		int T,N,a,b,c,d,flag;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=50) : "T must be 1 <= T <= 50";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			int[] A = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=0 && A[i]<=100000) : "Each count must be 0 <= count <= 10^5";
			}

			if(N==1){
				System.out.println(-1);
			}else{
				a = -1;
				b = -1;
				c = 0;
				d = 0;
				flag = 0;

				for(int i=0;i<N;i++){
					if(a==-1){
						a = A[i];
					}else{
						if(A[i]!=a && A[i]!=b){
							if(b==-1){
								b = A[i];
							}else{
								flag = -1;
							}
						}
					}

					if(A[i]==a){
						c++;
					}

					if(A[i]==b){
						d++;
					}
				}

				if(flag==-1){
					System.out.println(-1);
					continue;
				}else{
					if(b==-1){
						if(a==0){
							System.out.println(N);
						}else if(a==N-1){
							System.out.println(0);
						}else{
							System.out.println(-1);
						}
					}else{
						if(a>b){
							if(Math.abs(a-b)==1 && max(a,b)<=N-1 && d==a && c+d==N){
								System.out.println(N-max(a,b));
							}else{
								System.out.println(-1);							}
						}else{
							if(Math.abs(a-b)==1 && max(a,b)<=N-1 && c==b && c+d==N){
								System.out.println(N-max(a,b));
							}else{
								System.out.println(-1);
							}
						}
					}
				}
			}

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