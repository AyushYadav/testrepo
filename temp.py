class Animal:
	def __init__(self, **kwargs):
		self._attributes=kwargs
	def setName(self,key,value):
		self._attributes[key]=value
	def getName(self,key):
		return self._attributes.get(key,None)
	def noise(self):
		print('Agrhhhhhh')
	def move(self):
		print('Moving...')
	def eat(self):
		print('Crunch...Crunching')

# dog=Animal(name='Ganzu')
# dog.noise()
# dog.eat()
# dog.move()
# print(dog.getName('name'))
# dog.setName('Feet',3)
# print(dog.getName('Feet'))

class Dog(Animal):
	def noise(self):
		print('Woof woof')
		# super().noise()

# joy=Dog()
# joy.noise()
# joy.move()

class Cat(Animal):
	def noise(self):
		print("Meow")

def TalkToMe(Animal):
	Animal.noise()
	Animal.eat()

ob1=Cat()
ob2=Dog()
TalkToMe(ob2)
TalkToMe(ob1)