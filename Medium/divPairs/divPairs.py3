T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 100000"

while (T>0):
	N,M = map(int,input().split())

	assert(N>=1 and N<=1000000000), "N must be 1 <= N <= 10^9"
	assert(M>=2 and M<=1000000000), "M must be 2 <= M <= 10^9"

	a = N//M
	b = N%M

	ans = a*a*(M-1)
	ans += a*(a-1)

	if (M%2==0):
		ans -= a
	
	ans //= 2
	ans += a*b

	if (b>M//2):
		ans += b-M//2

	print(ans)

	T -= 1