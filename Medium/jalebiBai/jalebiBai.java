//run as java -ea jalebiBai
import java.util.Scanner;

public class jalebiBai{
	public static void main(String[] args){
		int T,n1,n2,t,u;
		String s,s2;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=50) : "T must be 1 <= T <= 50";

		while(T>0){
			s = scan.next();
			s2 = scan.next();

			n1 = s.length();
			n2 = s2.length();

			assert(n1>=1 && n1<=50) : "Length of string s must be 1 <= |s| <= 50";
			assert(n2>=1 && n2<=50) : "Length of string t must be 1 <= |t| <= 50";

			t = 0;
			u = 0;

			char[] temp1 = new char[51];
			char[] temp2 = new char[51];

			for(int i=0;i<n1;i++){
				assert(s.charAt(i)>=97 && s.charAt(i)<=122) : "All characters must be lower case letters";

				if(i>0){
					if(s.charAt(i)!=s.charAt(i-1)){
						temp1[t] = s.charAt(i);
						t++;
					}
				}
			}

			for(int i=1;i<n2;i++){
				assert(s2.charAt(i)>=97 && s2.charAt(i)<=122) : "All characters must be lower case letters";

				if(i>0){
					if(s2.charAt(i)!=s2.charAt(i-1)){
						temp2[u] = s2.charAt(i);
						u++;
					}
				}
			}

			if(toString(temp1).equals(toString(temp2))==true){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

			T--;
		}
	}

	public static String toString(char[] a){
		String string = new String(a);
		return string;
	}
}