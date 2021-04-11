#include <stdio.h>
#include <assert.h>

int min(int a,int b){
	if(a<b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,n,k,p,i,j,in;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d %d",&n,&k,&p);

		assert(n>=1 && n<=50000000);
		assert(k>=1 && k<=min(500,n));
		assert(p>=1 && p<=min(500,n));

		int a[500];
		int b[500];

		for(i=0;i<k;i++){
			scanf("%d",&in);
			assert(in>=1 && in<=n);

			a[i] = in;

			scanf("%d",&in);
			assert(in>=1 && in<=n);
		}

		for(i=0;i<p;i++){
			scanf("%d",&in);
			assert(in>=1 && in<=n);

			b[i] = in;

			scanf("%d",&in);
			assert(in>=1 && in<=n);
		}

		for(i=0;i<p;i++){
			for(j=0;j<k;j++){
				if(b[i]==a[j]){
					break;
				}
			}

			if(j==k){
				printf("No\n");
				break;
			}
		}

		if(i==p){
			printf("Yes\n");
		}

		T--;
	}
	
	return 0;
}