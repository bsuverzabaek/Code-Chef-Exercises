A = int(input())
B = int(input())
C = input()[0]

assert(A>=-1000 and A<=1000), "A must be -1000 <= A <= 1000"
assert(B>=-1000 and B<=1000), "B must be -1000 <= B <= 1000"
assert(B!=0), "B must not equal 0"
assert(C=='+' or C=='-' or C=='*' or C=='/'), "C must be +, -, *, or /"

if (C=='+'):
	print(A+B)
elif (C=='-'):
	print(A-B)
elif (C=='*'):
	print(A*B)
else:
	print(A/B)