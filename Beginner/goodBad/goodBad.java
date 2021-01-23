//run as java -ea goodBad
import java.util.Scanner;

public class goodBad{
	public static void main(String[] args){
		int T,N,K,chef,bro;
		String s;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();

			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";
			assert(K>=0 && K<=N) : "K must be 0 <= K <= N";

			s = scan.next();
			assert(s.length()==N) : "String s must be of length N";

			for(int i=0;i<N;i++){
				assert((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)) : "String s must be upper or lower case English letters";
			}

			chef = 0;
			bro = 0;

			for(int i=0;i<N;i++){
				if(s.charAt(i)>=65 && s.charAt(i)<=90){
					chef++;
				}else{
					bro++;
				}
			}

			if(chef<=K && bro>K){
				System.out.println("chef");
			}else if(bro<=K && chef>K){
				System.out.println("brother");
			}else if(chef<=K && bro<=K){
				System.out.println("both");
			}else{
				System.out.println("none");
			}

			T--;
		}
	}
}