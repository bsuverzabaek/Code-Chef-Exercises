T = int(input())
assert(T>=1 and T<=50), "T must be 1 <= T <= 50"

while (T>0):
	X,Y,K = map(int,input().split())

	assert(X>=0 and X<=1000000000), "X must be 0 <= X <= 10^9"
	assert(Y>=0 and Y<=1000000000), "Y must be 0 <= Y <= 10^9"
	assert(K>=1 and K<=1000000000), "K must be 1 <= K <= 10^9"

	a = (X+Y)//K

	if (a%2==0):
		print("Chef")
	else:
		print("Paja")

	T -= 1