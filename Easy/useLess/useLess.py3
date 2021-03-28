T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	P,Q,N = map(int,input().split())

	assert((P//Q)>=-100 and (P//Q)<=100), "K must be -100 <= K <= 100"
	assert((P//Q)!=1), "K must not be 1"
	assert(Q>=1 and Q<=10000), "Q must be 1 <= Q <= 10^4"
	assert(N>=1 and N<=1000000), "N must be 1 <= N <= 10^6"

	ans = ((N-1)*Q)//(2*abs(P-Q))+1
	print(ans)

	T -= 1