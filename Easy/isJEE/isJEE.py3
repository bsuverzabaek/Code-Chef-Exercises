import math

def value(x,b,c):
	return (x*x+b*x+c)/math.sin(x)

T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 100000"

while (T>0):
	b,c = map(float,input().split())

	assert(b>=1 and b<=20), "b must be 1 <= b <= 20"
	assert(c>=1 and c<=20), "c must be 1 <= c <= 20"

	L = 0
	R = math.pi/2.0

	while (R-L>=1e-6):
		x1 = L+(R-L)/3.0
		x2 = R-(R-L)/3.0

		f1 = value(x1,b,c)
		f2 = value(x2,b,c)

		if (f1>f2):
			L = x1
		else:
			R = x2

	print("{:.10f}".format(value(L,b,c)))

	T -= 1