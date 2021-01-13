#include <stdio.h>

int top = -1;
char str[500];

void push(char c){
	str[++top] = c;
}

char pop(){
	return str[top--];
}

int order(char o){
	if(o=='('){
		return 0;
	}else if(o=='+' || o=='-'){
		return 1;
	}else if(o=='*' || o=='/' || o=='%'){
		return 2;
	}

	return 3;
}

int main(void){
	int t,i,j;
	char s[401],s2[401],c,x;

	while(1){
		scanf("%d",&t);

		if(t<=0 || t>100){
			printf("t must be 1 <= t < 100\n");
		}else{
			break;
		}
	}

	while(t>0){
		scanf("%s",s);
		
		for(i=0,j=0;s[i]!='\0';i++){
			c = s[i];

			if(c>=97 && c<=122){
				s2[j++] = c;
			}else if(c=='('){
				push(c);
			}else if(c==')'){
				while((x=pop())!='('){
					s2[j++]=x;
				}
			}else{
				while(order(str[top])>=order(c) && top!=-1){
					s2[j++]=pop();
				}
				push(c);
			}
		}

		while(top>=0){
			s2[j++]=pop();
		}

		s2[j] = '\0';
		printf("%s\n",s2);

		t--;
	}

	return 0;
}