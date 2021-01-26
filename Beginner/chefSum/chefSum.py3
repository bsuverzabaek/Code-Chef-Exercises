T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=2 and N<=10000), "N must be 2 <= N <= 10^4"
	assert(K>=1 and K<=1000000000), "K must be 1 <= K <= 10^9"

	A = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(A[i]>=1 and A[i]<=1000000000), "A["+str(i)+"] must be 1 <= A[i] <= 10^9"

	flag = 0

	for i in range(0,N-1):
		for j in range(i+1,N):
			if (A[i]+A[j]==K):
				flag = 1
				break
		if (flag==1):
			break

	if (flag==1):
		print("Yes")
	else:
		print("No")

	T -= 1