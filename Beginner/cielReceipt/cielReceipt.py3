import math

while (1):
	T = int(input())

	if (T<=0 or T>5):
		print("T must be 1 <= T <= 5")
	else:
		break

while (T>0):

	while (1):
		p = int(input())

		if (p<0 or p>100000):
			print("p must be 1 <= p <= 10^5")
		else:
			break

	P = []

	for i in range(0,12):
		P.insert(i,2**i)

	ans = 0

	for i in range(11,-1,-1):
		ans += math.trunc(p/P[i])
		p %= P[i]

	print(ans)
				
	T -= 1			