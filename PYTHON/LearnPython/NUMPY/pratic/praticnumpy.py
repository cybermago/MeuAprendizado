# calc numpy
import numpy as np

# create
print("1 - array / 2 - zeros / 3 - ones / 4 - empty / 5 - arange / 6 - linspace")
tipo = int(input("Escolha o tipo de array: "))
io = int(input("numbers:? "))
dim_x = int(input("Dimensão para o eixo X: "))
dim_y = int(input("Dimensão para o eixo Y: "))

active = True
while active:
    if tipo == 1:
        arr = np.array([int(input(f"Digite o valor para o elemento {i + 1}: ")) for i in range(io)]).reshape(dim_x, dim_y)
    elif tipo == 2:
        arr = np.zeros((dim_x, dim_y))
    elif tipo == 3:
        arr = np.ones((dim_x, dim_y))
    elif tipo == 4:
        arr = np.empty((dim_x, dim_y))
    elif tipo == 5:
        arr = np.arange(io).reshape(dim_x, dim_y)
    elif tipo == 6:
        start = float(input("Digite o valor inicial: "))
        stop = float(input("Digite o valor final: "))
        arr = np.linspace(start, stop, io).reshape(dim_x, dim_y)
    else:
        print("Escolha inválida!")
        break
        
    print("Array criado:")
    print(arr)
    
    step = input("Continuar? (1 para sim, 0 para não): ")
    if step != '1':
        active = False
# order
np.sort()
np.concatenate()
# dimensions
arr.ndim()
arr.size()
arr.shape()
#