T = int(input())
assert(T>=1 and T<=500), "T must be 1 <= T <= 500"

while (T>0):
	N,P = map(int,input().split())

	assert(N>=1 and N<=500), "N must be 1 <= N <= 500"
	assert(P>=1 and P<=100000000), "P must be 1 <= P <= 10^8"

	s = P//2
	r = P//10
	easy = 0
	hard = 0

	a = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(a[i]>=1 and a[i]<=P), "Number of participants must be 1 <= a <= P"

		if (a[i]>=s):
			easy += 1
		elif (a[i]<=r):
			hard += 1

	if (hard==2 and easy==1):
		print("yes")
	else:
		print("no")

	T -= 1