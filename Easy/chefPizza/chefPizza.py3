import math

T = int(input())
assert(T>=1 and T<=5), "T must be 1 <= T <= 5"

M = 1000000007

while (T>0):
	ans = 0

	N = int(input())
	assert(N>=1 and N<=10000000000), "N must be 1 <= N <= 10^10"

	x = math.floor(math.sqrt(N))

	for i in range(1,x+1):
		val = i
		val = ((val%M)*((i+math.floor(N//i))%M))%M
		val = ((val%M)*((1+math.floor(N//i)-i)%M))%M

		ans = (ans%M+val%M)%M

	ans = (ans%M-((x*(x+1)*(2*x+1))//6)%M+M)%M
	print(ans)

	T -= 1