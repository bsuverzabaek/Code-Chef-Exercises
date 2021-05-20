#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,count,temp,j;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=100000);

		count = 0;
		temp = N;

		int a[N];
		int b[N];
		int c[2002] = {0};

		for(int i=0;i<N;i++){
			scanf("%d %d",&a[i],&b[i]);
			
			assert(a[i]>=0 && a[i]<=b[i]);
			assert(b[i]>=a[i] && b[i]<=2000);

			c[b[i]]++;
		}

		for(int i=0;i<2002;i++){
			if(c[i]!=0){
				count++;
				j = 0;

				for(int k=0;k<temp;k++){
					if(b[k]<i || a[k]>i){
						a[j] = a[k];
						b[j] = b[k];
						j++;
					}else{
						c[b[k]]--;
					}
				}

				temp = j;
			}
		}

		printf("%d\n",count);

		T--;
	}
	
	return 0;
}