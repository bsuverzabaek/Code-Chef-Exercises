#include <stdio.h>
#include <assert.h>

int max(int a,int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,A,B,num1,num2;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d %d",&A,&B);

		assert(A>=1 && A<=99);
		assert(B>=1 && B<=99);

		if(A/10!=0 && B/10!=0){
			num1 = (B%10)*10 + A%10 + (B-B%10)+(A/10);
			num2 = (A%10)*10 + B%10 + (A-A%10)+(B/10);
		}else if(A/10==0 && B/10!=0){
			num1 = A*10 + B%10 + B/10;
			num2 = 0;
		}else if(A/10!=0 && B/10==0){
			num1 = B*10 + A%10 + A/10;
			num2 = 0;
		}else{
			num1 = 0;
			num2 = 0;
		}

		printf("%d\n",max(A+B,max(num1,num2)));

		T--;
	}
	
	return 0;
}