import math

def findPoint(R,K):
	inner = int(math.sqrt(2*R-1))

	if (R-math.sqrt((R-1)*(R-1)+float(inner)*float(inner))<=K/100):
		print(str(int(R-1)) + " " + str(inner))
		return 0

	print(-1)
	return 0

T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	R,K = map(float,input().split())

	assert(R>=2 and R<=1000000000), "R must be 2 <= R <= 10^9"
	assert(K>=1 and K<=99), "K must be 1 <= K <= 99"

	out = findPoint(R,K)

	T -= 1