//run as java -ea precStones
import java.util.*;
import java.io.*;

public class precStones{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder("");
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		assert(T>=1 && T<=2500);

		char[] S,pat;
		int[] a;
		int index,size,n;

		for(int ca=1;ca<=T;ca++){
			S = br.readLine().toCharArray();
			n = S.length;

			assert(n>=1 && n<=100000);
			for(int i=0;i<n;i++){
				assert(S[i]=='A' || S[i]=='R');
			}


			pat = new char[n];
			a = new int[n];
			size = 0;

			out = out.append("Case "+ca+": ");

			for(int i=0;i<n;i++){
				char c = S[i];

				while(i<n && S[i]==c){
					a[size]++;
					i++;
				}

				i--;
				pat[size++] = c;
			}

			if(size==1){
				out = out.append((a[0]==1?1:a[0]-1)+"\n");
				continue;
			}

			if(size!=1 && pat[size-1]==pat[0]){
				a[0] += a[size-1];
				size--;
			}

			index = 0;

			for(int i=1;i<size;i++){
				if(a[i]>a[index]){
					index = i;
				}
			}

			if(a[index]==1){
				out = out.append(size==2?"2\n":"3\n");
				continue;
			}

			if(a[index]==2){
				boolean flag = true;

				for(int i=0;flag && i<size;i++){
					flag = !(a[i]==2 && (a[(i-1+size)%size]==1 || a[(i+1)%size]==1));
				}

				out = out.append(flag?"3\n":"2\n");
				continue;
			}

			a[index] /= 2;
			index = 0;

			for(int i=0;i<size;i++){
				index = (int)Math.max(index,a[i]);
			}

			out = out.append(index+"\n");
		}

		System.out.print(out);
	}
}