class Animal:
	def __init__(self,name='No Name'):
		self._name=name
	def setName(self,name='No Name'):
		self._name=name
	def getName(self):
		return self._name
	def noise(self):
		print('Agrhhhhhh')
	def move(self):
		print('Moving...')
	def eat(self):
		print('Crunch...Crunching')

dog=Animal('Terrier')
dog.noise()
dog.eat()
dog.move()
print(dog.getName())
dog.setName('Jimmy')
print(dog.getName())

# Output:
# Agrhhhhhh
# Crunch...Crunching
# Moving...
# None