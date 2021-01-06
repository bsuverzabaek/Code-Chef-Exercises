while (1):
	T = int(input("Input T: "))

	if (T<=0 or T>1000):
		print("T must be 1 <= T <= 1000")
	else:
		break

while (T>0):
	while (1):
		A = int(input("Input A: "))

		if (A<=0 or A>180):
			print("A must be 1 <= A <= 1000")
		else:
			break

	while (1):
		B = int(input("Input B: "))

		if (B<=0 or B>180):
			print("B must be 1 <= B <= 1000")
		else:
			break

	while (1):
		C = int(input("Input C: "))

		if (C<=0 or C>180):
			print("C must be 1 <= C <= 1000")
		else:
			break

	if(A+B+C==180):
		print("YES")
	else:
		print("NO")

	T -= 1