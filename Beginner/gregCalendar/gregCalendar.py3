T = int(input())
assert(T>=1 and T<=1000), "T must be 1 <= T <= 1000"

while (T>0):
	year = int(input())
	assert(year>=1900 and year<=5000), "year must be 1900 <= year <= 5000"

	startYear = 1900
	diff = year-startYear
	leapYear = 0

	while (startYear<year):
		if (startYear%100==0):
			if (startYear%400==0):
				leapYear += 1
		else:
			if (startYear%4==0):
				leapYear += 1

		startYear += 1

	totalDays = (diff-leapYear)*365+leapYear*366
	day = totalDays%7

	if (day==0):
		print("monday")
	elif (day==1):
		print("tuesday")
	elif (day==2):
		print("wednesday")
	elif (day==3):
		print("thursday")
	elif (day==4):
		print("friday")
	elif (day==5):
		print("saturday")
	elif (day==6):
		print("sunday")

	T -= 1