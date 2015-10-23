#! usr/bin/pyton3


def multiply(var1=1,var2=1,*args):
	print(str(var1)+" times 2 is {} ".format(var1*2))
	print(str(var2)+" times 2 is {} ".format(var2*2))
	listEx=[var1*2,var2*2]
	print(listEx)
	for i in args:
		listEx.append(i*2)
	return listEx


def main():
	doubles= multiply(1,2,3,4,5,6)
	for i in doubles:
		print(i)



if __name__=="__main__":main()