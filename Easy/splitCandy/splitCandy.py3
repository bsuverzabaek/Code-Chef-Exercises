T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=0 and N<=8589934591), "N must be 0 <= N <= 2^33 - 1"
	assert(K>=0 and K<=8589934591), "K must be 0 <= K <= 2^33 - 1"

	if (K==0):
		print(str(0) + " " + str(N))
	else:
		print(str(int(N/K)) + " " + str(N%K))

	T -= 1