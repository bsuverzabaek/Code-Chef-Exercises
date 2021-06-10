T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

sumN = 0

while (T>0):
	N = int(input())
	assert(N>=1 and N<=1000), "N must be 1 <= N <= 10^3"

	sumN += N

	if (T==1):
		assert(sumN>=1 and sumN<=1000), "Sum of N must be 1 <= sumN <= 10^3"

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=1000), "A["+str(i)+"] must be 1 <= A[i] <= 10^3"

	A.sort()

	B = [0]*3
	j = 0

	for i in range(0,N-1):
		if (A[i]==A[i+1]):
			j += 1
			B[j] = A[i]
			i += 1

		if (j==2):
			break

	if (j!=2):
		print(-1)
	else:
		print(B[1]*B[2])

	T -= 1