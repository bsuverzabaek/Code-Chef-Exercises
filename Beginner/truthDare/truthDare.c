#include <stdio.h>
#include <assert.h>

int main(void){
	int T,flag1,flag2;
	int tr,dr,ts,ds;

	scanf("%d",&T);
	assert(T>=1 && T<=100);

	while(T>0){
		scanf("%d",&tr);
		assert(tr>=1 && tr<=100);

		int Tr[tr];

		for(int i=0;i<tr;i++){
			scanf("%d",&Tr[i]);
			assert(Tr[i]>=1 && Tr[i]<=100);
		}

		scanf("%d",&dr);
		assert(dr>=1 && dr<=100);

		int Dr[dr];

		for(int i=0;i<dr;i++){
			scanf("%d",&Dr[i]);
			assert(Dr[i]>=1 && Dr[i]<=100);
		}

		scanf("%d",&ts);
		assert(ts>=1 && ts<=100);

		int Ts[ts];

		for(int i=0;i<ts;i++){
			scanf("%d",&Ts[i]);
			assert(Ts[i]>=1 && Ts[i]<=100);
		}

		scanf("%d",&ds);
		assert(ds>=1 && ds<=100);

		int Ds[ds];

		for(int i=0;i<ds;i++){
			scanf("%d",&Ds[i]);
			assert(Ds[i]>=1 && Ds[i]<=100);
		}

		for(int i=0;i<ts;i++){
			flag1 = 0;
			for(int j=0;j<tr;j++){
				if(Ts[i]==Tr[j]){
					flag1 = 1;
				}
			}
			if(flag1==0){
				break;
			}
		}

		for(int i=0;i<ds;i++){
			flag2 = 0;
			for(int j=0;j<dr;j++){
				if(Ds[i]==Dr[j]){
					flag2 = 1;
				}
			}
			if(flag2==0){
				break;
			}
		}

		if(flag1==0 || flag2==0){
			printf("no\n");
		}else{
			printf("yes\n");
		}

		T--;
	}

	return 0;
}