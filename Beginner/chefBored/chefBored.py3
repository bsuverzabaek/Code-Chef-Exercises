T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=1000), "N must be 1 <= N <= 1000"

	count = 0

	for i in range(1,N+1,2):
		j = N-i+1
		count += (j*j)
	
	print(count)

	T -= 1