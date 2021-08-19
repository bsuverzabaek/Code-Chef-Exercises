N = int(input())
assert(N>=2 and N<=100000), "N must be 2 <= N <= 10^5"

A = (list(map(int,input().split())))[:N]

for i in range(0,N):
	assert(A[i]>=1 and A[i]<=1000000000), "A["+str(i)+"] must be 1 <= A[i] <= 10^9"

A.sort()

i = 0

while (i<N-1):
	if (A[i]!=A[i+1]):
		break

	i += 1

if (i==N-1):
	print(0)
else:
	for i in range(N-2,-1,-1):
		if (A[i]<A[N-1]):
			print(A[i])
			break