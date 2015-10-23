a ,b=1,11
# while a<b:
# 	print(a)
# 	a+=1
# for x in [1,2,3,4,5]:
# 	print(x)
listexample=[1,3,5]
listexample[:]=range(1,201)
for i in listexample:
	if (i%5==0):
		print(i)
	elif(i%3==0):
		print(i)
	else:
		continue
