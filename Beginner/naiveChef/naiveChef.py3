T = int(input())
assert(T>=1 and T<=70), "T must be 1 <= T <= 70"

while (T>0):
	N,A,B = map(int,input().split())

	assert(N>=1 and N<=10000), "N must be 1 <= N <= 10^4"
	assert(A>=1 and A<=N), "A must be 1 <= A <= N"
	assert(B>=1 and B<=N), "B must be 1 <= B <= N"

	r1 = 0
	r2 = 0

	x = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(x[i]>=1 and x[i]<=N), "x["+str(i)+"] must be 1 <= x[i] <= N"

		if (x[i]==A):
			r1 += 1
		

		if (x[i]==B):
			r2 += 1

	flag = (r1/N)*(r2/N)
	print("{:.10f}".format(flag))

	T -= 1