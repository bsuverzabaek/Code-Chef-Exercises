import java.util.Scanner;

public class threeWay{
	public static void main(String[] args) {
		int T,R,pair;
		int[] x = new int[3];
		int[] y = new int[3];
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>100){
				System.out.println("T must be 1 <= T <= 100");
			}else{
				break;
			}
		}

		while(T>0){


			while(true){
				R = scan.nextInt();

				if(R<=0 || R>1000){
					System.out.println("R must be 1 <= R <= 1000");
				}else{
					break;
				}
			}

			while(true){
				x[0] = scan.nextInt();
				y[0] = scan.nextInt();

				if(x[0]<-10000 || x[0]>10000 || y[0]<-10000 || y[0]>10000){
					System.out.println("x1 and y1 must be -10000 <= x1,y1 <= 10000");
				}else{
					break;
				}
			}

			while(true){
				x[1] = scan.nextInt();
				y[1] = scan.nextInt();

				if(x[1]<-10000 || x[1]>10000 || y[1]<-10000 || y[1]>10000){
					System.out.println("x1 and y1 must be -10000 <= x1,y1 <= 10000");
				}else{
					break;
				}
			}

			while(true){
				x[2] = scan.nextInt();
				y[2] = scan.nextInt();

				if(x[2]<-10000 || x[2]>10000 || y[2]<-10000 || y[2]>10000){
					System.out.println("x1 and y1 must be -10000 <= x1,y1 <= 10000");
				}else{
					break;
				}
			}

			pair = 0;

			for(int i=0;i<2;i++){
				if(dist(x[i],y[i],x[i+1],y[i+1])<=R*R){
					pair++;
				}
			}

			if(pair>1){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}

			T--;
		}
	}

	public static int dist(int x1,int y1,int x2,int y2){
		return ((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2));
	}
}