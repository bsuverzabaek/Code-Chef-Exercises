#include <stdio.h>
#include <assert.h>
#include <math.h>

int main(void){
	int T,N,len,sq,i,j,kl;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	int a[1000];
	int b[1000];
	int c[1000];

	while(T>0){
		scanf("%d",&N);
		assert(N<=1000000000);

		a[0] = 1;
		b[0] = 0;
		len = 0;

		if(((N+1)&N)!=0){
			sq = (int)sqrt((float)N);

			for(i=1,j=0;i<=sq;i++){
				if((N%(i+1))==i){
					a[j] = i;
					b[j] = 1;
					c[j] = N/(a[j]+1);

					if(a[j]>=c[j]){
						break;
					}

					j++;
				}
			}

			kl = j-1;

			while(kl>=0){
				b[j] = 1;
				a[j] = c[kl];
				j++;
				kl--;
			}

			len = b[0];

			for(i=1;i<j;i++){
				for(int k=i-1;k>=0;k--){
					if((a[i]%(a[k]+1))==a[k]){
						b[i] += b[k];
					}
				}

				len += b[i];
			}
		}else{
			len = N/2;
		}

		printf("%d\n",len+1);

		T--;
	}
	
	return 0;
}