T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

min = 0

while (T>0):
	C,D,L = map(int,input().split())

	assert(C>=0 and C<=1000000000), "C must be 1 <= C <= 10^9"
	assert(D>=0 and D<=1000000000), "D must be 1 <= D <= 10^9"
	assert(L>=0 and L<=1000000000), "L must be 1 <= L <= 10^9"

	if (2*D>=C):
		min = 4*D;
	elif (2*D<C):
		min = 4*(C-D)
	
	if (L<min):
		print("no")
	elif (L%4!=0):
		print("no")
	elif (L>=min and L<=4*(D+C) and L%4==0):
		print("yes")
	else:
		print("no")

	T -= 1