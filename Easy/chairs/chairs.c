#include <stdio.h>
#include <assert.h>

int max(int a,int b){
	if(a>b){
		return a;
	}else{
		return b;
	}
}

int main(void){
	int T,N,sumN,count,flag,con,len;

	scanf("%d",&T);
	assert(T>=1 && T<=5000);

	sumN = 0;

	while(T>0){
		scanf("%d",&N);
		sumN += N;

		if(T==1){
			assert(sumN>=1 && sumN<=1000000);
		}

		char chairs[N];
		scanf("%s",chairs);

		count = 0;
		flag = 0;

		for(int i=0;i<N;i++){
			if(chairs[i]=='0'){
				count++;
			}

			if(chairs[i]=='1'){
				flag = 1;
			}
		}

		assert(flag==1);
		con = 0;

		for(int i=0;i<N;i++){
			if(chairs[i]=='0' && chairs[(i+N-1)%N]=='1'){
				len = 1;

				while(chairs[(i+1)%N]=='0'){
					len++;
					i++;
				}

				con = max(con,len);
			}
		}

		printf("%d\n",count-con);

		T--;
	}
	
	return 0;
}