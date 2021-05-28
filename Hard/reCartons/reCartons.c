#include <stdio.h>
#include <assert.h>

int main(void){
	int N,k,temp,min;

	scanf("%d",&N);
	assert(N>=1 && N<=100000);

	int a[N];
	int b[N];
	int c[N];

	for(int i=0;i<N;i++){
		scanf("%d",&a[i]);
	}

	for(int i=0;i<N;i++){
		scanf("%d",&b[i]);
	}

	for(int i=0;i<N;i++){
		k = 0;

		while(a[i]!=b[k]){
			k++;
		}

		c[i] = k;
	}

	min = 0;

	for(int i=0;i<N-1;i++){
		for(int j=0;j<N-1;j++){
			if(c[j]>c[j+1]){
				temp = c[j];
				c[j] = c[j+1];
				c[j+1] = temp;
				min++;
			}
		}
	}

	printf("%d\n",min);
	
	return 0;
}