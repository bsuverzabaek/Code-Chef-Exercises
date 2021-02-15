T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	X,Y = map(int,input().split())

	assert(X>=-1000000000 and X<=1000000000), "X must be -10^9 <= X <= 10^9"
	assert(Y>=-1000000000 and Y<=1000000000), "Y must be -10^9 <= Y <= 10^9"

	abs(X)
	abs(Y)
	ans = min(X,Y)*2

	if (Y>X):
		Y -= X
		ans += (Y//2*4)

		if (Y%2!=0):
			ans += 1
	else:
		X -= Y
		ans += (X//2*4)

		if (X%2!=0):
			ans += 3

	print(ans)

	T -= 1