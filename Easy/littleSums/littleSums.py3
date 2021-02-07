T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	A = (list(map(int,input().split())))[:N]
	m = 100000

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=100000), "A["+str(i)+"] must be 1 <= A[i] <= 10^5"
		m = min(m,A[i])

	for i in range(0,N):
		if (A[i]==m):
			print(i+1)
			break

	T -= 1