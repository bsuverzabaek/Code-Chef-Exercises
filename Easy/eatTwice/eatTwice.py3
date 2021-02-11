T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

sumN = 0
sumM = 0

while (T>0):
	N,M = map(int,input().split())

	assert(N>=2 and N<=100000), "N must be 2 <= N <= 10^5"
	assert(M>=2 and M<=100000), "M must be 2 <= M <= 10^5"

	sumN += N
	sumM += M

	if (T==1):
		assert(sumN<=1000000), "Sum of N must not exceed 10^6"
		assert(sumM<=1000000), "Sum of M must not exceed 10^6"

	D = []
	V = []

	m1 = 0
	m2 = 0

	for i in range(0,N):
		di,vi = map(int,input().split())

		assert(di>=1 and di<=M), "D["+str(i)+"] must be 1 <= D[i] <= M"
		assert(vi>=1 and vi<=1000000000), "D["+str(i)+"] must be 1 <= V[i] <= 10^9"

		D.append(di)
		V.append(vi)

		if (V[i]>m1):
			m1 = V[i]
			j = i

	V[j] = 0

	for i in range(0,N):
		if (V[i]>m2 and D[i]!=D[j]):
			m2 = V[i]

	print(m1+m2)

	T -= 1
