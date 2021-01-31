A,N,K = map(int,input().split())

assert(A>=0 and A<=1000000000), "A must be 0 <= A <= 10^9"
assert(N>=0 and N<=100), "N must be 0 <= N <= 100"
assert(K>=0 and K<=100), "K must be 0 <= K <= 100"

for i in range(0,K):
	print(str(A%(N+1)) + " ",end='')
	A = int(A/(N+1))

print("")