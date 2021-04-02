def gcd(A,B):
	if (B==0):
		return A

	return gcd(B,A%B)

def pour(A,B,C):
	move = 1
	a = A
	b = 0

	while (a!=C and b!=C):
		tfr = min(a,B-b)
		b += tfr
		a -= tfr
		move += 1

		if (a==C or b==C):
			break
		
		if (a==0):
			a = A
			move += 1

		if (b==B):
			b = 0
			move += 1
		
	return move

T = int(input())
assert(T>=1 and T<=100), "T must be 1 <= T <= 100"

while (T>0):
	A = int(input())
	assert(A<=40000), "A cannot be more than 40000"

	B = int(input())
	assert(B<=40000), "B cannot be more than 40000"

	C = int(input())
	assert(C<=40000), "C cannot be more than 40000"

	if (C>A and C>B):
		print(-1)
	elif(C%gcd(A,B)!=0):
		print(-1)
	elif(C==A or C==B):
		print(1)
	else:
		print(min(pour(A,B,C),pour(B,A,C)))

	T -= 1