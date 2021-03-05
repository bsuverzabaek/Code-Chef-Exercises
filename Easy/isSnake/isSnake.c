#include <stdio.h>
#include <assert.h>

int main(void){
	int T,N,count,x;
	int p1,d1,p2,d2,c,l;

	scanf("%d",&T);
	assert(T>=1 && T<=500);

	while(T>0){
		scanf("%d",&N);
		assert(N>=1 && N<=500);

		char plate[2][N+1];

		scanf("%s",plate[0]);
		scanf("%s",plate[1]);

		count = 0;

		for(int i=0;i<2;i++){
			for(int j=0;j<N;j++){
				if(plate[i][j]=='#'){
					count++;
				}
			}
		}

		for(int i=0;i<N;i++){
			x = 0;

			if(plate[x][i]=='#'){
				l = i;
				break;
			}

			x = 1;

			if(plate[x][i]=='#'){
				l = i;
				break;
			}
		}

		p1 = x;
		d1 = 1-x;
		p2 = 1-x;
		d2 = x;
		c = 0;

		for(int i=l;i<N;i++){
			if(plate[p1][i]=='#'){
				c++;
			}else{
				break;
			}

			if(plate[p2][i]=='#'){
				c++;
				p1 = 1-p1;
				p2 = 1-p2;
			}
		}

		if(plate[d1][l]=='#' && plate[d2][l]=='#' && c!=count){
			c = 0;

			for(int i=l;i<N;i++){
				if(plate[d1][i]=='#'){
					c++;
				}else{
					break;
				}

				if(plate[d2][i]=='#'){
					c++;
					d1 = 1-d1;
					d2 = 1-d2;
				}
			}
		}

		if(c==count && c!=0){
			printf("yes\n");
		}else{
			printf("no\n");
		}

		T--;
	}
	
	return 0;
}