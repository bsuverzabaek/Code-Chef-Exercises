#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,x,y;
	char prev;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=1000);

		char S[N];
		scanf("%s",S);

		for(int i=0;i<N;i++){
			assert(S[i]=='L' || S[i]=='R' || S[i]=='U' || S[i]=='D');
		}

		x = 0;
		y = 0;
		prev = S[0];

		for(int i=0;i<N;i++){
			if(i==0){
				if(S[i]=='R'){
					x++;
				}else if(S[i]=='L'){
					x--;
				}else if(S[i]=='U'){
					y++;
				}else if(S[i]=='D'){
					y--;
				}
			}else{
				if(prev=='U' && (S[i]=='U' || S[i]=='D')){
					prev = S[i];
				}else if(prev=='D' && (S[i]=='U' || S[i]=='D')){
					prev = S[i];
				}else if(prev=='L' && (S[i]=='L' || S[i]=='R')){
					prev = S[i];
				}else if(prev=='R' && (S[i]=='L' || S[i]=='R')){
					prev = S[i];
				}else if(prev=='U' && (S[i]!='U' && S[i]!='D')){
					if(S[i]=='R'){
						prev = S[i];
						x++;
					}else{
						prev = S[i];
						x--;
					}
				}else if(prev=='D' && (S[i]!='U' && S[i]!='D')){
					if(S[i]=='R'){
						prev = S[i];
						x++;
					}else{
						prev = S[i];
						x--;
					}
				}else if(prev=='L' && (S[i]!='L' && S[i]!='R')){
					if(S[i]=='U'){
						prev = S[i];
						y++;
					}else{
						prev = S[i];
						y--;
					}
				}else if(prev=='R' && (S[i]!='L' && S[i]!='R')){
					if(S[i]=='U'){
						prev = S[i];
						y++;
					}else{
						prev = S[i];
						y--;
					}
				}
			}
		}

		printf("%d %d\n",x,y);

		T--;
	}

	return 0;
}