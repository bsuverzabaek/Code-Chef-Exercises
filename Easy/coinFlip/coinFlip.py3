import math

while (1):
	T = int(input())

	if (T<=0 or T>10):
		print("T must be 1 <= T <= T")
	else:
		break

while (T>0):

	while (1):
		G = int(input())

		if (G<=0 or G>20000):
			print("G must be 1 <= G <= 20000")
		else:
			break

	for g in range(G):
		while (1):
			I,N,Q = map(int, input().split())

			if (N<=0 or N>1000000000):
				print("N must be 1 <= N <= 10^9")
			elif (I<=0 or I>2):
				print("I must be 1 <= I <= 2")
			elif (Q<=0 or Q>2):
				print("Q must be 1<= Q <= 2")
			else:
				break

		if (N%2==0 or I==Q):
			print(math.trunc(N/2))
		else:
			print(math.trunc(N/2)+1)

	T -= 1