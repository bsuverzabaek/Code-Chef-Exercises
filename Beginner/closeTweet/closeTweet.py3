while (1):
	N,K = map(int,input().split())

	if (N<=0 or N>1000 or K<=0 or K>1000):
		print("N and K must be 1 <= N,K <= 1000")
	else:
		break

tweet = []

while (K>0):

	s = input()

	if (s!="CLOSEALL"):
		if (s not in tweet):
			tweet.append(s)
			print(len(tweet))
		else:
			tweet.remove(s)
			print(len(tweet))
	else:
		tweet = []
		print(len(tweet))

	K -= 1			