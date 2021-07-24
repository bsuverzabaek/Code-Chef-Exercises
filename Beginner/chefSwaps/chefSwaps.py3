T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	A,B = map(int,input().split())

	assert(A>=1 and A<=99), "A must be 1 <= A <= 99"
	assert(B>=1 and B<=99), "B must be 1 <= B <= 99"

	if (A//10!=0 and B//10!=0):
		num1 = (B%10)*10 + A%10 + (B-B%10)+(A//10)
		num2 = (A%10)*10 + B%10 + (A-A%10)+(B//10)
	elif (A//10==0 and B//10!=0):
		num1 = A*10 + B%10 + B//10
		num2 = 0
	elif (A//10!=0 and B//10==0):
		num1 = B*10 + A%10 + A//10
		num2 = 0
	else:
		num1 = 0
		num2 = 0

	print(max(A+B,max(num1,num2)))

	T -= 1