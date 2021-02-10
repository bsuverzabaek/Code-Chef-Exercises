//run as java -ea helpLira
import java.util.Scanner;
import java.lang.Math;

public class helpLira{
	public static void main(String[] args){
		int N,ans,max,min,max_index,min_index;
		int x1,x2,x3,y1,y2,y3;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		assert(N>=2 && N<=100) : "N must be 2 <= N <= 100";

		min = 10000;
		max = -1;

		min_index = 0;
		max_index = 0;

		for(int i=0;i<N;i++){
			x1 = scan.nextInt();
			y1 = scan.nextInt();
			x2 = scan.nextInt();
			y2 = scan.nextInt();
			x3 = scan.nextInt();
			y3 = scan.nextInt();

			assert(x1>=-1000 && x1<=1000 && x2>=-1000 && x2<=1000 && x3>=-1000 && x3<=1000) : "x's must be -1000 <= x <= 1000";
			assert(y1>=-1000 && y1<=1000 && y2>=-1000 && y2<=1000 && y3>=-1000 && y3<=1000) : "y's must be -1000 <= y <= 1000";

			ans = x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2);
			ans = Math.abs(ans)/2;

			if(ans>=max){
				max = ans;
				max_index = i;
			}

			if(ans<=min){
				min = ans;
				min_index = i;
			}	
		}

		System.out.println((min_index+1) + " " + (max_index+1));
	}
}