T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 100000"

	max = -1

	for j in range(0,N):
		i = int(input())
		assert(i>=0 and i<=1000000000), "Height must be 0 <= height <= 10^9"

		if (i>max):
			max = i

	print(max)

	T -= 1