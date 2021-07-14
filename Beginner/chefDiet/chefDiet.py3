T = int(input())
assert(T>=1 and T<=200), "T must be 1 <= T <= 200"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"
	assert(K>=1 and K<=1000000), "K must be 1 <= K <= 10^6"

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=1000000), "A["+str(i)+"] must be 1 <= A[i] <= 10^6"

	prt = 0
	flag = 0

	for i in range(1,N+1):
		prt += A[i-1]-K

		if (prt<0):
			flag = i
			break

	if (flag==0):
		print("YES")
	else:
		print("NO" + " " + str(flag))

	T -= 1