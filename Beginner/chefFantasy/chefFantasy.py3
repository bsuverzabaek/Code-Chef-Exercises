T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N,S = map(int,input().split())

	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"
	assert(S>=13 and S<=100), "S must be 13 <= S <= 100"

	P = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(P[i]>=1 and P[i]<=100), "P["+str(i)+"] must be 1 <= P[i] <= 100"

	c = (list(map(int,input().split())))[:N]

	d = 1000
	up = 1000

	for i in range(0,N):
		if (c[i]==0):
			d = min(d,P[i])
		elif (c[i]==1):
			up = min(up,P[i])

	if ((S+up+d)>100):
		print("no")
	else:
		print("yes")

	T -= 1