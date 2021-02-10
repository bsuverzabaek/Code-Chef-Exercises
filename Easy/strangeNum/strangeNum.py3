import math

T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	X,K = map(int,input().split())

	assert(X>=1 and X<=1000000000), "X must be 1 <= X <= 10^9"
	assert(K>=1 and K<=1000000000), "K must be 1 <= K <= 10^9"

	count = 0

	while (X%2==0):
		count += 1
		X /= 2

	for i in range(3,int(math.sqrt(X)),2):
		while (X%i==0):
			count += 1
			X /= i

	if (X>2):
		count += 1

	if (count>=K):
		print(1)
	else:
		print(0)

	T -= 1