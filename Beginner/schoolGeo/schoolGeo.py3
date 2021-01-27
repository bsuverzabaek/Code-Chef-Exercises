T = int(input())
assert(T>=1 and T<=50), "T must be 1 <= T <= 50"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=10000), "N must be 1 <= N <= 10^4"

	A = (list(map(int,input().split())))[:N]
	B = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=1000000000), "A["+str(i)+"] must be 1 <= A[i] <= 10^9"
		assert(B[i]>=1 and B[i]<=1000000000), "B["+str(i)+"] must be 1 <= B[i] <= 10^9"

	A.sort()
	B.sort()

	sum = 0

	for i in range(0,N):
		sum += min(A[i],B[i])

	print(sum)

	T -= 1