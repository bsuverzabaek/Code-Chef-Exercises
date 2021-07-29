T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=120), "N must be 1 <= N <= 120"

	B = input()
	c = 0

	for i in range(0,len(B)):
		assert(B[i]=='0' or B[i]=='1'), "All characters must be 0 or 1"

		if (B[i]=='0'):
			c += 1

	p = 120-c
	x = (p*100)//120

	if (x>=75):
		print("YES")
	else:
		print("NO")

	T -= 1