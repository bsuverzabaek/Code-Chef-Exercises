T = int(input())
sumN = 0

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	sumN += N

	if (T==1):
		assert(sumN<=400000), "Sum of N must be <= 4*10^5"

	B = (list(map(int,input().split())))[:N]
	P = (list(map(float,input().split())))[:N]

	for i in range(0,N):
		assert(B[i]>=0 and B[i]<=1000000000), "B["+str(i)+"] must be 1 <= B[i] <= 10^9"
		assert(P[i]>=0 and P[i]<=1), "P["+str(i)+"] must be 1 <= P[i] <= 10^9"

	ans = 0

	for i in range(0,30):
		prob = 0

		for j in range(0,N):
			if ((B[j] & (1<<i))!=0):
				prob = prob*(1-P[j])+(1-prob)*P[j]

		ans += prob*(1<<i)

	print("{:.15f}".format(ans))

	T -= 1