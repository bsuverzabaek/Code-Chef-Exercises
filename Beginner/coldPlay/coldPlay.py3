T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	M,S = map(int,input().split())

	assert(M>=1 and M<=100), "M must be 1 <= M <= 100"
	assert(S>=1 and S<=10), "S must be 1 <= S <= 10"

	print(M//S)

	T -= 1