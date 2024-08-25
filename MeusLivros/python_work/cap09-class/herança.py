class Car:
    
    def __init__(self, modelo, ano):
        self.modelo = modelo
        self.ano = ano
    
    
class EletricCar:
    
    def __init__(self, modelo, ano):
        super().__init__(modelo, ano)   # super() -> chamar class pai