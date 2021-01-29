T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

for t in range(1,T+1):
	N = int(input())
	assert(N>=1 and N<=10000), "N must be 1 <= N <= 10^4"

	A = []
	B = []

	for i in range(0,N):
		x = int(input())
		A.append(x&0xffff)
		B.append(x>>16)

	print("Case " + str(t) + ":")

	for i in range(0,N):
		print(str(A[i]) + " ",end='')

	print("")

	for i in range(0,N):
		print(str(B[i]) + " ",end='')

	print("")