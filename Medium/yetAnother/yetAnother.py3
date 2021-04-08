T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	R,B,P = map(int,input().split())

	assert(R>=1 and R<=100000), "R must be 1 <= R <= 100000"
	assert(B>=1 and B<=100000), "B must be 1 <= B <= 100000"
	assert(P>=0 and P<=R+B), "P must be 0 <= P <= R+B"

	ans = (P*R+(R+B-P)*B)/(R+B)
	print("{:.12f}".format(ans))

	T -= 1