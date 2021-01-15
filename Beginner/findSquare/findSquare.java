import java.util.Scanner;
import java.lang.Math;
import java.io.*;

public class findSquare{
	public static void main(String[] args) {
		int T,N;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>20){
				System.out.println("T must be 1 <= T <= 20");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				N = scan.nextInt();

				if(N<=0 || N>10000){
					System.out.println("N must be 1 <= N <= 10000");
				}else{
					break;
				}
			}

			System.out.format("%.0f",Math.floor(Math.sqrt(N)));
			System.out.println();

			T--;
		}
	}
}