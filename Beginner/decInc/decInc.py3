while (1):
	N = int(input())

	if (N<0 or N>1000):
		print("N must be 0 <= N <= 1000")
	else:
		break

if (N%4==0):
	print(N+1)
else:
	print(N-1)		