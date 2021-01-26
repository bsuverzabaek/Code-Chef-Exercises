T = int(input())
assert(T>=1 and T<=5), "T must be 1 <= T <= 5"

while (T>0):
	N,K,E,M = map(int,input().split())

	assert(K>=1 and K<N and N>K and N<=10000), "N and K must be 1 <= K < N <= 10^4"
	assert(M>=1 and M<=1000000000), "M must be 1 <= M <= 10^9"
	assert(E>=1 and E<=4), "E must be 1 <= E <= 4"

	totals = []

	for i in range(0,N-1):
		tot = list(map(int,input().split()))
		totals.append(sum(tot))

	scores = list(map(int,input().split()))
	y = sum(scores)

	totals.sort()
	x = totals[1]

	if (max(0,x-y+1)>M):
		print("Impossible")
	else:
		print(max(0,x-y+1))

	T -= 1