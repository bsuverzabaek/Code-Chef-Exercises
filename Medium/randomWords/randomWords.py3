T = int(input())
assert(T>=1 and T<=5), "T must be 1 <= T <= 5"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	a = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(a[i]>=1 and a[i]<1073741824), "a["+str(i)+"] must be 1 <= a[i] <= 2^30"

	sum = 0
	prefSum = 0

	for i in range(0,N):
		prefSum += a[i]
		sum = (sum|a[i])|prefSum

	print(sum)

	T -= 1