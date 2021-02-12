T = int(input())
assert(T>=1 and T<=50), "T must be 1 <= T <= 50"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<=30000), "N must be 1 <= N <= 30000"
	assert(K>=0 and K<=30000), "K must be 1 <= K <= 30000"

	A = (list(map(int,input().split())))[:N]
	sum = 0

	for i in range(0,N):
		assert(A[i]==0 or A[i]==1), "A["+str(i)+"] must be either 0 or 1"

		if (A[i]!=0):
			if (i%2!=0 and sum>0):
				sum -= 1
			elif (i%2!=0):
				sum += 1
			elif (sum<0):
				sum -= 1
			else:
				sum += 1

	if(abs(sum)<K):
		print(2)
	else:
		print(1)

	T -= 1