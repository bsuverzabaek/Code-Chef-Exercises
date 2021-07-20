T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N,X = map(int,input().split())

	assert(N>=1 and N<=1000), "N must be 1 <= N <= 1000"
	assert(X>=1 and X<=1000000), "X must be 1 <= X <= 1000000"

	c = 0
	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=1000000), "A["+str(i)+"] must be 1 <= A[i] <= 1000000"

		if (A[i]>=X):
			c += 1

	if (c==0):
		print("NO")
	else:
		print("YES")

	T -= 1