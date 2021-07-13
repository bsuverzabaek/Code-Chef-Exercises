T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

sumN = 0

while (T>0):
	N = int(input())
	assert(N>=2 and N<=100000), "N must be 2 <= N <= 10^5"

	sumN += N

	if (T==1):
		assert(sumN<=500000), "Sum of N must be <= 5*10^5"

	v = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(v[i]>=1 and v[i]<=1000000), "v["+str(i)+"] must be 1 <= v[i] <= 10^6"

	v.sort()
	min = 10000000

	for i in range(0,N-1):
		if (v[i+1]-v[i]<=min):
			min = v[i+1]-v[i]

	print(min)

	T -= 1