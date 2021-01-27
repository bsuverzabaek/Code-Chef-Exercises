//run as java -ea truthDare
import java.util.Scanner;

public class truthDare{
	public static void main(String[] args){
		int T,flag1,flag2;
		int tr,dr,ts,ds;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			tr = scan.nextInt();
			assert(tr>=1 && tr<=100) : "tr must be 1 <= tr <= 100";

			int[] Tr = new int[tr];

			for(int i=0;i<tr;i++){
				Tr[i] = scan.nextInt();
				assert(Tr[i]>=1 && Tr[i]<=100) : "Tr["+i+"] must be 1 <= Tr[i] <= 100";
			}

			dr = scan.nextInt();
			assert(dr>=1 && dr<=100) : "dr must be 1 <= dr <= 100";

			int[] Dr = new int[dr];

			for(int i=0;i<dr;i++){
				Dr[i] = scan.nextInt();
				assert(Dr[i]>=1 && Dr[i]<=100) : "Dr["+i+"] must be 1 <= Dr[i] <= 100";
			}

			ts = scan.nextInt();
			assert(ts>=1 && ts<=100) : "ts must be 1 <= ts <= 100";

			int[] Ts = new int[ts];

			for(int i=0;i<ts;i++){
				Ts[i] = scan.nextInt();
				assert(Ts[i]>=1 && Ts[i]<=100) : "Ts["+i+"] must be 1 <= Ts[i] <= 100";
			}

			ds = scan.nextInt();
			assert(ds>=1 && ds<=100) : "ds must be 1 <= ds <= 100";

			int[] Ds = new int[ds];

			for(int i=0;i<ds;i++){
				Ds[i] = scan.nextInt();
				assert(Ds[i]>=1 && Ds[i]<=100) : "Ds["+i+"] must be 1 <= Ds[i] <= 100";
			}

			flag1 = 0;

			for(int i=0;i<ts;i++){
				flag1 = 0;
				for(int j=0;j<tr;j++){
					if(Ts[i]==Tr[j]){
						flag1 = 1;
					}
				}
				if(flag1==0){
					break;
				}
			}

			flag2 = 0;

			for(int i=0;i<ds;i++){
				flag2 = 0;
				for(int j=0;j<dr;j++){
					if(Ds[i]==Dr[j]){
						flag2 = 1;
					}
				}
				if(flag2==0){
					break;
				}
			}

			if(flag1==0 || flag2==0){
				System.out.println("no");
			}else{
				System.out.println("yes");
			}

			T--;
		}
	}
}