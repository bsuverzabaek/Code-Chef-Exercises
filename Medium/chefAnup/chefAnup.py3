T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N,K,L = map(int,input().split())

	assert(N>=1 and N<=1000), "N must be 1 <= N <= 10^3"
	assert(K>=2 and K<=1000), "N must be 1 <= K <= 10^3"
	assert(L>=1 and L<=1000000000000000000), "L must be 1 <= L <= 10^18"

	a = []

	q = L-1
	i = 0

	while (q>0):
		a.insert(i,q%K)
		i += 1
		q //= K

	while (i<N):
		a.insert(i,0)
		i += 1

	for i in range(N-1,-1,-1):
		print(str(a[i]+1) + ' ',end='')

	print()

	T -= 1