#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int N,count,l,r;

	while(1){
		scanf("%d",&N);
		assert((N>=3 && N<=2000) || N==0);
		
		count = 0;

		if(N==0){
			break;
		}else{
			int L[N];

			for(int i=0;i<N;i++){
				scanf("%d",&L[i]);
				assert(L[i]>=1 && L[i]<=1000000);
			}

			qsort(L,N,sizeof(int),compare);

			for(int i=N-1;i>=1;i--){
				l = 0;
				r = N-1;

				while(l<r){
					if(L[l]+L[r]<L[i]){
						count += r-l;
						l++;
					}else{
						r--;
					}
				}
			}

			printf("%d\n",count);
		}
	}

	return 0;
}