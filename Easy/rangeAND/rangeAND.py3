T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	L,R = map(int,input().split())

	mod = 1000000007

	assert(L>=1 and L<=R), "L must be 1 <= L <= R"
	assert(R<=1000000000000000000), "R must be L <= R <= 10^18"

	binL = bin(L)[:1:-1]

	f = 1
	count = 0
	ans = 0

	for i in binL:
		if (i=='1'):
			ans += f*min(f-count,R-L+1)%mod
			count += f
		f *= 2

	print(ans)

	T -= 1