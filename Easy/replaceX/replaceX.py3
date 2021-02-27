T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

sumN = 0

while (T>0):
	N,X,p,k = map(int,input().split())

	assert(p>=1 and p<=N and k>=1 and k<=N), "p and k must be 1 <= p,k <= N"
	assert(X>=0 and X<=1000000000), "X must be 0 <= X <= 10^9"

	sumN += N

	if (T==1):
		assert(sumN<=400000), "Sum of N must be <=4*10^5"

	lct = 0
	xct = 0

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=0 and A[i]<=1000000000), "Each element must be 0 <= A[i] <= 10^9"

		if (A[i]<X):
			lct += 1

		if (A[i]==X):
			xct += 1

	if (p>lct and p<=lct+xct):
		print(0)
	else:
		if ((k>p and lct+1>p) or (k<p and lct+xct<p)):
			print(-1)
		else:
			if (p<=lct):
				print((lct-p+1))
			else:
				print((p-xct-lct))

	T -= 1