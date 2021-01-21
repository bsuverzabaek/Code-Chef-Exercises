#include <stdio.h>
#include <assert.h>

int main(void){
	int T,A,B;

	scanf("%d",&T);
	assert(T>=1 && T<=1000);

	while(T>0){
		scanf("%d %d",&A,&B);
		assert(A>=1 && A<=1000 && B>=1 && B<=1000);
		
		for(int i=1;i<5000;i++){
			if(i%2==0){
				B -= i;
				if(B<0){
					printf("Limak\n");
					break;
				}
			}else{
				A -= i;
				if(A<0){
					printf("Bob\n");
					break;
				}
			}
		}

		T--;
	}
	
	return 0;
}