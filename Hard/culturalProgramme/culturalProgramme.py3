N = int(input())
assert(N>=1 and N<=100000), "N must be 1 <= N <= 10^5"

max = 0
A = [0]*10000001

while (N>0):
	start,end = map(int,input().split())

	assert(start>=1 and start<=10000000), "The entry time must be 1 <= start <= 10^7"
	assert(end>=1 and end<=10000000), "The exit time must be 1 <= end <= 10^7"

	A[start] += 1
	A[end+1] -= 1

	N -= 1

for i in range(2,10000001):
	A[i] += A[i-1]

	if (max<A[i]):
		max = A[i]

print(max)