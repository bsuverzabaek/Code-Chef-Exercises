while (1):
	T = int(input())

	if (T<=0 or T>50):
		print("T must be 1 <= T <= 50")
	else:
		break

while (T>0):

	while (1):
		N = int(input())

		if (N<=0 or N>30):
			print("N must be 1 <= N <= 30")
		else:
			break

	root = 0

	while (N>0):

		while (1):
			id,sum = map(int,input().split())

			if (id<=0 or id>1000):
				print("id must be 1 <= id <= 1000")
			else:
				break

		root += id - sum

		N -= 1

	print(root)

	T -= 1