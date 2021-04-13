//run as java -ea helpSoldier
import java.util.Scanner;

public class helpSoldier{
	public static void main(String[] args){
		int N,T,type,value,quality,min;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		T = scan.nextInt();

		assert(N>6 && N<101) : "N must be 6 < N < 101";
		assert(T>0 && T<1001) : "T must be 0 < T < 1001";

		int[] cost = new int[7];
		int[] qual = new int[7];

		for(int i=0;i<7;i++){
			cost[i] = 0;
			qual[i] = 0;
		}

		for(int i=0;i<N;i++){
			type = scan.nextInt();
			value = scan.nextInt();
			quality = scan.nextInt();

			assert(type>=1 && type<=6) : "Type must be 1 <= type <= 6";
			assert(value>0) : "Price must be >0";

			if(qual[type]<quality && T+cost[type]>value){
				qual[type] = quality;
				cost[type] = value;
				T = T+cost[type]-value;
			}
		}

		min = 99999;

		if(qual[1]==0){
			System.out.println(0);
		}else{
			min = qual[1];

			for(int i=2;i<7;i++){
				if(min>qual[i]){
					min = qual[i];
				}
			}

			System.out.println(min);
		}
	}
}