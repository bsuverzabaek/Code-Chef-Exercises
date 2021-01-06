def sum(A,B):
	return A + B

while (1):
	T = int(input("Input T: "))

	if(T<1 or T>1000):
		print("T must be 1 <= T <= 1000")
	else:
		break

while (T>0):
	while (1):
		A = int(input("Input A: "))

		if(A<0 or A>10000):
			print("A must be 0 <= A <= 10000")
		else:
			break

	while (1):
		B = int(input("Input B: "))

		if(B<0 or B>10000):
			print("B must be 0 <= B <= 10000")
		else:
			break

	print(sum(A,B))

	T -= 1