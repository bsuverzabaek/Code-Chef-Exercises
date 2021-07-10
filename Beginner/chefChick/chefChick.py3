T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"

	a = (list(map(int,input().split())))[:N]

	for i in range(0,N):
		assert(a[i]>=1 and a[i]<=100000), "a["+str(i)+"] must be 1 <= a[i] <= 10^5"

	print(min(a))

	T -= 1