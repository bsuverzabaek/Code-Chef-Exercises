T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

sumN = 0
sumQ = 0

while (T>0):
	N,Q = map(int,input().split())

	assert(N>=2 and N<=100000), "N must be 2 <= N <= 10^5"
	assert(Q>=1 and Q<=100000), "Q must be 1 <= Q <= 10^5"

	sumN += N
	sumQ += Q

	if (T==1):
		assert(sumN<=500000), "Sum of N must be <=5*10^5"
		assert(sumQ<=500000), "Sum of Q must be <=5*10^5"

	A = (list(map(int,input().split())))[:N-1]
	B = [0]*(N+1)

	for i in range(0,N-1):
		assert(A[i]>=1 and A[i]<=1000000000), "B[i] must be 1 <= B[i] <= 10^9"

	for i in range(1,N):
		B[i+1] = A[i-1]-B[i]

	while (Q>0):
		p,q = map(int,input().split())
		assert(p>=1 and p<=N and q>=1 and q<=N), "p and q must be 1 <= p,q <= N"

		if((p%2==1 and q%2==0) or (p%2==0 and q%2==1)):
			print(B[p]+B[q])
		else:
			print("UNKNOWN")
		
		Q -= 1

	T -= 1