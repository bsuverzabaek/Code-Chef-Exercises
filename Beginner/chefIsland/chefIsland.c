#include <stdio.h>
#include <assert.h>

int main(void){
	int T,x,y,xr,yr,D;
	float a,b;

	scanf("%d",&T);
	assert(T>=1 && T<=300);

	while(T>0){
		scanf("%d %d %d %d %d",&x,&y,&xr,&yr,&D);

		assert(x>=1 && x<=100);
		assert(y>=1 && y<=100);
		assert(xr>=1 && xr<=10);
		assert(yr>=1 && yr<=10);
		assert(D>=1 && D<=10);

		a = x/xr;
		b = y/yr;

		if(a>=D && b>=D){
			printf("YES\n");
		}else{
			printf("NO\n");
		}

		T--;
	}
	
	return 0;
}