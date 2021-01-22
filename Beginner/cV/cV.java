import java.util.Scanner;

public class cV{
	public static void main(String[] args) {
		int T,N,count;
		String S;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";

			S = scan.next();

			for(int i=0;i<S.length();i++){
				assert(S.charAt(i)>=97 && S.charAt(i)<=122) : "Each character must be lower case English letters";
			}

			count = 0;

			if(N==1){
				System.out.println(count);
			}else{
				for(int i=0;i<S.length()-1;i++){
					if(S.charAt(i)!='a' || S.charAt(i)!='e' || S.charAt(i)!='i' || S.charAt(i)!='o' || S.charAt(i)!='u'){
						if(S.charAt(i+1)=='a' || S.charAt(i+1)=='e' || S.charAt(i+1)=='i' || S.charAt(i+1)=='o' || S.charAt(i+1)=='u'){
							count++;
						}
					}
				}

				System.out.println(count);
			}

			T--;
		}
	}
}