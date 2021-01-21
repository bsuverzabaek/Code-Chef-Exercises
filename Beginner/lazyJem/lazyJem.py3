T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N,B,M = map(int,input().split())
	assert(N>=1 and N<=100000000), "N must be 1 <= N <= 10^8"
	assert(B>=1 and B<=100000000), "B must be 1 <= B <= 10^8"
	assert(M>=1 and M<=100000000), "M must be 1 <= M <= 10^8"

	ans = 0

	while (N>0):
		prob = int((N+1)/2)
		ans += prob * M
		N -= prob

		if (N!=0):
			ans += B

		M *= 2

	print(ans)

	T -= 1