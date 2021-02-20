T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	N = int(input())
	assert(N>=2 and N<=100), "N must be 2 <= N <= 100"
	print(N)

	shift = 0

	for i in range(0,N):
		print(N)
		for j in range(0,N):
			r1 = (j+shift)%N;
			r2 = (j+shift+1)%N;

			print(str(j+1) + " " + str(r1+1) + " " + str(r2+1))

		shift += 2

	T -= 1