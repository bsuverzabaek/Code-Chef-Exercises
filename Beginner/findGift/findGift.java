//run as java -ea findGift
import java.util.Scanner;

public class findGift{
	public static void main(String[] args){
		int T,N,x,y;
		String S;
		char prev;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=1000) : "N must be 1 <= N <= 1000";

			S = scan.next();
			assert(S.length()==N) : "String S must have length N";

			for(int i=0;i<N;i++){
				assert(S.charAt(i)=='L' || S.charAt(i)=='R' || S.charAt(i)=='U' || S.charAt(i)=='D') : "String S must be made of L,R,U,D";
			}

			x = 0;
			y = 0;
			prev = S.charAt(0);

			for(int i=0;i<N;i++){
				if(i==0){
					if(S.charAt(i)=='R'){
						x++;
					}else if(S.charAt(i)=='L'){
						x--;
					}else if(S.charAt(i)=='U'){
						y++;
					}else if(S.charAt(i)=='D'){
						y--;
					}
				}else{
					if(prev=='U' && (S.charAt(i)=='U' || S.charAt(i)=='D')){
						prev = S.charAt(i);
					}else if(prev=='D' && (S.charAt(i)=='U' || S.charAt(i)=='D')){
						prev = S.charAt(i);
					}else if(prev=='L' && (S.charAt(i)=='L' || S.charAt(i)=='R')){
						prev = S.charAt(i);
					}else if(prev=='R' && (S.charAt(i)=='L' || S.charAt(i)=='R')){
						prev = S.charAt(i);
					}else if(prev=='U' && (S.charAt(i)!='U' && S.charAt(i)!='D')){
						if(S.charAt(i)=='R'){
							prev = S.charAt(i);
							x++;
						}else{
							prev = S.charAt(i);
							x--;
						}
					}else if(prev=='D' && (S.charAt(i)!='U' && S.charAt(i)!='D')){
						if(S.charAt(i)=='R'){
							prev = S.charAt(i);
							x++;
						}else{
							prev = S.charAt(i);
							x--;
						}
					}else if(prev=='L' && (S.charAt(i)!='L' && S.charAt(i)!='R')){
						if(S.charAt(i)=='U'){
							prev = S.charAt(i);
							y++;
						}else{
							prev = S.charAt(i);
							y--;
						}
					}else if(prev=='R' && (S.charAt(i)!='L' && S.charAt(i)!='R')){
						if(S.charAt(i)=='U'){
							prev = S.charAt(i);
							y++;
						}else{
							prev = S.charAt(i);
							y--;
						}
					}
				}
			}

			System.out.println(x + " " + y);

			T--;
		}	
	}
}