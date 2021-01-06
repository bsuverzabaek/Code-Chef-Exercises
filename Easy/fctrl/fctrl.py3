import math

while (1):
	T = int(input())

	if (T<=0 or T>100000):
		print("T must be 1 <= T <= 100000")
	else:
		break

while (T>0):
	while (1):
		N = int(input())

		if (N<=0 or N>1000000000):
			print("N must be 1 <= N <= 10^9")
		else:
			break

	count = 0
	i = 1

	while (1):
		if(N/(5**i)<1):
			break
		else:
			count += math.trunc(N/(5**i))

		i += 1

	print(count)

	T -= 1