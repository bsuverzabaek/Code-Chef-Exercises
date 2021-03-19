//run as java -ea countSquares
import java.util.Scanner;

public class countSquares{
	public static void main(String[] args){
		int T,N,count;
		int x1,x2,x3,x4,y1,y2,y3,y4;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=4 && N<=500) : "N must be 4 <= N <= 500";

			int[] x = new int[500];
			int[] y = new int[500];
			int[][] p = new int[101][101];

			for(int i=0;i<101;i++){
				for(int j=0;j<101;j++){
					p[i][j] = 0;
				}
			}

			for(int i=0;i<N;i++){
				x[i] = scan.nextInt();
				y[i] = scan.nextInt();
				assert(x[i]>=-50 && x[i]<=50) : "All x must be -50 <= x <= 50";
				assert(y[i]>=-50 && y[i]<=50) : "All y must be -50 <= y <= 50";
				x[i] += 50;
				y[i] += 50;
				p[x[i]][y[i]] = 1;
			}

			count = 0;

			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					if(i!=j){
						x1 = x[i];
						y1 = y[i];

						x2 = x[j];
						y2 = y[j];

						x3 = x1+y1-y2;
						y3 = y1+x2-x1;

						x4 = x2+y1-y2;
						y4 = y2+x2-x1;

						if(x3>=0 && x3<=100){
							if(y3>=0 && y3<=100){
								if(x4>=0 && x4<=100){
									if(y4>=0 && y4<=100){
										if(p[x3][y3]==1 && p[x4][y4]==1){
											count++;
										}
									}
								}
							}
						}
					}
				}
			}

			System.out.println(count/4);

			T--;
		}
	}
}