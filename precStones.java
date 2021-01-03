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
				//String S;
				S = scan.next();

				if(S.length()<=0 || S.length()>100000){
					System.out.println("String S must be 1 <= S <= 10^5");
				}else{
					break;
				}
			}

			int N = S.length();
			Stack<Integer> A = new Stack<Integer>();
			int i = 0;

			while(i<N){
				int j = i + 1;

				while(j<N && S.charAt(i)==S.charAt(j)){
					j++;
				}

				A.push(j-i);
				i = j;
			}

			if(A.size()>1 && S.charAt(0)==S.charAt(N-1)){
				A.set(0,A.get(0)+A.get(A.size()-1));
				A.pop();
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
					//Stack<Integer> aCopy = new Stack<Integer>();
					//Object[] aCopy = A.toArray();
					Object aCopy = (Stack)A.clone();
					//aCopy = A.clone();
					aCopy.remove(B);
					/*for(int a=0;a<aCopy.length;a++){
						if(aCopy[i]==B){
							aCopy[i] = 0;
						}
					}*/
					int B1 = 0;
					
					for(int a=0;a<aCopy.length;a++){
						if(aCopy[i]>B1){
							B1 = aCopy[i];
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