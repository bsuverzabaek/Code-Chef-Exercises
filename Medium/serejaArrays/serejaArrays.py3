T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

MOD = 1000000007

while (T>0):
	n,k = map(int,input().split())

	assert(k>=1 and k<=n), "k must be 1 <= k <= n"
	assert(n>=k and n<=100000), "n must be k <= n <= 10^5"

	a = []
	a.insert(0,1)

	for i in range(1,n+1):
		if (i-k>=0):
			a.insert(i,a[i-1]+a[i-k])
		else:
			a.insert(i,a[i-1])

		if (a[i]>=MOD):
			a[i] %= MOD

	print(a[n])

	T -= 1