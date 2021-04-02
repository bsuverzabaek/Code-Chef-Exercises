#include <stdio.h>
#include <assert.h>

int min(int A,int B){
	if(A<B){
		return A;
	}else{
		return B;
	}
}

int pour(int A,int B,int C){
	int move = 1;
	int a = A;
	int b = 0;
	int tfr;

	while(a!=C && b!=C){
		tfr = min(a,B-b);
		b += tfr;
		a -= tfr;
		move++;

		if(a==C || b==C){
			break;
		}

		if(a==0){
			a = A;
			move++;
		}

		if(b==B){
			b = 0;
			move++;
		}
	}

	return move;
}

int gcd(int A,int B){
	if(B==0){
		return A;
	}

	return gcd(B,A%B);
}

int main(void){
	int T,A,B,C;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&A);
		assert(A<=40000);

		scanf("%d",&B);
		assert(B<=40000);

		scanf("%d",&C);
		assert(C<=40000);

		if(C>A && C>B){
			printf("-1\n");
		}else if(C%gcd(A,B)!=0){
			printf("-1\n");
		}else if(C==A || C==B){
			printf("1\n");
		}else{
			printf("%d\n",min(pour(A,B,C),pour(B,A,C)));
		}

		T--;
	}
	
	return 0;
}