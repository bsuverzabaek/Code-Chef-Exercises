T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	L = (list(map(int,input().split())))[:N]
	G = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(L[i]>=1 and L[i]<=1000000000), "L["+str(i)+"] must be 1 <= L[i] <= 10^9"

	for i in range(0,N):
		assert(G[i]>=1 and G[i]<=1000000000), "G["+str(i)+"] must be 1 <= G[i] <= 10^9"

	a = 0
	b = 0

	for i in range(0,N):
		if (L[i]<=G[i]):
			a += 1

		if (L[N-i-1]<=G[i]):
			b += 1

	if (a==N and b==N):
		print("both")
	elif (a!=N and b==N):
		print("back")
	elif (a==N and b!=N):
		print("front")
	elif (a!=N and b!=N):
		print("none")

	T -= 1