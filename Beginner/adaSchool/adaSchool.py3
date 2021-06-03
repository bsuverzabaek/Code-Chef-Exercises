T = int(input())
assert(T>=1 and T<=5000), "T must be 1 <= T <= 5000"

while (T>0):
	N,M = map(int,input().split())

	assert(N>=2 and N<=50), "N must be 2 <= N <= 50"
	assert(M>=2 and M<=50), "M must be 2 <= M <= 50"

	if ((N*M)%2==0):
		print("YES")
	else:
		print("NO")

	T -= 1