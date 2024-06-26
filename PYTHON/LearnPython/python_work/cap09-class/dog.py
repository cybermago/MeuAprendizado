# Introducing class metods instancias attributes

class Dog:
    """Simples tentativa de modelar um cachorro"""
    
    def __init__(self, name, age):  # metodos
        """ Inicializa os atributos de nome e idade"""
        self.name = name    # atributos
        self.age = age  # atributos
        
    def sit(self):
        """Simula um cahorro em resposta a um comando"""
        print(f"{self.name} is now sitting")
    
    def roll_over(self):
        """Simula um cachorro rolando em resposta a um comando"""
        print(f"{self.name} rolled over!!")
        
        
my_dog = Dog('Willie', 6)   # instancias
your_dog = Dog('Lucy', 3)   # instancias
my_dog.sit()
my_dog.roll_over()
    
print(f"My dos's name is {my_dog.name}")
print(f"My dog is {my_dog} years old.")
print(f"My dog is {my_dog.age} years old.")
my_dog.sit()
    
print(f"\nYour dog's name is {your_dog.name}")
print(f"Your dog is {your_dog.age} years old.")
your_dog.sit()