import java.util.Scanner;
import java.lang.System;

public class covidSpread{
	public static void main(String[] args) {
		int T,N;
		int l,best,worst,num;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>2000){
				System.out.println("T must be 1 <= T <= 2000");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				N = scan.nextInt();

				if(N<=1 || N>8){
					System.out.println("N must be 2 <= N <= 8");
				}else{
					break;
				}
			}

			int[] X = new int[N];

			for(int i=0;i<N;i++){
				while(true){
					X[i] = scan.nextInt();

					if(X[i]<0 || X[i]>10){
						System.out.println("X["+i+"] must be 0 <= X[i] <= 10");
					}else{
						break;
					}
				}
			}

			for(int i=0;i<N-1;i++){
				if(X[i]>=X[i+1]){
					System.out.println("Each X[i] must be less than X[i+1]");
					System.exit(0);
				}
			}

			l = 0;
			best = N;
			worst = 0;

			for(int i=0;i<N;i++){
				if(i!=0 && X[i]-X[i-1]>2){
					l = i;
				}
				if(i+1==N || X[i+1]-X[i]>2){
					num = i - l + 1;
					best = min(best,num);
					worst = max(worst,num);
				}
			}

			System.out.println(best + " " + worst);

			T--;
		}
	}

	public static int min(int best,int num){
		if(best<num){
			return best;
		}else{
			return num;
		}
	}

	public static int max(int worst,int num){
		if(worst>num){
			return worst;
		}else{
			return num;
		}
	}
}