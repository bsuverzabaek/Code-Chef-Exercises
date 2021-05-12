T = int(input())
sumN = 0

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	sumN += N

	if (T==1):
		assert(sumN>=1 and sumN<=100000), "Sum of N must be 1 <= sum <= 10^5"

	A = []
	B = []
	M = []

	for i in range(0,N):
		M.insert(i,-1)

	M[0] = 0
	A.insert(0,0)
	B.insert(0,0)

	ai = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(ai[i]>=1 and ai[i]<=1000000000), "All elements must be 1 <= A[i] <= 10^9"
		A.insert(i+1,ai[i])
		B.insert(i+1,B[i]+A[i+1])

	O = 0
	P = 0

	for i in range(1,N+1):
		L = B[i]%N

		if (M[L]==-1):
			M[L] = i
		else:
			O = i
			P = M[L]
			break

	print(O-P)

	for i in range(P+1,O+1):
		print(i,end='')

		if (i!=O):
			print(' ',end='')

		print()

	T -= 1