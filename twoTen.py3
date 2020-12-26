while (1):
	T = int(input("Input T: "))

	if (T<=0 or T>1000):
		print("T must be 1 <= T <= 1000")
	else:
		break

while (T>0):
	while (1):
		X = int(input("Input X: "))

		if (X<0 or X>1000000000):
			print("X must be 0 <= X <= 10^9")
		else:
			break

	if (X%10==0):
		print("0")
	elif (X%5==0):
		print("1")
	else:
		print("-1")

	T -= 1