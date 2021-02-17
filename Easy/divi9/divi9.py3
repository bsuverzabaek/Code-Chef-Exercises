T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	N = input()
	sum = 0

	for i in range(0,len(N)):
		sum += (ord(N[i])-ord('0'))

	M = sum%9

	if ((len(N)>1 and sum<9) or (M>(9-M))):
		print(9-M)
	else:
		print(M)

	T -= 1