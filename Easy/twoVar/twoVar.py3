import math

T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	xf = int(input())
	assert(xf>=1 and xf<=1000000000), "xf must be 1 <= xf <= 10^9"

	count = 0
	X = 1
	Y = 1
	P = 1

	while (1):
		if (X==xf):
			print(count+1)
			break

		if (X>xf):
			print(count)
			break

		count += 1
		P = int(math.sqrt(Y))+1
		X = P
		Y += P*P

	T -= 1