#include <stdio.h>
#include <assert.h>
#include <string.h>

int main(void){
	int T,Q,sum,X,Y;
	char M[100000],N[100000];

	scanf("%d",&T);
	sum = 0;

	while(T>0){
		scanf("%s",M);
		scanf("%s",N);
		scanf("%d",&Q);

		sum += strlen(M)+strlen(N)+Q;

		assert(Q>=1 && Q<=100000);
		assert(sum<=1000000);

		int query[Q][2];

		X = 0;
		Y = 0;

		for(int i=0;i<Q;i++){
			scanf("%d %d",&query[i][0],&query[i][1]);

			assert(query[i][0]>=1 && query[i][0]<=strlen(N));
			assert(query[i][1]>=1 && query[i][1]<=strlen(M));

			if(query[i][0]>X){
				X = query[i][0];
			}

			if(query[i][1]>Y){
				Y = query[i][1];
			}
		}

		int row1[Y+1];
		int col1[X+1];
		int row2[Y+1];
		int col2[X+1];

		if(M[0]=='0' || N[0]=='0'){
			row1[1] = 1;
			col1[1] = 1;
		}else{
			row1[1] = 0;
			col1[1] = 0;
		}

		for(int i=2;i<=Y;i++){
			if(row1[i-1]==1 && M[i-1]=='1'){
				row1[i] = 0;
			}else{
				row1[i] = 1;
			}
		}

		for(int i=2;i<=X;i++){
			if(col1[i-1]==1 && N[i-1]=='1'){
				col1[i] = 0;
			}else{
				col1[i] = 1;
			}
		}

		if(X>1){
			row2[1] = col1[2];

			for(int i=2;i<=Y;i++){
				if(row1[i]==1 && row2[i-1]==1){
					row2[i] = 0;
				}else{
					row2[i] = 1;
				}
			}
		}

		if(Y>1){
			col2[1] = row1[2];

			for(int i=2;i<=X;i++){
				if(col1[i]==1 && col2[i-1]==1){
					col2[i] = 0;
				}else{
					col2[i] = 1;
				}
			}
		}

		for(int i=0;i<Q;i++){
			X = query[i][0];
			Y = query[i][1];

			if(X==1){
				printf("%d",row1[Y]);
			}else if(Y==1){
				printf("%d",col1[X]);
			}else if(Y>X){
				printf("%d",row2[Y-X+2]);
			}else{
				printf("%d",col2[X-Y+2]);
			}
		}

		printf("\n");

		T--;
	}
	
	return 0;
}