N,M = map(int,input().split())

assert(N>=1 and N<=1000000000), "N must be 1 <= N <= 10^9"
assert(M>=1 and M<=100000), "M must be 1 <= M <= 10^5"

while (M>0):
	q = int(input())
	assert(q>=1 and q<=3*N), "q must be 1 <= q <= 3N"

	if (q>=(N+2) and q<=((2*N)+1)):
		print(q-N-1)
	elif (q>=(2*(N+1)) and q<=(3*N)):
		print((3*N)-q+1)
	else:
		print(0)

	M -= 1