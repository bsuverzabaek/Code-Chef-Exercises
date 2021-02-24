#include <stdio.h>
#include <assert.h>

unsigned long long int max(unsigned long long int a,unsigned long long int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

unsigned long long int min(unsigned long long int a,unsigned long long int b){
	if(a<b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T;
	unsigned long long int N,M,X,Y,k,r;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%lld %lld",&N,&M);

		assert(N>=1 && N<=1000000000000000000);
		assert(M>=1 && M<=1000000000000000000);

		X = max(N,M);
		Y = min(N,M);
		k = 0;

		while(1){
			k++;

			if(X==Y){
				printf("Ari\n");
				break;
			}else if(Y==0){
				if(k%2==1){
					printf("Ari\n");
					break;
				}else{
					printf("Rich\n");
					break;
				}
			}else if(X/Y>=2){
				if(k%2==1){
					printf("Ari\n");
					break;
				}else{
					printf("Rich\n");
					break;
				}
			}

			r = X;
			X = Y;
			Y = r%Y;
		}

		T--;
	}
	
	return 0;
}