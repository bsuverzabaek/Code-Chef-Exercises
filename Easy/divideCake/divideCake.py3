T = int(input())
assert(T>=1 and T<=10000), "T must be 1 <= T <= 10000"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=10000), "N must be 1 <= N <= 10000"

	if (360%N==0):
		print("y ",end='')
	else:
		print("n ",end='')
	

	if (N<=360):
		print("y ",end='')
	else:
		print("n ",end='')
	

	if (N*(N+1)/2<=360):
		print("y")
	else:
		print("n")

	T -= 1