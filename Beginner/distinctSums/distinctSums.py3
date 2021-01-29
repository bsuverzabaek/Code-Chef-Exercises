T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	L,R = map(int,input().split())
	assert(L>=1 and L<=R and R<=1000000), "L and R must be 1 <= L <= R <= 10^6"

	print((2*R)-(2*L)+1)

	T -= 1