//run as java -ea cakeWalk
import java.util.Scanner;

public class cakeWalk{
	public static void main(String[] args){
		int T,count;
		int[][] times = new int[10][10];
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			count = 0;

			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					times[i][j] = scan.nextInt();
					assert(times[i][j]>=1 && times[i][j]<=60) : "Time must be 1 <= time <= 60";

					if(times[i][j]<=30){
						count++;
					}
				}
			}

			if(count>=60){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}

			T--;
		}
	}
}