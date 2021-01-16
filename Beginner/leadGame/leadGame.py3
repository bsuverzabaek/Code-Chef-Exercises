while (1):
	N = int(input())

	if (N<=0 or N>10000):
		print("N must be 1 <= N <= 10000");
	else:
		break

p1 = []
p2 = []

max = 0
sum1 = 0
sum2 = 0

for i in range(0,N):
	while (1):
		p1_i,p2_i = map(int,input().split())

		if (p1_i<=0 or p1_i>1000):
			print("p1["+str(i)+"] must be 1 <= p1[i] <= 1000")
		elif (p2_i<=0 or p2_i>1000):
			print("p2["+str(i)+"] must be 1 <= p2[i] <= 1000")
		else:
			p1.insert(i,p1_i)
			p2.insert(i,p2_i)
			break

	sum1 += p1[i]
	sum2 += p2[i]

	if (abs(sum1-sum2)>max):
		max = sum1-sum2

if (max>0):
	print("1 " + str(abs(max)))
else:
	print("2 " + str(abs(max)))
							