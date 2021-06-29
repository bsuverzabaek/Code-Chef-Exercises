T = int(input())
assert(T>=1 and T<=5), "T must be 1 <= T <= 5"

while (T>0):
	A = input()
	assert(len(A)>=1 and len(A)<=100000), "Length of A must be 1 <= |A| <= 10^5"

	bal = 0
	m = 0

	for i in range(0,len(A)):
		if (A[i]=='('):
			bal += 1
		else:
			bal -= 1

		m = max(m,bal)

	for i in range(0,m):
		print("(",end='')

	for i in range(0,m):
		print(")",end='')

	print()

	T -= 1