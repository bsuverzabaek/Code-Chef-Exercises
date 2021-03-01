#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int T,N,K,i,j,num,sum1,sum2;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d",&N,&K);

		assert(N>=1 && N<=10000);
		assert(K>=0 && K<=10000);

		int l1 = (N+1)/2;
		int l2 = N/2;

		int motu[l1];
		int tomu[l2];

		i = 0;
		j = 0;

		for(int a=1;a<=N;a++){
			scanf("%d",&num);
			assert(num>=1 && num<=10000);

			if(a%2!=0){
				motu[i] = num;
				i++;
			}else{
				tomu[j++] = num;
			}
		}

		qsort(motu,l1,sizeof(int),compare);
		qsort(tomu,l2,sizeof(int),compare);

		i = l1-1;
		j = 0;

		while(K>0){
			if(motu[i]>tomu[j]){
				K--;

				int t = motu[i];
				motu[i] = tomu[j];
				tomu[j] = t;

				i--;
				j++;
			}else{
				break;
			}
		}

		sum1 = 0;
		sum2 = 0;

		for(i=0;i<l1;i++){
			sum1 += motu[i];
		}

		for(j=0;j<l2;j++){
			sum2 += tomu[j];
		}

		if(sum2>sum1){
			printf("YES\n");
		}else{
			printf("NO\n");
		}

		T--;
	}
	
	return 0;
}