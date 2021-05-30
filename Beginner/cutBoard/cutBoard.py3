T = int(input())
assert(T>=1 and T<=64), "T must be 1 <= T <= 64"

while (T>0):
	N,M = map(int,input().split())

	assert(N>=1 and N<=8), "N must be 1 <= N <= 8"
	assert(M>=1 and M<=8), "M must be 1 <= M <= 8"

	print((N-1)*(M-1))

	T -= 1