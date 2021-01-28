T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 100000"

A = [0]*1000001
A[0] = 1
a = 1

for i in range(1,1000001):
	a = (a*(i+1)) % 1000000007
	A[i] = a - 1

while (T>0):
	N = int(input())
	assert(N>=1 and N<=1000000), "N must be 1 <= N <= 1000000"

	print(A[N])

	T -= 1