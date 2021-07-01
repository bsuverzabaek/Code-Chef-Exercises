T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<1000), "N must be 1 <= N <= 10^3"
	assert(K>=1 and K<=1000000), "K must be 1 <= K <= 10^6"

	s = 0
	a = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(a[i]>=1 and a[i]<=1000000000), "Each element must be 1 <= a <= 10^9"

		s += a[i]

	if (s%2==0 and K==1):
		print("odd")
	else:
		print("even")

	T -= 1