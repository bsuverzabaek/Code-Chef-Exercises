T = int(input())
assert(T>=1 and T<=500), "T must be 1 <= T <= 500"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=500), "N must be 1 <= N <= 500"

	A = input()
	B = input()

	f = -1
	change = 0

	for i in range(0,N):
		if (A[i] == '#' and B[i] == '#'):
			f = 0

			if (change == 1):
				change = 2
			else:
				if (change == 2):
					change = 1
		else:
			if (A[i] == '#'):
				f = 0

				if (change == 2):
					f = 1
					break

				change = 1
			else:
				if (B[i] == '#'):
					f = 0

					if (change == 1):
						f = 1
						break

					change = 2
				else:
					if (f == 0):
						f = 2
						break

	f2 = "yes"

	if (i<N-1):
		for i in range(i,N):
			if (A[i] == '#') or (B[i] == '#'):
				f2 = "no"
				break

	if (f==0):
		print("yes")
	else:
		if (f==1):
			print("no")
		else:
			print(f2)

	T -= 1