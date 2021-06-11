T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=150), "N must be 1 <= N <= 150"

	A = (list(map(int,input().split())))[:N]
	B = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=0 and A[i]<=50), "A["+str(i)+"] must be 0 <= A[i] <= 50"
		assert(B[i]>=0 and B[i]<=50), "B["+str(i)+"] must be 0 <= B[i] <= 50"

	sum = 0
	max = 0

	for i in range(0,N):
		sum = (A[i]*20-B[i]*10)

		if (max<sum):
			max = sum

	print(max)

	T -= 1