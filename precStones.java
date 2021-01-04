//Problems when B=2 && segment length = 1
//If segment length is >8, exception in thread occurs

import java.util.*;

public class precStones{
	public static void main(String[] args) {
		int T;
		String S;
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("Input T: ");
			T = scan.nextInt();

			if(T<=0 || T>2500){
				System.out.println("T must be 1 <= T <= 2500");
			}else{
				break;
			}
		}

		for(int t=1;t<=T;t++){
			while(true){
				S = scan.next();

				if(S.length()<=0 || S.length()>100000){
					System.out.println("String S must be 1 <= S <= 10^5");
				}else{
					break;
				}
			}

			int N = S.length();
			Vector<Integer> A = new Vector<Integer>(N);
			int i = 0;

			while(i<N){
				int j = i + 1;

				while(j<N && S.charAt(i)==S.charAt(j)){
					j++;
				}

				A.add(j-i);
				i = j;
			}

			if(A.size()>1 && S.charAt(0)==S.charAt(N-1)){
				A.set(0,A.get(0)+A.get(A.size()-1));
				A.remove(A.size()-1);
			}

			int B = 0;
			for(int a=0;a<A.size();a++){
				if(A.get(a)>B){
					B = A.get(a);
				}
			}

			int ans;

			if(A.size()==1){
				if(B==1){
					ans = 1;
				}else{
					ans = B-1;
				}
			}else{
				if(B==1){
					if(A.size()==2){
						ans = 2;
					}else{
						ans = 3;
					}
				}else if(B==2){
					if(A.size()==1){
						ans = 2;
					}else{
						ans = 3;
					}
				}else{
					//Object aCopy = (Vector)A.clone();
					Vector<Integer> aCopy = new Vector<Integer>(N);
					for(int a=0;a<A.size();a++){
						aCopy.set(i,A.get(i));
					}
				
					aCopy.remove(B);
				
					int B1 = 0;
					
					for(int a=0;a<aCopy.size();a++){
						if(aCopy.get(i)>B1){
							B1 = aCopy.get(i);
						}
					}

					if((B/2)>B1){
						ans = B/2;
					}else{
						ans = B1;
					}
				}
			}

			System.out.println("Case "+t+": "+ans);
		}
	}
}