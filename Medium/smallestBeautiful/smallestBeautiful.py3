import math

T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

sumN = 0

while (T>0):
	N = int(input())
	assert(N>=1 and N<=1000000), "N must be 1 <= N <= 10^6"

	sumN += N

	if (T==1):
		assert(sumN<=1000000), "Sum of N must be <= 10^6"

	a = []

	for i in range(0,N):
		a.insert(i,1)

	sum = N
	index = N-1

	while (1):
		x = int(math.sqrt(sum))

		if (x*x==sum):
			break
		
		while (a[index]==9):
			index -= 1
		
		sum -= a[index]*a[index]
		a[index] += 1
		sum += a[index]*a[index]

		for i in range(index+1,N):
			sum -= a[i]*a[i]
			a[i] = a[index]
			sum += a[i]*a[i]

		while (index+1!=N):
			index += 1
			sum -= a[index]*a[index]
			a[index] = a[index-1]
			sum += a[index]*a[index]
		
	for i in range(0,N):
		print(a[i],end='')

	print()

	T -= 1