def diamond(sum):
	evenSum = 0
	oddSum = 0

	while (sum!=0):
		rem = sum%10
		sum //= 10

		if (rem%2==0):
			evenSum += rem
		else:
			oddSum += rem

	return abs(evenSum-oddSum)

size = 1000000

pre = [0]*(2*size+1)
num = [0]*(size+1)

for i in range(1,len(pre)):
	pre[i] = pre[i-1]+diamond(i)

for i in range(1,size+1):
	num[i] = num[i-1]+(pre[2*i-1]-pre[i])*2+diamond(2*i)

T = int(input())
assert(T>=1 and T<=100000), "T must be 1 <= T <= 10^5"

while (T>0):
	N = int(input())
	assert(N>=1 and N<=1000000), "N must be 1 <= N <= 10^6"
	print(num[N])

	T -= 1