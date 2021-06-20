R = int(input())
assert(R>=1 and R<=500), "R must be 1 <= R <= 500"

while (R>0):
	L = int(input())
	assert(L>=1 and L<=500), "L must be 1 <= L <= 500"

	S = input()

	a = 0
	f = 0

	for i in range(0,L):
		if (S[i]=='H'):
			a += 1
		
		if (S[i]=='T'):
			a -= 1
		
		if (a<0 or a>1):
			f = 1
			break
		
	if (f==1 or a!=0):
		print("Invalid")
	elif (a==0):
		print("Valid")

	R -= 1