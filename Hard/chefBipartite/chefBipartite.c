#include <stdio.h>
#include <assert.h>

int main(void){
	int T,n,m,d,D,vertex,offset;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d %d %d %d",&n,&m,&d,&D);

		assert(n>=1 && n<=100);
		assert(m>=0 && m<=n*n);
		assert(d>=1 && d<=D);
		assert(D>=d && D<=n);

		if((m/n<d) || (m+n-1)/n>D){
			printf("-1\n");
		}else{
			vertex = 1;
			offset = 0;

			for(int i=0;i<m;i++){
				printf("%d %d\n",vertex,1+(vertex-1+offset)%n);
				vertex++;

				if(vertex>n){
					vertex = 1;
					offset++;
				}
			}
		}

		T--;
	}
	
	return 0;
}