T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N,K = map(int,input().split())

	assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"
	assert(K>=1 and K<=100000), "K must be 1 <= K <= 10^5"

	B = [0]*100001
	C = input()

	state = 0
	ans = 0

	for i in range(0,N):
		assert(C[i]=='G' or C[i]=='R'), "Each letter must be either G or R"

		if (B[i]!=0):
			state = 1-state

		if ((state==0 and C[i]=='R') or (state==1 and C[i]=='G')):
			B[min(N,i+K)] = 1
			ans += 1
			state = 1-state

	print(ans)

	T -= 1