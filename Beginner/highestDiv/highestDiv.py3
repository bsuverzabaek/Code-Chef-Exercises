N = int(input())
assert(N>=2 and N<=1000), "N must be 2 <= N <= 1000"

for i in range(10,0,-1):
	if (N%i==0):
		print(i)
		break