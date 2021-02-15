#include <stdio.h>
#include <assert.h>
#include <stdlib.h>

int min(int a,int b){
	if(a<b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,X,Y,ans;

	scanf("%d",&T);
	assert(T>=1 && T<=100000);

	while(T>0){
		scanf("%d %d",&X,&Y);

		assert(X>=-1000000000 && X<=1000000000);
		assert(Y>=-1000000000 && Y<=1000000000);

		X = abs(X);
		Y = abs(Y);
		ans = min(X,Y)*2;

		if(Y>X){
			Y -= X;
			ans += (Y/2*4);

			if(Y%2!=0){
				ans++;
			}
		}else{
			X -= Y;
			ans += (X/2*4);

			if(X%2!=0){
				ans += 3;
			}
		}

		printf("%d\n",ans);

		T--;
	}
	
	return 0;
}