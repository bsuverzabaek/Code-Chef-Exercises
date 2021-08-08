T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=1000000000), "N must be 1 <= N <= 10^9"

	if (N%2==0):
		print(str(2) + " " + str(N//2))
	else:
		print(str(1) + " " + str(N))

	T -= 1