T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=1000), "A["+str(i)+"] must be 1 <= A[i] <= 1000"

		if (i>0):
			assert(A[i]>A[i-1]), "A must be sorted"

	i = 0
	print(A[0],end='')

	while (i<N-1):
		count = 0

		while(i<N-1):
			if (A[i+1]!=A[i]+1):
				break

			i += 1
			count += 1

		if (count==0):
			i += 1

		if (count>=2):
			print("..."+str(A[i]),end='')
		else:
			print(","+str(A[i]),end='')

	print("")

	T -= 1