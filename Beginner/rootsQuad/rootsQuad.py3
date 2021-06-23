import math

A = int(input())
B = int(input())
C = int(input())

assert(A>=-1000 and A<=1000), "A must be -1000 <= A <= 1000"
assert(B>=-1000 and B<=1000), "B must be -1000 <= B <= 1000"
assert(C>=-1000 and C<=1000), "C must be -1000 <= C <= 1000"

d = (B*B)-(4*A*C)

x1 = (-B+math.sqrt(d))/(2*A)
x2 = (-B-math.sqrt(d))/(2*A)

print("{:.0f}".format(x1))
print("{:.0f}".format(x2))