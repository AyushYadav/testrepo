# bestGrade=0
# f=open('test.txt')
# for x in f:
# 	# print(x,end='')
# 	name,marks=x.split()
# 	if (int(marks)>bestGrade):
# 		bestGrade=int(marks)
# 		bestStudent=name
# print("\nThe best Student is ",bestStudent)
# f.close()
bestStudent={}
f=open('test.txt')
for x in f:
	name,marks=x.split()
	bestStudent[marks]=name
f.close()
bestStudentStr=''
for i in sorted(bestStudent.keys()):
	print(bestStudent[i]+' scored marks= '+i)
	bestStudentStr+=bestStudent[i]+' scored marks= '+i+'\n'
	# print(bestStudentStr)
bestStudentStr="\n\nThe Student Rankings are :\n\n"+bestStudentStr
fout=open('new_out.txt',mode='w',encoding='utf-8')
fout.write(bestStudentStr)
fout.close()
print('Done\n')
