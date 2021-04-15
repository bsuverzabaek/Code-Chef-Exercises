T = int(input())
assert(T>=1 and T<=200000), "T must be 1 <= T <= 2*10^5"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<=1000000000000000000), "N must be 1 <= N <= 10^18"
	assert(K>=0 and K<=1000000000), "K must be 0 <= K <= 10^9"

	if (K>=0 and N>2):
		if (K==1 and (N&3)==2):
			N = (N>>1)+1
		else:
			while (K>0 and N>1):
				N = (N+1)>>1
				K -= 1

	prob = 1.0/float(N)
	print("{:.8f}".format(prob))			

	T -= 1