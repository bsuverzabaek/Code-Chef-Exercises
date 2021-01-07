import math

def sumFunc(n):
	return math.trunc(n/2) + math.trunc(n/3) + math.trunc(n/4)
	
while (1):
	T = int(input())

	if (T<=0 or T>10):
		print("T must be 1 <= T <= 10")
	else:
		break

while (T>0):

	while (1):
		n = int(input())

		if (n<0 or n>1000000000):
			print("n must be 0 <= n <= 10^9")
		else:
			break

	sum = sumFunc(n)

	if (sum>n):
		print(sum)
	else:
		print(n)

	T -= 1