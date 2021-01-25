//run as java -ea makeMeal
import java.util.Scanner;

public class makeMeal{
	public static void main(String[] args){
		int T,N,min,l;
		String S;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";

			int[] count = new int[6];
			for(int i=0;i<6;i++){
				count[i] = 0;
			}
			l = 0;

			for(int i=0;i<N;i++){
				S = scan.next();
				l += S.length();

				if(i==N-1){
					assert(l<=1000) : "Sum of strings' length must be at most 1000";
				}

				for(int j=0;j<S.length();j++){
					assert(S.charAt(j)>=97 && S.charAt(j)<=122) : "All strings must be made of lowercase English letters";

					if(S.charAt(j)=='c'){
						count[0]++;
					}else if(S.charAt(j)=='o'){
						count[1]++;
					}else if(S.charAt(j)=='d'){
						count[2]++;
					}else if(S.charAt(j)=='e'){
						count[3]++;
					}else if(S.charAt(j)=='h'){
						count[4]++;
					}else if(S.charAt(j)=='f'){
						count[5]++;
					}
				}
			}

			count[0] /= 2;
			count[3] /= 2;
			min = count[5];

			for(int i=0;i<6;i++){
				if(count[i]<min){
					min = count[i];
				}
			}

			System.out.println(min);

			T--; 
		}
	}
}