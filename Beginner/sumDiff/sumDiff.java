import java.util.Scanner;

public class sumDiff{
	public static void main(String[] args){
		int N1,N2;
		Scanner scan = new Scanner(System.in);

		while(true){
			N1 = scan.nextInt();
			N2 = scan.nextInt();

			if(N1<-1000 || N1>1000){
				System.out.println("N1 must be -1000 <= N1 <= 1000");
			}else if(N2<-1000 || N2>1000){
				System.out.println("N2 must be -1000 <= N2 <= 1000");
			}else{
				break;
			}
		}

		if(N1>N2){
			System.out.println(N1-N2);
		}else{
			System.out.println(N1+N2);
		}
	}
}