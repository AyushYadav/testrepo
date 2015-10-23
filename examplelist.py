
#Tuple Example

# intEx = 1
# print(id(intEx))
# intEx = 2
# print(id(intEx))
# listEx=['Ayush']
# print(id(listEx))
# listEx.append(' Yadav')
# print(id(listEx))
# tupleEx=('Ayush Yadav',101,'G-4','IIT Mandi')
# for i in tupleEx:
# 	print(i)


#List Examples

# listEx=['Ayush',101,'G-4','IIT Mandi']
# print(listEx)
# listEx.append('HP-175001')
# print(listEx)
# listEx.remove("IIT Mandi")
# print(listEx)

# listEx1=['a','o','u','e','i']
# print(listEx1)
# listEx1.sort()
# print(listEx1)
# listEx1.reverse()
# print(listEx1)
# listEx2=[
# 	['a','b','c'],
# 	['d','e','f'],
# 	['g','h','i']]
# print(listEx2)
# print(listEx2[1][2])

dictEx=({"Name":'Ayush Yadav',"Batch":2013,"Branch":'CSE',"Hostel":'Suvalsar'})
print(dictEx)
print(dictEx.get("Branch"))
print(dictEx.values())
print(dictEx.items())
dictEx.pop("Hostel")
print(dictEx)