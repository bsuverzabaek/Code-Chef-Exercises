#include <stdio.h>
#include <assert.h>

int main(void){
	int N,min,temp,temp2,sum;

	scanf("%d",&N);
	assert(N>=1 && N<=1000);

	int c[N];
	int t[N];

	for(int i=0;i<N;i++){
		scanf("%d",&c[i]);
		assert(c[i]>=1 && c[i]<=100000);
	}

	for(int i=0;i<N;i++){
		scanf("%d",&t[i]);
		assert(t[i]>=1 && t[i]<=3);
	}

	min = 1000000;
	temp = 1000000;
	temp2 = 1000000;

	for(int i=0;i<N;i++){
		if(t[i]==1 && c[i]<temp){
			temp = c[i];
		}else if(t[i]==2 && c[i]<temp2){
			temp2 = c[i];
		}else if(t[i]==3 && c[i]<min){
			min = c[i];
		}
	}

	sum = temp + temp2;

	if(min<sum){
		printf("%d\n",min);
	}else{
		printf("%d\n",sum);
	}

	return 0;
}