while (1):
	T = int(input())

	if (T<=0 or T>100):
		print("T must be 1 <= T <= 100")
	else:
		break

while (T>0):

	while (1):
		n = int(input())

		if (n<=0 or n>100):
			print("n must be 1 <= n <= 100")
		else:
			break

	ans = n

	for i in range(1,n):
		ans *= i

	print(ans)
		
	T -= 1	