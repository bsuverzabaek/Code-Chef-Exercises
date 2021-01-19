#include <stdio.h>

int gcd(int A,int B){
	if(A==0){
		return B;
	}else if(B==0){
		return A;
	}else{
		int rem = A%B;
		A = B;
		B = rem;
		return gcd(A,B);
	}
}

int lcm(int A,int B){
	int ans;
	int gcf = gcd(A,B);

	if(A%gcf==0){
		ans = A/gcf;
		ans *= B;
		return ans;
	}else{
		ans = B/gcf;
		ans *= A;
		return ans;
	}
}

int main(void){
	int T,A,B;

	while(1){
		scanf("%d",&T);

		if(T<=0 || T>1000){
			printf("T must be 1 <= T <= 1000\n");
		}else{
			break;
		}
	}

	while(T>0){

		while(1){
			scanf("%d %d",&A,&B);

			if(A<=0 || A>1000000 || B<=0 || B>1000000){
				printf("A and B must be 1 <= A,B <= 1000000\n");
			}else{
				break;
			}
		}

		printf("%d %d\n",gcd(A,B),lcm(A,B));

		T--;
	}

	return 0;
}