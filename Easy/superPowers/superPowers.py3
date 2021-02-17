T = int(input())

while (T>0):
	N = int(input())
	assert(N>=1 and N<=600000), "N must be 1 <= N <= 600000"

	mod = 10**9+7
	print(pow(2,2*int(bin(N)[2:]),mod))

	T -= 1