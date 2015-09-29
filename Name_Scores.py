n=int(raw_input())
mylist=[]
for i in range(0,n):
	mylist.append(str(raw_input()))

mylist.sort()

q=int(raw_input())

for j in range(0,q):
	sum=0
	myString=str(raw_input())
	for k in range(0,len(myString)):
		sum+=ord(myString[k])-64
	print(((mylist.index(myString))+1)*sum)
