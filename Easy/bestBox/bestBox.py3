import math

T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	P,S = map(int,input().split())

	assert(P>=1 and P<=40000), "P must be 1 <= P <= 40000"
	assert(S>=1 and S<=20000), "S must be 1 <= S <= 20000"

	h = (P-math.sqrt(P*P-24*S))/12
	v = (S/2-h*(P/4-h))*h

	print("{:.2f}".format(v))

	T -= 1