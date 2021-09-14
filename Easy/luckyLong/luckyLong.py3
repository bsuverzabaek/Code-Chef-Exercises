T = int(input())
assert(T>=1 and T<=10), "T must be 1 <= T <= 10"

while (T>0):
	N = input()
	flag = 0

	for i in range(0,len(N)):
		if (N[i]!='4' and N[i]!='7'):
			flag += 1

	print(flag)

	T -= 1