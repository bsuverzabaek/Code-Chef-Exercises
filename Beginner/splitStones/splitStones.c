#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int compare(const void *a,const void *b){
	return *(int*)a-*(int*)b;
}

int main(void){
	int T,a,b,c,x,y;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d %d %d %d",&a,&b,&c,&x,&y);

		assert(a>=1 && a<=10000000);
		assert(b>=1 && b<=10000000);
		assert(c>=1 && c<=10000000);
		assert(x>=1 && x<=10000000);
		assert(y>=1 && y<=10000000);

		if(x>y){
			int temp = x;
			x = y;
			y = temp;
		}

		int d[3] = {a,b,c};
		qsort(d,3,sizeof(int),compare);

		if(d[0]+d[1]+d[2]!=x+y || d[0]>x || d[1]>y){
			printf("NO\n");
		}else{
			printf("YES\n");
		}

		T--;
	}

	return 0;
}