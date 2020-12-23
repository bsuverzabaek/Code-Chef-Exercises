T = int(input("Input T: "))

while(T > 0):
	n = int(input("Input n: "))

	C = [int(input()) for i in range(n)]

	A = [Ci & 0xffff for Ci in C]
	B = [Ci >> 16 for Ci in C]

	print('Case {}:'.format(T))
	print(*A)
	print(*B)

	T -= 1