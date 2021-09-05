A,B,C = map(int,input().split())

assert(A>=1 and A<=10), "A must be 1 <= A <= 10"
assert(B>=1 and B<=10), "B must be 1 <= B <= 10"
assert(C>=1 and C<=10), "C must be 1 <= C <= 10"

if (A==B or A==C or B==C):
	print("YES")
else:
	print("NO")