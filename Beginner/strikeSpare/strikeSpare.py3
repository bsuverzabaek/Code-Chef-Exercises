T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

	print("1 1",end='')

	for i in range(0,int(N/2)):
		print("0",end='')

	print("")

	T -= 1