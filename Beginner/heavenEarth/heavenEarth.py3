import math

T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	N,V1,V2 = map(int,input().split())
	
	assert(N>=1 and N<=100), "N must be 1 <= N <= 100"
	assert(V1>=1 and V1<=100), "V1 must be 1 <= V1 <= 100"
	assert(V2>=1 and V2<=100), "V2 must be 1 <= V2 <= 100"

	if (V2<math.sqrt(2)*V1):
		print("Stairs")
	else:
		print("Elevator")

	T -= 1