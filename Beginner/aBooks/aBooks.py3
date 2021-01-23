T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"

	A = list(map(int,input().split()))[:N]
	B = [0]*N

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=1000000), "A["+str(i)+"] must be 1 <= A[i] <= 1000000"

	for i in range(N-2,-1,-1):
		if (A[i]==A[i+1]):
			B[i] = B[i+1]
		else:
			B[i] = N-1-i

	for i in range(0,N):
		print(str(B[i]) + " ",end='')
	print()

	T -= 1