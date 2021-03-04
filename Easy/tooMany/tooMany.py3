T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	N,M,K = map(int,input().split())

	assert(N>=2 and N<=1000000000), "N must be 2 <= N <= 10^9"
	assert(M>=2 and M<=1000000000), "M must be 2 <= M <= 10^9"
	assert(K>=2 and K<=1000000000), "K must be 2 <= K <= 10^9"

	if (M>N):
		print(-1)
	else:
		rem = N%M

		if (rem%K==0):
			print(rem//K)
		else:
			print(-1)

	T -= 1