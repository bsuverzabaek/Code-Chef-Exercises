import sys

def gcd(A,B):
	if (A==0):
		return B
	elif (B==0):
		return A
	else:
		rem = A%B
		A = B
		B = rem
		return gcd(A,B)

while (1):
	T = int(input())

	if (T<=0 or T>100):
		print("T must be 1 <= T <= 100")
	else:
		break

while (T>0):

	q = list(map(int,input().split()))

	if (q[0]<=1 or q[0]>50):
		print("N must be 2 <= N <= 50")
		sys.exit(0)

	for i in range(1,q[0]+1):
		if (q[i]<=0 or q[i]>1000):
			print("q["+str(i)+"] must be 1 <= q[i] <= 1000")
			sys.exit(0)

	min = q[1]

	for i in range(1,q[0]+1):
		min = gcd(min,q[i])

	for i in range(1,q[0]+1):
		print(str(int(q[i]/min)) + " ",end='')
	print(" ")
					
	T -= 1			