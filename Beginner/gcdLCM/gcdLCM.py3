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

def lcm(A,B):
	gcf = gcd(A,B)

	if (A%gcf==0):
		ans = int(A/gcf)
		ans *= B
		return ans
	else:
		ans = int(B/gcf)
		ans *= A
		return ans

while (1):
	T = int(input())

	if (T<=0 or T>1000):
		print("T must be 1 <= T <= 1000")
	else:
		break

while (T>0):

	while (1):
		A,B = map(int,input().split())

		if (A<=0 or A>1000000 or B<=0 or B>1000000):
			print("A and B must be 1 <= A,B <= 1000000")
		else:
			break

	print(str(gcd(A,B)) + " " + str(lcm(A,B)))
				
	T -= 1		