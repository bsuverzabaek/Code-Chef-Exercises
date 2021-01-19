while (1):
	T = int(input())

	if (T<=0 or T>1000):
		print("T must be 1 <= T <= 1000")
	else:
		break

while (T>0):

	while (1):
		Q,P = map(int,input().split())

		if (Q<=0 or Q>100000 or P<=0 or P>100000):
			print("Q and P must be 1 <= Q,P <= 100000")
		else:
			break

	if (Q>1000):
		total = Q*P
		total -= (Q*P*0.1)
		print("{:.6f}".format(total))
	else:
		print("{:.6f}".format(Q*P))
				
	T -= 1			