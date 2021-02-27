#include <stdio.h>
#include <assert.h>

int main(void){
	int T,sumN;
	long long int N,X,p,k,a,lct,xct;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	sumN = 0;

	while(T>0){
		scanf("%lld %lld %lld %lld",&N,&X,&p,&k);

		assert(p>=1 && p<=N && k>=1 && k<=N);
		assert(X>=0 && X<=1000000000);

		sumN += N;

		if(T==1){
			assert(sumN<=400000);
		}

		lct = 0;
		xct = 0;

		for(long long int i=0;i<N;i++){
			scanf("%lld",&a);
			assert(a>=0 && a<=1000000000);

			if(a<X){
				lct++;
			}

			if(a==X){
				xct++;
			}
		}

		if(p>lct && p<=lct+xct){
			printf("0\n");
		}else{
			if((k>p && lct+1>p) || (k<p && lct+xct<p)){
				printf("-1\n");
			}else{
				if(p<=lct){
					printf("%lld\n",(lct-p+1));
				}else{
					printf("%lld\n",(p-xct-lct));
				}
			}
		}

		T--;
	}
	
	return 0;
}