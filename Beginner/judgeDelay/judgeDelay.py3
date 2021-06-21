T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"

	count = 0

	while (N>0):
		S,J = map(int,input().split())

		assert(S>=1 and S<=J), "S must be 1 <= S <= J"
		assert(J>=S and J<=300), "J must be S <= J <= 300"

		if (J-S>5):
			count += 1

		N -= 1

	print(count)

	T -= 1