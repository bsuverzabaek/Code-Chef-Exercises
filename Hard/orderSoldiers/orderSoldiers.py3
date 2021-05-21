T = int(input())
assert(T<=50), "T must be <= 50"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=200000), "N must be 1 <= N <= 200000"

	w = (list(map(int,input().split())))[:N]
	num = []

	for i in range(0,N):
		num.insert(i,i+1)

	for i in range(N-1,-1,-1):
		temp = num[i-w[i]]

		for j in range(i-w[i],i):
			num[j] = num[j+1]

		num[i] = temp

	print(*num)

	T -= 1