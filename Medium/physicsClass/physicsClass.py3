T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	ans = 0
	N,F = map(int,input().split())

	assert(N>=1 and N<=10000), "N must be 1 <= N <= 10^3"
	assert(F>=2 and F<=1000000000), "F must be 2 <= F <= 10^9"

	h = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(h[i]>=1 and h[i]<=1000000000), "h["+str(i)+"] must be 1 <= h[i] <= 10^9"

		while (h[i]%F==0):
			h[i] /= F
		
	h.sort()

	y = h[0]
	z = 1

	for i in range(1,N):
		if (h[i]!=y):
			y = h[i]
			z = 0
		
		ans += z
		z += 1

	print(ans)

	T -= 1