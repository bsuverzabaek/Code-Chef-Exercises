T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

sumN = 0
sumM = 0

while (T>0):
	N,M = map(int,input().split())

	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"
	assert(M>=1 and M<=100000), "M must be 1 <= M <= 10^5"

	sumN += N
	sumM += M

	if (T==1):
		assert(sumN<=500000), "Sum of N must be <= 5*10^5"
		assert(sumM<=500000), "Sum of M must be <= 5*10^5"

	H = (list(map(int,input().split())))[:N]
	C = (list(map(int,input().split())))[:N]
	F = set()

	for i in range(0,N):
		assert(H[i]>=1 and H[i]<=1000000000), "H["+str(i)+"] must be 1 <= H[i] <= 10^9"			
		assert(C[i]>=1 and C[i]<=M), "C["+str(i)+"] must be 1 <= C[i] <= M"

	max = 0

	for i in range(N-1,-1,-1):
		if (H[i]>max):
			max = H[i]
			F.add(C[i])

	print(len(F))

	T -= 1