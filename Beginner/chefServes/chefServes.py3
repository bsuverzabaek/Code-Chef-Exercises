T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	P1,P2,K = map(int,input().split())

	assert(P1>=0 and P1<=1000000000), "P1 must be 0 <= P1 <= 10^9"
	assert(P2>=0 and P2<=1000000000), "P2 must be 0 <= P2 <= 10^9"
	assert(K>=1 and K<=1000000000), "K must be 1 <= K <= 10^9"

	a = (P1+P2)//K

	if (a%2==0):
		print("CHEF")
	else:
		print("COOK")

	T -= 1