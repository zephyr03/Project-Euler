t=int(raw_input())

for x in range(0,t):
	sum=1
	n=long(raw_input())
	for y in range(2,n):
		if(n%y==0):
			sum+=y

	if(sum>n):
		print "YES"
	else:
		print "NO"