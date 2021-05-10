def findMin(n):
	if (n==0):
		return 0
	else:
		if ((n&1)!=0):
			first = n//2
			last = n//2
		else:
			first = n//2-1
			last = n//2

		return ((n+1)+findMin(first)+findMin(last))

T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N,M = map(int,input().split())

	assert(N>=1 and N<=30), "N must be 1 <= N <= 30"
	assert(M>=1 and M<=1000), "M must be 1 <= M <= 1000"

	min = findMin(N)
	max = N*(N+3)//2

	if (M<min):
		print(-1)
	elif (M>max):
		print(M-max)
	else:
		print(0)

	T -= 1