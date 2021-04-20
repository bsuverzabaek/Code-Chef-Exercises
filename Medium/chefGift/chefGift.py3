T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=10), "N must be 1 <= N <= 10"

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=-9 and A[i]<=9), "A["+str(i)+"] must be -9 <= A[i] <= 9"

	sol1 = []
	sol2 = []

	sol1.insert(0,A[0])
	sol2.insert(0,A[0])

	for i in range(1,N):
		if (A[i]<0):
			sol1.insert(i,min(sol1[i-1]+A[i],sol2[i-1]*A[i]))
			sol2.insert(i,max(sol2[i-1]-A[i],sol1[i-1]*A[i]))
		else:
			sol1.insert(i,min(sol1[i-1]-A[i],sol1[i-1]*A[i]))
			sol2.insert(i,max(sol2[i-1]+A[i],sol2[i-1]*A[i]))

	print(sol1[N-1])

	T -= 1