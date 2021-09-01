//run as java -ea passMarks
import java.util.Scanner;

public class passMarks{
	public static void main(String[] args){
		int T,aMin,bMin,cMin,tMin,A,B,C;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			aMin = scan.nextInt();
			bMin = scan.nextInt();
			cMin = scan.nextInt();
			tMin = scan.nextInt();
			A = scan.nextInt();
			B = scan.nextInt();
			C = scan.nextInt();

			assert(aMin>=1 && aMin<=100) : "aMin must be 1 <= aMin <= 100";
			assert(bMin>=1 && bMin<=100) : "bMin must be 1 <= bMin <= 100";
			assert(cMin>=1 && cMin<=100) : "cMin must be 1 <= cMin <= 100";
			assert(A>=1 && A<=100) : "A must be 1 <= A <= 100";
			assert(B>=1 && B<=100) : "B must be 1 <= B <= 100";
			assert(C>=1 && C<=100) : "C must be 1 <= C <= 100";
			//assert(tMin>=aMin+bMin+cMin && tMin<=300) : "tMin must be aMin+bMin+cMin <= tMin <= 300";

			if(A>=aMin && B>=bMin && C>=cMin && (A+B+C)>=tMin){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			T--;
		}
	}
}