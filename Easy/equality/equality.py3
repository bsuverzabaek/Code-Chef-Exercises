T = int(input())
assert(T>=1 and T<=25000), "T must be 1 <= T <= 25000"

sumN = 0

while (T>0):
	N = int(input())
	assert(N>=2 and N<=50000), "N must be 2 <= N <= 50000"
	sumN += N

	if (T==1):
		assert(sumN<=50000), "Sum of N must not be greater than 50000"

	a = (list(map(int,input().split())))[:N]
	sum = 0

	for i in range(0,N):
		assert(a[i]>=1 and a[i]<=5000000000000), "a["+str(i)+"] must be 1 <= a[i] <= 5*10^12"
		sum += a[i]

	sum //= N-1

	for i in range(0,N):
		assert(sum-a[i]>=1 and sum-a[i]<=100000000), "x["+str(i)+"] must be 1 <= x[i] <= 10^8"
		print(str(sum-a[i]) + " ",end='')

	print()

	T -= 1