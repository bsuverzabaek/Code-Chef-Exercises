#include <stdio.h>

int main(void){
	int n;

	while(1){
		printf("Input n: ");
		scanf("%d",&n);

		if(n<=0 || n>100000){
			printf("n must be 1 <= n <= 10^5\n");
		}else{
			break;
		}
	}

	while(n>0){
		int v1, v2, v3, t1, t2, t3;

		while(1){
			scanf("%d %d %d %d %d %d",&v1,&t1,&v2,&t2,&v3,&t3);

			if(v1<=0 || v1>1000000 || v2<=0 || v2>1000000 || v3<=0 || v3>1000000){
				printf("Volume must be 1 <= v1,v2,v3 <= 10^6\n");
			}else if(t1<=0 || t1>=t2 || t2<=t1 || t2>1000000){
				printf("Temperature must be 1 <= t1 < t2 <= 10^6\n");
			}else if(t3<=0 || t3>1000000){
				printf("t3 must be 1 <= t3 <= 1000000\n");
			}else{
				break;
			}
		}

		if(v1>=v3*(v1/(v1+v2)) && v2>=v3*(v2/(v1+v2)) && t3==((v1*t1)+(v2*t2))/(v1+v2)){
			printf("YES\n");
		}else if((v1==v3 && t1==t3) || (v2==v3 && t2==t3)){
			printf("YES\n");
		}else{
			printf("NO\n");
		}

		n--;
	}
	
	return 0;
}