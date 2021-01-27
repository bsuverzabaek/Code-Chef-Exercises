T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=2 and N<=100), "N must be 2 <= N <= 100"

	A = []

	for i in range(0,N):
		A.append(list(map(int,input().split()))[:N])

	trace = []

	for i in range(0,N):
		s1 = 0
		s2 = 0
		for j in range(0,i+1):
			s1 += A[j][N+j-i-1]
			s2 += A[N+j-i-1][j]
		trace.append(s1)
		trace.append(s2)

	print(max(trace))

	T -= 1