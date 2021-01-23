T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"

	A = [0]*101
	c = 0

	x = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(x[i]>=1 and x[i]<=100), "A["+str(i)+"] must be 1 <= A[i] <= 100"

	for i in range(0,N):
		A[x[i]] += 1

		if (A[x[i]]>c):
			c = A[x[i]]

	print(N-c)

	T -= 1