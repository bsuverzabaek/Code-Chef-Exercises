//run as java -ea lifeLimited
import java.util.Scanner;

public class lifeLimited{
	public static void main(String[] args){
		int T,flag;
		String S;
		char[][] logo = new char[3][3];
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			for(int i=0;i<3;i++){
				S = scan.next();
				logo[i][0] = S.charAt(0);
				logo[i][1] = S.charAt(1);
				logo[i][2] = S.charAt(2);
			}

			flag = 0;

			for(int i=0;i<2;i++){
				for(int j=0;j<2;j++){
					if(logo[i][j]=='l'){
						if(logo[i+1][j]=='l'){
							if(logo[i+1][j+1]=='l'){
								flag = 1;
								System.out.println("yes");
								break;
							}
						}
					}
				}
				if(flag==1){
					break;
				}
			}

			if(flag==0){
				System.out.println("no");
			}

			T--;
		}
	}
}