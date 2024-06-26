class Restaurante:
    
    def __init__(self, restaurante_name, cuisine_type):
        self.restaurante_name = restaurante_name
        self.cuisine_type = cuisine_type
    
    def describe_restaurante(self):
        print(f"{self.restaurante_name}")
        print(f"{self.cuisine_type}")
        
    def open_restaurante(self):
        print(f"aberto")


restaurant = Restaurante('pepxan', 'fort')
restaurant.describe_restaurante()
restaurant.open_restaurante()
meu_restaurante = Restaurante('dominos', 'lage')
seu_restaurante = Restaurante('redpizza', 'solid')
meu_restaurante.describe_restaurante()
seu_restaurante.describe_restaurante()
