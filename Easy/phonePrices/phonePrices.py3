T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=7 and N<=100), "N must be 7 <= N <= 100"

	P = (list(map(int,input().split())))[:N]
	count = 0

	for i in range(0,N):
		assert(P[i]>=350 and P[i]<=750), "P["+str(i)+"] must be 350 <= P[i] <= 750"
		good = True

		for j in range(max(i-5,0),i):
			good = good and P[i]<P[j]

		if (good==True):
			count += 1

	print(count)

	T -= 1