import java.util.Scanner;

public class closeTweet{
	public static void main(String[] args) {
		int N,K,x,count;
		String s;
		Scanner scan = new Scanner(System.in);

		while(true){
			N = scan.nextInt();
			K = scan.nextInt();

			if(N<=0 || N>1000 || K<=0 || K>1000){
				System.out.println("N and K must be 1 <= N,K <= 1000");
			}else{
				break;
			}
		}

		int[] tweet = new int[N];

		for(int i=0;i<N;i++){
			tweet[i] = 0;
		}

		count = 0;

		while(K>0){

			s = scan.next();

			if(s.equals("CLICK")==true){
				while(true){
					x = scan.nextInt();

					if(x<=0 || x>N){
						System.out.println("Tweet number must be 1 <= x <= N");
					}else{
						break;
					}
				}
				if(tweet[x-1]==0){
					count++;
					tweet[x-1] = 1;
				}else{
					count--;
					tweet[x-1] = 0;
				}
			}else if(s.equals("CLOSEALL")==true){
				count = 0;

				for(int i=0;i<N;i++){
					tweet[i] = 0;
				}
			}

			System.out.println(count);
			
			K--;
		}
	}
}