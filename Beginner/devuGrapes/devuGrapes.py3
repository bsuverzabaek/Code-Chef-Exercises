T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"
	assert(K>=1 and K<=1000000000), "K must be 1 <= K <= 10^9"

	count = 0
	rem = 0
	a = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(a[i]>=1 and a[i]<=1000000000), "Number of grapes must be 1 <= g <= 10^9"

		if (a[i]//K==0):
			count += (K-a[i])
		else:
			rem = a[i]%K		
		
		if (rem<=K//2):
			count += rem
		else:
			count += (K-rem)

	print(count)

	T -= 1