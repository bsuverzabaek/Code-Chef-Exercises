#include <stdio.h>
#include <assert.h>
#include <stdlib.h>
#include <math.h>

double max(double a,double b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int N,X;
	double sum,max_sum,min_end,total;

	scanf("%d %d",&N,&X);

	assert(N>=1 && N<=1000);
	assert(abs(X)>=1 && abs(X)<=1000);

	sum = 0;
	double A[N];

	for(int i=0;i<N;i++){
		scanf("%lf",&A[i]);
		assert(fabs(A[i])<=1000);
		sum += A[i];
	}

	max_sum = -100000;
	min_end = -100000;

	for(int i=0;i<N;i++){
		if(min_end<0){
			min_end = A[i];
		}else{
			min_end += A[i];
		}

		max_sum = max(min_end,max_sum);
	}

	total = (sum-max_sum)+(max_sum/X);
	printf("%.2lf\n",total);
	
	return 0;
}