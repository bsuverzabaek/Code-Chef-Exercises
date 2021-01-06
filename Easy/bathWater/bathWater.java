import java.util.Scanner;

public class bathWater{
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("Input n: ");
			n = scan.nextInt();

			if(n<=0 || n>100000){
				System.out.println("n must be 1 <= n <= 10^5");
			}else{
				break;
			}
		}

		while(n>0){
			int v1, v2, v3, t1, t2, t3;

			while(true){
				v1 = scan.nextInt();
				t1 = scan.nextInt();
				v2 = scan.nextInt();
				t2 = scan.nextInt();
				v3 = scan.nextInt();
				t3 = scan.nextInt();

				if(v1<=0 || v1>1000000 || v2<=0 || v2>1000000 || v3<=0 || v3>1000000){
					System.out.println("Volume must be 1 <= v1,v2,v3 <= 10^6");
				}else if(t1<=0 || t1>=t2 || t2<=t1 || t2>1000000){
					System.out.println("Temperature must be 1 <= t1 < t2 <= 10^6");
				}else if(t3<=0 || t3>1000000){
					System.out.println("t3 must be 1 <= t3 <= 10^6");
				}else{
					break;
				}
			}

			if(v1>=v3*(v1/(v1+v2)) && v2>=v3*(v2/(v1+v2)) && t3==((v1*t1)+(v2*t2))/(v1+v2)){
				System.out.println("YES");
			}else if((v1==v3 && t1==t3) || (v2==v3 && t2==t3)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			n--;
		}
	}
}