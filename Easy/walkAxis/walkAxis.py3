T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	ans = 0
	ans = N+(N*(N+1)/2)

	print(int(ans))

	T -= 1