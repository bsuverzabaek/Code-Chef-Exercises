T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 10^2"

while (T>0):
	N,M = map(int,input().split())

	assert(N>=1 and N<=100), "N must be 1 <= N <= 10^2"
	assert(M>=1 and M<=100), "M must be 1 <= M <= 10^2"

	A = (list(map(int,input().split())))[:N]
	B = (list(map(int,input().split())))[:M]

	for i in range(0,N):
		assert(A[i]>=0 and A[i]<=1000000000), "A["+str(i)+"] must be 0 <= A[i] <= 10^9"

	for i in range(0,M):
		assert(B[i]>=0 and B[i]<=1000000000), "B["+str(i)+"] must be 0 <= B[i] <= 10^9"

	sorted(A)
	sorted(B)

	for i in range(0,N):
		if (A[i]!=0):
			break

	for j in range(0,M):
		if (B[j]!=0):
			break

	if (A[i:]==B[j:]):
		print("Bob")
	else:
		print("Alice")

	T -= 1