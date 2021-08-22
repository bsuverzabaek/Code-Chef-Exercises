//run as java -ea chefIsland
import java.util.Scanner;

public class chefIsland{
	public static void main(String[] args){
		int T,x,y,xr,yr,D;
		float a,b;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=300) : "T must be 1 <= T <= 300";

		while(T>0){
			x = scan.nextInt();
			y = scan.nextInt();
			xr = scan.nextInt();
			yr = scan.nextInt();
			D = scan.nextInt();

			assert(x>=1 && x<=100) : "x must be 1 <= x <= 100";
			assert(y>=1 && y<=100) : "y must be 1 <= y <= 100";
			assert(xr>=1 && xr<=10) : "xr must be 1 <= xr <= 10";
			assert(yr>=1 && yr<=10) : "yr must be 1 <= yr <= 10";
			assert(D>=1 && D<=10) : "D must be 1 <= D <= 10";

			a = x/xr;
			b = y/yr;

			if(a>=D && b>=D){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			T--;
		}
	}
}