T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=2 and N<=100), "N must be 2 <= N <= 100"

	A = (list(map(int,input().split())))[:N]
	B = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=1000), "A["+str(i)+"] must be 1 <= A[i] <= 1000"

	for i in range(0,N):
		assert(B[i]>=1 and B[i]<=1000), "B["+str(i)+"] must be 1 <= B[i] <= 1000"

	A.sort()
	B.sort()

	A[N-1] = 0
	B[N-1] = 0

	sum1 = 0
	sum2 = 0

	for i in range(0,N):
		sum1 += A[i]
		sum2 += B[i]

	if (sum1==sum2):
		print("Draw")
	elif (sum2<sum1):
		print("Bob")
	else:
		print("Alice")

	T -= 1