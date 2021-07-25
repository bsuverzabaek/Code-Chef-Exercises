T = int(input())
assert(T>=1 and T<=15), "T must be 1 <= T <= 15"

while (T>0):
	N,A,B,K = map(int,input().split())

	assert(K>=1 and K<=N), "K must be 1 <= K <= N"
	assert(N<=1000000000000000000), "N must be <= 10^18"
	assert(A>=1 and A<=1000000000), "A must be 1 <= A <= 10^9"
	assert(B>=1 and B<=1000000000), "B must be 1 <= B <= 10^9"

	if (A%B==0):
		count = N//B-N//A
	elif (B%A==0):
		count = N//A-N//B
	else:
		count = N//A+N//B-2*(N//(A*B))

	if (count>=K):
		print("Win")
	else:
		print("Lose")

	T -= 1