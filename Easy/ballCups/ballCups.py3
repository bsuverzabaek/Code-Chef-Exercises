T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <=10"

while (T>0):
	N,C,Q = map(int,input().split())

	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"
	assert(C>=1 and C<=N), "C must be 1 <= C <= N"
	assert(Q>=1 and Q<=10000), "Q must be 1 <= Q <= 10^4"

	while (Q>0):
		L,R = map(int,input().split())
		assert(L>=1 and L<=R and R<=N), "L and R must be 1 <= L <= R <= N"

		if (L<=C and C<=R):
			C = L+R-C

		Q -= 1

	print(C)

	T -= 1