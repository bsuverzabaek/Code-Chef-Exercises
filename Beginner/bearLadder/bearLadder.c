#include <stdio.h>
#include <assert.h>

int diff(int a,int b){
	return (a>b)?a-b:b-a;
}

int main(void){
	int Q,a,b,s,g;

	scanf("%d",&Q);
	assert(Q>=1 && Q<=1000);

	while(Q>0){
		scanf("%d %d",&a,&b);

		assert(a>=1 && a<=1000000000);
		assert(b>=1 && b<=1000000000);
		assert(a!=b);

		s = (a<b)?a:b;
		g = (a>b)?a:b;

		if(s%2==0 && g%2==0 && diff(a,b)==2){
			printf("YES\n");
		}else if(s%2==1 && g%2==1 && diff(a,b)==2){
			printf("YES\n");
		}else if(s%2==1 && g%2==0 && diff(a,b)==1){
			printf("YES\n");
		}else{
			printf("NO\n");
		}

		Q--;
	}
	
	return 0;
}