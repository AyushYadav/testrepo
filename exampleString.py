def strex():
	StringVar="This is a sample string for example"
	# for i in StringVar:
	# 	print(i)
	print("\nThe first letter in the string is ", StringVar[0])
	for i in StringVar:
		print(i,end="")
	print("\n")
	string2=""" This is a \
	multiline \
	string """
	print(string2)
	print('This is what he said,\"I will not yeild\"')
	string3="Just another sample string text field for search"
	print(string3.find("text"))
	print(string3[27:31])
	string3=string3.replace('a','s')
	print(string3)
	string4='     Just     some random     space   text    '
	print(string4)
	string4=string4.split()
	print(string4)
	print(type(string4))
	string4=' '.join(string4)
	print(string4)
	print(len(string4))
	string5=r"This is not a normal string \n"
	print(string5)
strex()
