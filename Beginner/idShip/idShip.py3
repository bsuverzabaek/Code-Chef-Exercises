while (1):
	T = int(input())

	if (T<=0 or T>1000):
		print("T must be 1 <= T <= 1000")
	else:
		break

while (T>0):

	id = input()[0]

	if (id=='B' or id=='b'):
		print("BattleShip")
	elif (id=='C' or id=='c'):
		print("Cruiser")
	elif (id=='D' or id=='d'):
		print("Destroyer")
	elif (id=='F' or id=='f'):
		print("Frigate")
	
	T -= 1		