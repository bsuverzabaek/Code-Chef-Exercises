#include <stdio.h>
#include <assert.h>

int main(void){
	int t,m,n,flag;

	scanf("%d",&t);
	assert(t>=1 && t<=10);

	while(t>0){
		scanf("%d %d",&m,&n);

		assert(m>=1 && m<=n);
		assert(n<=1000000000);
		assert(n-m<=100000);

		for(int i=m;i<=n;i++){
			if(i==1 || i==0){
				continue;
			}

			flag = 1;

			for(int j=2;j*j<=i;j++){
				if(i%j==0){
					flag = 0;
					break;
				}
			}

			if(flag==1){
				printf("%d\n",i);
			}
		}
		printf("\n");

		t--;
	}
	
	return 0;
}