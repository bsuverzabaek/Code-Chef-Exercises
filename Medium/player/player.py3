T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=3000), "N must be 1 <= N <= 3000"

	ans = 0
	nTemp = float(N)

	for i in range(1,N+1):
		ans += nTemp/i

	print("{:.1f}".format(ans))

	T -= 1