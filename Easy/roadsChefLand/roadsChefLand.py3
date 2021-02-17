T = int(input())
assert(T>=1 and T<=200000), "T must be 1 <= T <= 2*10^5"

while (T>0):
	N = int(input())
	assert(N>=2 and N<=1000000000), "N must be 2 <= N <= 10^9"

	ans = -1
	now = 1

	while (1):
		if (now==N):
			ans = -1
			break
		elif (now>N):
			break
		
		ans += now*((N+now)//(2*now))
		now *= 2

	print(ans)

	T -= 1