T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

sumN = 0

while (T>0):
	N = int(input())
	assert(N>=2 and N<=1000000), "N must be 2 <= N <= 10^6"
	sumN += N

	if (T==1):
		assert(sumN<=3000000), "Sum of N must be <= 3*10^6"

	A = [0]*(N+1)
	x = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(x[i]>=1 and x[i]<=1000000), "Each input must be 1 <= x <= 10^6"
		A[x[i]] += 1

	count = 0

	for i in range(1,N+1):
		for j in range(1,N+1):
			if (A[i]<j):
				break
			else:
				if (A[j]>=i):
					count += 1
				else:
					continue

	print(count)

	T -= 1