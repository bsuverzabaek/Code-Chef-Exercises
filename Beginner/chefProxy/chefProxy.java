//run as java -ea chefProxy
import java.util.Scanner;

public class chefProxy{
	public static void main(String[] args){
		int T,D,count,proxy,flag;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=200) : "T must be 1 <= T <= 200";

		while(T>0){
			D = scan.nextInt();
			assert(D>=1 && D<=1000) : "D must be 1 <= D <= 1000";

			String S;
			S = scan.next();

			for(int i=0;i<D;i++){
				assert(S.length()==D) : "String S must be length D";
				assert(S.charAt(i)=='A' || S.charAt(i)=='P') : "String S must be only A or P";
			}

			count = 0;
			proxy = 0;
			flag = 0;

			for(int i=0;i<D;i++){
				if(S.charAt(i)=='P'){
					count++;
				}
			}

			if(count>=(75*D+99)/100){
				System.out.println(proxy);
			}else{
				for(int i=2;i<D-2;i++){
					if((S.charAt(i-2)=='P'||S.charAt(i-1)=='P')&&(S.charAt(i+1)=='P'||S.charAt(i+2)=='P')&&S.charAt(i)=='A'){
						count++;
						proxy++;

						if(count>=(75*D+99)/100){
							flag = 1;
							System.out.println(proxy);
							break;
						}
					}
				}

				if(flag==0){
					System.out.println("-1");
				}
			}

			T--;
		}
	}
}