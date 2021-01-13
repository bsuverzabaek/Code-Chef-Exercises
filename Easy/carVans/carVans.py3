while (1):
	T = int(input())

	if (T<=0 or T>100):
		print("T must be 1 <= T <= 100")
	else:
		break

while (T>0):

	while (1):
		N = int(input())

		if (N<=0 or N>10000):
			print("N must be 1 <= N <= 10000")
		else:
			break

	x = (list(map(int,input().split())))[:N]
	ans = 1

	for i in range(1,N):
		if (x[i]-x[i-1]<0):
			ans += 1
		else:
			x[i] = x[i-1]

	print(ans)
		
	T -= 1	