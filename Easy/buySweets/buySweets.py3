T = int(input())
assert(T>=1 and T<=20), "T must be 1 <= T <= 20"

while (T>0):
	N,X = map(int,input().split())

	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"
	assert(X>=1 and X<=100), "X must be 1 <= X <= 100"

	sum = 0
	f = 0

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=100), "A["+str(i)+"] must be 1 <= A[i] <= 100"
		sum += A[i]

	for i in range(0,N):
		if ((sum-A[i])//X==sum//X):
			print(-1)
			f = 1
			break

	if (f==0):
		print(sum//X)

	T -= 1