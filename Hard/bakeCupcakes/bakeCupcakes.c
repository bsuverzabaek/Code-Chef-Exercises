#include <stdio.h>
#include <assert.h>

int cover(int st,int k,int *use,int *fe,int *se,int m){
	if(st==m){
		return 1;
	}

	if(use[fe[st]]!=0 || use[se[st]]!=0){
		return cover(st+1,k,use,fe,se,m);
	}

	if(k==0){
		return 0;
	}

	use[fe[st]] = 1;

	if(cover(st+1,k-1,use,fe,se,m)!=0){
		return 1;
	}

	use[fe[st]] = 0;
	use[se[st]] = 1;

	if(cover(st+1,k-1,use,fe,se,m)!=0){
		return 1;
	}

	use[se[st]] = 0;
	return 0;
}

int main(void){
	int T,n,m,g;

	scanf("%d",&T);
	assert(T>=1 && T<=30);

	while(T>0){
		scanf("%d %d %d",&n,&m,&g);

		assert(n>=1 && n<=1000);
		assert(m>=1 && m<=20000);
		assert(g>=0 && g<=n);
		assert(n-g<=15);

		int fe[m];
		int se[m];
		int use[1000] = {0};

		for(int i=0;i<m;i++){
			scanf("%d %d",&fe[i],&se[i]);
			assert(fe[i]>=0 && fe[i]<=n-1);
			assert(se[i]>=0 && se[i]<=n-1);
		}

		if(cover(0,n-g,use,fe,se,m)!=0){
			printf("Possible\n");
		}else{
			printf("Impossible\n");
		}

		T--;
	}
	
	return 0;
}