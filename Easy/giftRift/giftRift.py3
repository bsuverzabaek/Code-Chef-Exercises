R,C = map(int,input().split())

assert(R>=1 and R<=100), "R must be 1 <= R <= 100"
assert(C>=1 and C<=100), "C must be 1 <= C <= 100"

gift = []

for i in range(0,R):
	row = (list(map(int,input().split())))[:C]
	gift.append(row)

flag = 0
temp1 = []

for i in range(0,C):
	temp = []
	for j in range(0,R):
		temp.append(gift[j][i])
	temp1.append(temp)

for i in range(0,R):
	for j in range(0,C):
		if (gift[i][j]==max(temp1[j]) and gift[i][j]==min(gift[i])):
			flag = 1
			print(gift[i][j])
			break
	if (flag==1):
		break
	
if (flag==0):
	print("GUESS")