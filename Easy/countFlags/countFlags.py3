T = int(input())
assert(T>=1 and T<=10000), "T must be 1 <= T <= 10000"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=10000), "N must be 1 <= N <= 10000"

	ans = 2*N*(N-1)*(N-1) + N*(N-1)*(N-2) + 2*N*(N-1)*(N-2)*(N-2)
	print(ans)

	T -= 1