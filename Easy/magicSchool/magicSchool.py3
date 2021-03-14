T = int(input())
assert(T>=1 and T<=50), "T must be 1 <= T <= 50"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	A = (list(map(int,input().split())))[:N]
	S = set(A)

	for i in range(0,N):
		assert(A[i]>=0 and A[i]<=100000), "Each count must be 0 <= count <= 10^5"

	if (N==1):
		print(-1)
	else:
		if (len(S)==1):
			if (A[0]==0):
				print(N)
			elif (A[0]==N-1):
				print(0)
			else:
				print(-1)
		elif (len(S)>2 or max(A)-min(A)>1):
			print(-1)
		else:
			c = A.count(min(A))
			d = A.count(max(A))

			if (max(A)==c):
				print(d)
			else:
				print(-1)

	T -= 1