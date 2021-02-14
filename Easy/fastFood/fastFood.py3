T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

sumN = 0

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"
	sumN += N

	if (T==1):
		assert(sumN<=1000000), "Sum of N must be <= 10^6"

	A = (list(map(int,input().split())))[:N]
	B = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=10000), "A["+str(i)+"] must be 1 <= A[i] <= 10^4"

	sumB = 0

	for i in range(0,N):
		assert(B[i]>=1 and B[i]<=10000), "B["+str(i)+"] must be 1 <= A[i] <= 10^4"
		sumB += B[i]

	ans = sumB

	for i in range(0,N):
		sumB += A[i]-B[i]
		ans = max(ans,sumB)

	print(ans)

	T -= 1